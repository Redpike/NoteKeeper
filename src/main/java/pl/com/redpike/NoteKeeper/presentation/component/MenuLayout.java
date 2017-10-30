package pl.com.redpike.NoteKeeper.presentation.component;

import com.vaadin.ui.Alignment;
import com.vaadin.ui.VerticalLayout;
import pl.com.redpike.NoteKeeper.config.RedpikeTheme;
import pl.com.redpike.NoteKeeper.control.menu.MenuItemCreator;
import pl.com.redpike.NoteKeeper.presentation.component.menu_item.MenuItemButton;

import java.util.List;

public class MenuLayout extends VerticalLayout {

    private List<MenuItemButton> menuItemButtonList;

    public MenuLayout() {
        initComponents();
        initLayout();
    }

    private void initComponents() {
        setMargin(false);
        setSpacing(true);
        addStyleName(RedpikeTheme.MENU_CONTAINER);
        menuItemButtonList = MenuItemCreator.makeMenuItemButtons();
    }

    private void initLayout() {
        setWidth(200, Unit.PIXELS);
        menuItemButtonList.forEach(component -> {
            addComponent(component);
            setComponentAlignment(component, Alignment.MIDDLE_CENTER);
        });
    }
}
