package pl.com.redpike.NoteKeeper.presentation.home;

import com.vaadin.ui.Label;
import pl.com.redpike.NoteKeeper.presentation.abstracts.AbstractView;

public class HomeView extends AbstractView<HomePresenter> {

    public HomeView(HomePresenter homePresenter) {
        super(homePresenter);
        addComponent(new Label(getPresenter().getWelcomeMessage()));
    }
}
