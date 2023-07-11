/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.SoccerManager.SoccerManager.Repositories;

import com.SoccerManager.SoccerManager.Entity.Liga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigaRepository extends JpaRepository<Liga, Integer> {
    public Liga findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
