package pl.com.redpike.NoteKeeper.presentation.home;

import org.springframework.stereotype.Component;
import pl.com.redpike.NoteKeeper.presentation.abstracts.AbstractPresenter;

@Component
public class HomePresenter extends AbstractPresenter<HomeView> {

    public String getWelcomeMessage() {
        return "Welcome in NoteKeeper";
    }
}
