package com.ITSI.itsiweb.controllers.users;

import com.ITSI.itsiweb.entities.users.User;
import com.ITSI.itsiweb.services.users.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public void saveUser(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping("/user/{username}")
    public User getUserByUsername(@PathVariable("username")String username){
        return userService.findBy(username);
    }
}
