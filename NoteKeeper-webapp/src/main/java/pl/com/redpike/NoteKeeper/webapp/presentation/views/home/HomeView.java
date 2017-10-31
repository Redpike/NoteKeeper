package pl.com.redpike.NoteKeeper.webapp.presentation.views.home;

import com.vaadin.ui.Label;
import pl.com.redpike.NoteKeeper.webapp.control.home.HomePresenter;
import pl.com.redpike.NoteKeeper.webapp.presentation.abstracts.AbstractView;

public class HomeView extends AbstractView<HomePresenter> {

    public HomeView(HomePresenter homePresenter) {
        super(homePresenter);
        addComponent(new Label(getPresenter().getWelcomeMessage()));
    }
}
