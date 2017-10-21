package pl.com.redpike.NoteKeeper.presentation.page;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import pl.com.redpike.NoteKeeper.presentation.component.menu_item.MenuItem;

import javax.annotation.PostConstruct;

@SpringView(name = TestPage.VIEW_ID)
@MenuItem(name = "Test", viewId = TestPage.VIEW_ID, icon = VaadinIcons.ALARM, order = 2)
public class TestPage extends VerticalLayout implements View {

    public static final String VIEW_ID = "test";

    @PostConstruct
    public void init() {
        setMargin(false);
        addComponent(new Label("Test View"));
    }

    @Override
    public void enter(ViewChangeEvent event) {

    }
}
