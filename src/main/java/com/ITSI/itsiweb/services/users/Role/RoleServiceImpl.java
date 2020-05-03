package com.ITSI.itsiweb.services.users.Role;

import com.ITSI.itsiweb.entities.users.Role;
import com.ITSI.itsiweb.repositories.users.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findBy(String username){
        return roleRepository.findByName(username);
    }

    @Override
    public Role findBy(long id){
        return roleRepository.findById(id);
    }

    @Override
    public List<Role> listAllRoles(){
        return roleRepository.findAll();
    }
}
