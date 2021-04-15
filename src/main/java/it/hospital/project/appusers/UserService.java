package it.hospital.project.appusers;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;


    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void addUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(int id) {
        // TODO: need to implement deleting of a user from the app database
    }



    public void updateUser(User user) {
        // TODO: need to implement updating of a user from the app database
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
