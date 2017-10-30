package pl.com.redpike.NoteKeeper.business.user;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.com.redpike.NoteKeeper.business.enums.YesNoEnum;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Before
    public void init() {
        User user1 = new User();
        user1.setId(2);
        user1.setLogin("jc1");
        user1.setPassword("dasdsad");
        user1.setPassword2("Dsadasdsadsa");
        user1.setEmail("test@test.test");
        user1.setIsBlocked(YesNoEnum.getEnum("n"));
        user1.setIsDeleted(YesNoEnum.getEnum("n"));
        userRepository.save(user1);
    }

    @Test
    public void getUserByLogin() {
        User user = userRepository.findUserByLogin("jc1");
        assertNotNull(user);
    }
}