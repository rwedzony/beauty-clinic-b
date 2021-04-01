package it.hospital.project.appusers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void addUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(int id) {
    }


    public void updateUser(User user) {

    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
