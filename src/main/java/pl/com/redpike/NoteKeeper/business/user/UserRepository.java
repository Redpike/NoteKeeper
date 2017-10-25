package pl.com.redpike.NoteKeeper.business.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface UserRepository extends CrudRepository<User, Integer> {

    User findUserByLogin(String login);
}
