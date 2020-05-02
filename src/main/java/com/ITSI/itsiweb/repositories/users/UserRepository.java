package com.ITSI.itsiweb.repositories.users;

import com.ITSI.itsiweb.entities.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
    User findById(Long id);
}
