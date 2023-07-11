package com.SoccerManager.SoccerManager.Security.Interface;

import com.SoccerManager.SoccerManager.Security.Entity.Role;

import java.util.Optional;

public interface RolInterface {
    public Optional<Role> getBynombreRol(String nombre);

    public boolean existsNombreRol(String nombre);

    public void saveRol(Role role);


}
