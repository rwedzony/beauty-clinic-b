package it.hospital.project.service.serviceImpl;

import it.hospital.project.appusers.User;
import it.hospital.project.repository.UserRepository;
import it.hospital.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Autowired
    UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(int id) {
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public List<User> getAllUsers() {
       return userRepository.findAll();
    }
}
