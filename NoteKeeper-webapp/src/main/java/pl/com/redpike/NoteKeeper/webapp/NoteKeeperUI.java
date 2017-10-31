package pl.com.redpike.NoteKeeper.webapp;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.SpringViewDisplay;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;
import pl.com.redpike.NoteKeeper.webapp.config.RedpikeTheme;
import pl.com.redpike.NoteKeeper.webapp.presentation.component.ApplicationLayout;
import pl.com.redpike.NoteKeeper.webapp.presentation.page.HomePage;

@SpringUI
@SpringViewDisplay
@Theme(RedpikeTheme.THEME_NAME)
public class NoteKeeperUI extends UI implements ViewDisplay {

    private ApplicationLayout applicationLayout;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        applicationLayout = new ApplicationLayout();
        setContent(applicationLayout);
        UI.getCurrent().getNavigator().navigateTo(HomePage.VIEW_ID);
    }

    @Override
    public void showView(View view) {
        applicationLayout.getApplicationMenuContentLayout().getContentLayout().removeAllComponents();
        applicationLayout.getApplicationMenuContentLayout().getContentLayout().addComponent((Component) view);
    }
}
