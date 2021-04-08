package it.hospital.project.appusers;


import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @After
    public void tearDown() {
        userRepository.deleteAll();
    }

    @Test
    public void testSaveUserAndFindById() {

        var user = new User ("12312312311","Adam","Boski","519643353","Kaczynska 22","Gdynia","00=000","maja@wp.pl","test123");
        userRepository.save(user);
        var maybeUser = userRepository.findById(1);
        assertThat(maybeUser,is(Optional.of(user)));

    }
}
