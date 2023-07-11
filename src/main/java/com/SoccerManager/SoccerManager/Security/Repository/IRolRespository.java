package com.SoccerManager.SoccerManager.Security.Repository;

import com.SoccerManager.SoccerManager.Security.Entity.Role;
import com.SoccerManager.SoccerManager.Security.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRolRespository extends JpaRepository<Role, Integer> {
    public Optional<Role> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);

}
