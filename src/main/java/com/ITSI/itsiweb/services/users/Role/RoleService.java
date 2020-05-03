package com.ITSI.itsiweb.services.users.Role;

import com.ITSI.itsiweb.entities.users.Role;

import java.util.List;

public interface RoleService {
    Role findBy(String name);
    Role findBy(long id);
    List<Role> listAllRoles();
}