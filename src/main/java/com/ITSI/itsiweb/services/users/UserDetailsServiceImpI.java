package com.ITSI.itsiweb.services.users;

import com.ITSI.itsiweb.configurations.security.JWTConfiguration.roleMapper.UserDetailsMapper;
import com.ITSI.itsiweb.entities.users.User;
import com.ITSI.itsiweb.repositories.users.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
public class UserDetailsServiceImpI implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        final User retrievedUser = userRepository.findByUsername(userName);
        if (retrievedUser == null) {
            throw new UsernameNotFoundException("Invalid username or password");
        }
        return UserDetailsMapper.build(retrievedUser);
    }
}
