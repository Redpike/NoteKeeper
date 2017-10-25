package pl.com.redpike.NoteKeeper.business.user;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Before
    public void init() {
        User user1 = new User();
        user1.setId(1);
        user1.setLogin("rs3");
        user1.setPassword("asdasa");
        userRepository.save(user1);
    }

    @Test
    public void getUserByLogin() {
        User user = userRepository.findUserByLogin("rs3");
        assertNotNull(user);
    }
}