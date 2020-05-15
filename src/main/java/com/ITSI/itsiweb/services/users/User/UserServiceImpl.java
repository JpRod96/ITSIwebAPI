package com.ITSI.itsiweb.services.users.User;

import com.ITSI.itsiweb.entities.users.Role;
import com.ITSI.itsiweb.entities.users.User;
import com.ITSI.itsiweb.repositories.users.RoleRepository;
import com.ITSI.itsiweb.repositories.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.ITSI.itsiweb.utils.RoleAuthorizationConstants.STUDENT_ROLE;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        Role studentRole = roleRepository.findByName(STUDENT_ROLE);
        List<Role> roles = new ArrayList<>();
        roles.add(studentRole);
        user.setRoles(roles);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
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
