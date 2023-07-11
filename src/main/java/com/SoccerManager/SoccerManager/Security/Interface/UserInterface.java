package com.SoccerManager.SoccerManager.Security.Interface;

import com.SoccerManager.SoccerManager.Security.Entity.User;

import java.util.Optional;

public interface UserInterface {
    public Optional<User> getByNombreUsuario(String nombreUsuario);

    public boolean existsBynombreusuario(String nombreUsuario);

    public boolean existsByEmail(String email);

    public void saveUsuario(User user);

}
