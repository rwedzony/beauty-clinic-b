package it.hospital.project.appusers;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    UserRepository userRepository;


    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User addUser(User user) {

        return userRepository.save(user);
    }

    public void deleteUser(int id) {
        Optional<User> user = userRepository.findById(id);
        user.ifPresent(t->userRepository.delete(t));
    }



    public void updateUser(User user) {
        // TODO: need to implement updating of a user from the app database
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
