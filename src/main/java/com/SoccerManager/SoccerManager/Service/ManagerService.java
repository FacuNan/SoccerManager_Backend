/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SoccerManager.SoccerManager.Service;

import com.SoccerManager.SoccerManager.Entity.Manager;
import com.SoccerManager.SoccerManager.Repositories.ManagerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SoccerManager.SoccerManager.Interface.ManagerInterface;

@Service
public class ManagerService implements ManagerInterface{
    
    @Autowired
    ManagerRepository managerRepository;

    @Override
    public List<Manager> managers() {
        return managerRepository.findAll();
    }

    @Override
    public Manager manager(int id) {
        return managerRepository.findById(id).get();
    }
    @Override
    public Manager manager(String nombre) {
       return managerRepository.findByNombre(nombre);
    }

    @Override
    public void crearManager(Manager manager) {
        managerRepository.save(manager);
    }

    @Override
    public void eliminarManager(int id) {
      managerRepository.deleteById(id);
    }

    @Override
    public boolean existsById(int id) {
        return managerRepository.existsById(id);
    }

    @Override
    public boolean existsByNombre(String nombre) {
        return managerRepository.existsByNombre(nombre);
    }
    
}
