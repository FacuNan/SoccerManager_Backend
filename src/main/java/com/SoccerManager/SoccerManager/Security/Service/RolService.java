package com.SoccerManager.SoccerManager.Security.Service;

import com.SoccerManager.SoccerManager.Security.Entity.Role;
import com.SoccerManager.SoccerManager.Security.Interface.RolInterface;
import com.SoccerManager.SoccerManager.Security.Repository.IRolRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RolService implements RolInterface {
    @Autowired
    IRolRespository irolrepository;
    @Override
    public Optional<Role> getBynombreRol(String nombre) {
        return irolrepository.findByNombre(nombre);
    }

    @Override
    public boolean existsNombreRol(String nombre) {
        return irolrepository.existsByNombre(nombre);
    }

    @Override
    public void saveRol(Role role) {
        irolrepository.save(role);
    }
}
