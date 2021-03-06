package com.ITSI.itsiweb.configurations.security.JWTConfiguration.roleMapper;

import com.ITSI.itsiweb.entities.users.Role;
import com.ITSI.itsiweb.entities.users.User;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserDetailsMapper {
    public static UserDetails build(User user) {
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), getAuthorities(user));
    }
    private static Set<? extends GrantedAuthority> getAuthorities(User retrievedUser) {
        List<Role> roles = retrievedUser.getRoles();
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        roles.forEach(role -> authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName())));
        return authorities;
    }
}
