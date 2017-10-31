package pl.com.redpike.NoteKeeper.webapp.control.home;

import org.springframework.stereotype.Component;
import pl.com.redpike.NoteKeeper.webapp.presentation.abstracts.AbstractPresenter;
import pl.com.redpike.NoteKeeper.webapp.presentation.views.home.HomeView;

@Component
public class HomePresenter extends AbstractPresenter<HomeView> {

    public String getWelcomeMessage() {
        return "Welcome in NoteKeeper";
    }
}
