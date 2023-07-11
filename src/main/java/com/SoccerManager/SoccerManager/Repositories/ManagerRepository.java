
package com.SoccerManager.SoccerManager.Repositories;

import com.SoccerManager.SoccerManager.Entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer>{
    public Manager findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
