package com.ITSI.itsiweb.controllers.users;

import com.ITSI.itsiweb.entities.users.User;
import com.ITSI.itsiweb.services.users.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ITSI.itsiweb.utils.RoleAuthorizationConstants.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PreAuthorize(ADMINISTRATOR)
    @PostMapping("/user")
    public void saveUser(@RequestBody User user) {
        userService.save(user);
    }

    @PreAuthorize(ADMINISTRATOR + OR + STUDENT)
    @GetMapping("/user/{username}")
    public User getUserByUsername(@PathVariable("username")String username){
        return userService.findBy(username);
    }

    @PreAuthorize(STUDENT)
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.listAllUsers();
    }
}
