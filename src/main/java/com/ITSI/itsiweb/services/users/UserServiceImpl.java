package com.ITSI.itsiweb.services.users;

import com.ITSI.itsiweb.entities.users.User;
import com.ITSI.itsiweb.repositories.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findBy(String username){
        return userRepository.findByUsername(username);
    }

    @Override
    public User findBy(long id){
        return userRepository.findById(id);
    }

    @Override
    public List<User> listAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public void update(User user){
        userRepository.save(user);
    }
}
