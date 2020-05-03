package com.ITSI.itsiweb.controllers.users;

import com.ITSI.itsiweb.entities.users.User;
import com.ITSI.itsiweb.services.users.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
    @PostMapping("/user")
    public void saveUser(@RequestBody User user) {
        userService.save(user);
    }

    @PreAuthorize("hasRole('ROLE_STUDENT')")
    @GetMapping("/user/{username}")
    public User getUserByUsername(@PathVariable("username")String username){
        return userService.findBy(username);
    }

    @PreAuthorize("hasRole('ROLE_ADMINISTRATOR')")
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.listAllUsers();
    }
}
