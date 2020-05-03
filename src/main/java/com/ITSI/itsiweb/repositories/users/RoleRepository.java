package com.ITSI.itsiweb.repositories.users;

import com.ITSI.itsiweb.entities.users.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(String roleName);
    Role findById(long id);
}
