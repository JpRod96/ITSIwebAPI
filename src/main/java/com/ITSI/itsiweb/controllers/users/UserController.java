package com.ITSI.itsiweb.controllers.users;

import com.ITSI.itsiweb.entities.users.User;
import com.ITSI.itsiweb.services.users.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.ITSI.itsiweb.utils.RoleAuthorizationConstants.*;
import static com.ITSI.itsiweb.utils.WebPathsConstants.USER_PATH;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PreAuthorize(ADMINISTRATOR + OR + SECRETARY)
    @PostMapping(USER_PATH)
    public void saveUser(@RequestBody User user) {
        userService.save(user);
    }

    @PreAuthorize(ADMINISTRATOR + OR + STUDENT + OR + ACCOUNTANT + OR + AUXILIARY_ACCOUNTANT + OR + SECRETARY)
    @GetMapping(USER_PATH)
    public User getLoggedUser(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return userService.findBy(auth.getName());
    }

    @PreAuthorize(ADMINISTRATOR)
    @GetMapping(USER_PATH + "/all")
    public List<User> getAllUsers(){
        return userService.listAllUsers();
    }
}