package com.ITSI.itsiweb.services.users.User;

import com.ITSI.itsiweb.entities.users.User;

import java.util.List;

public interface UserService {
    void save(User user);
    User findBy(String username);
    User findBy(long id);
    List<User> listAllUsers();
    void update(User user);
}
