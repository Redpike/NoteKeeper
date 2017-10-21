package pl.com.redpike.NoteKeeper.presentation.page;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import pl.com.redpike.NoteKeeper.presentation.component.menu_item.MenuItem;

import javax.annotation.PostConstruct;

@SpringView(name = HomePage.VIEW_ID)
@MenuItem(name = "Home", viewId = HomePage.VIEW_ID, icon = VaadinIcons.HOME_O, order = 1)
public class HomePage extends VerticalLayout implements View {

    public static final String VIEW_ID = "home";

    @PostConstruct
    public void init() {
        setMargin(false);
        addComponent(new Label("Home View"));
    }

    @Override
    public void enter(ViewChangeEvent event) {

    }
}
