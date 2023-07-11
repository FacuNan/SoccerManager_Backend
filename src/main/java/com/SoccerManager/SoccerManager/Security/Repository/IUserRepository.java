package com.SoccerManager.SoccerManager.Security.Repository;

import com.SoccerManager.SoccerManager.Security.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
    public Optional<User> findByNombreUsuario(String nombreUsuario);

    public String findByEmail(String email);

    public boolean existsByNombreUsuario(String nombreUsuario);

    public boolean existsByEmail(String email);
}
