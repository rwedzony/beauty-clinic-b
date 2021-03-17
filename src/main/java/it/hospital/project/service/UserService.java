package it.hospital.project.service;

import it.hospital.project.appusers.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    void addUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    List<User> getAllUsers();

}
