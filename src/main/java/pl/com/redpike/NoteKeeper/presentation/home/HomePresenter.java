package pl.com.redpike.NoteKeeper.presentation.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.com.redpike.NoteKeeper.business.user.User;
import pl.com.redpike.NoteKeeper.business.user.UserRepository;

@Component
public class HomePresenter {

    @Autowired
    private UserRepository userRepository;

    public String getWelcomeMessage() {
        return "Welcome in NoteKeeper";
    }

    public User getUserByLogin(String login) {
        return userRepository.findUserByLogin(login);
    }
}
