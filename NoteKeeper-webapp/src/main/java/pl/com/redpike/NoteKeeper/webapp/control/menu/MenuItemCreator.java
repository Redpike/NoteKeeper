package pl.com.redpike.NoteKeeper.webapp.control.menu;

import com.google.common.collect.Lists;
import com.vaadin.ui.UI;
import com.vaadin.ui.themes.ValoTheme;
import org.reflections.Reflections;
import pl.com.redpike.NoteKeeper.webapp.config.RedpikeTheme;
import pl.com.redpike.NoteKeeper.webapp.presentation.component.menu_item.MenuItem;
import pl.com.redpike.NoteKeeper.webapp.presentation.component.menu_item.MenuItemButton;

import java.lang.annotation.Annotation;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class MenuItemCreator {

    private static final String PAGES_PACKAGE = "pl.com.redpike.NoteKeeper.webapp.presentation.page";

    private MenuItemCreator() {
    }

    public static List<MenuItemButton> makeMenuItemButtons() {
        List<MenuItemButton> menuItemButtonList = Lists.newArrayList();
        Reflections reflections = new Reflections(PAGES_PACKAGE);
        Set<Class<?>> annotatedClasses = reflections.getTypesAnnotatedWith(MenuItem.class);
        annotatedClasses.forEach(aClass -> {
            Annotation annotation = aClass.getAnnotation(MenuItem.class);
            MenuItem menuItem = (MenuItem) annotation;
            MenuItemButton button = new MenuItemButton()
                    .withOrder(menuItem.order())
                    .withCaption(menuItem.name())
                    .withIcon(menuItem.icon())
                    .withStyleName(ValoTheme.BUTTON_SMALL, ValoTheme.BUTTON_BORDERLESS, RedpikeTheme.MENU_ITEM)
                    .withListener(clickEvent -> UI.getCurrent().getNavigator().navigateTo(menuItem.viewId()));
            menuItemButtonList.add(button);
        });

        menuItemButtonList.sort(Comparator.comparing(MenuItemButton::getOrder));

        return menuItemButtonList;
    }
}
