package it.hospital.project.appusers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
public class UserController {

    UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    ResponseEntity<?> getAllUsers() {
        List<User> users= new ArrayList<>(3);
        users.add(new User(1,"123123123","Marek","Gladysz","345263743","Zapo",
                "Krakow","30-124","marek@example.pl","flkhsakjfsjkdsff"));
        users.add(new User(2,"123123123","Marceli","Grzesik","345263743","Lea",
                "Warszawa","22-124","marceli@example.pl","ffdsjklnsdlkfnlkdsf"));
        users.add(new User(3,"123123123","Janina","Nowak","345263743","Mickiewicza",
                "Gdansk","43-124","janina@example.pl","fsdfdssdf"));
        return new ResponseEntity<>(users, HttpStatus.OK);
    }




    @PostMapping
    ResponseEntity<?> addUser(User user) {
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.OK);
    }
}
