package pl.com.redpike.NoteKeeper.business.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByLogin(String login);
}
