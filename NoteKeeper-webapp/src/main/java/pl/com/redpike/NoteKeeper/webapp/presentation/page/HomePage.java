package pl.com.redpike.NoteKeeper.webapp.presentation.page;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;
import pl.com.redpike.NoteKeeper.webapp.presentation.component.menu_item.MenuItem;
import pl.com.redpike.NoteKeeper.webapp.control.home.HomePresenter;
import pl.com.redpike.NoteKeeper.webapp.presentation.views.home.HomeView;

import javax.annotation.PostConstruct;

@SpringView(name = HomePage.VIEW_ID)
@MenuItem(name = "Home", viewId = HomePage.VIEW_ID, icon = VaadinIcons.HOME_O, order = 1)
public class HomePage extends VerticalLayout implements View {

    public static final String VIEW_ID = "home";

    @Autowired
    private HomePresenter homePresenter;

    @PostConstruct
    public void init() {
        setMargin(false);
        addComponent(new HomeView(homePresenter));
    }

    @Override
    public void enter(ViewChangeEvent event) {

    }
}
