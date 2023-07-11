/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.SoccerManager.SoccerManager.Interface;

import com.SoccerManager.SoccerManager.Entity.Manager;
import java.util.List;


public interface ManagerInterface {
    public List<Manager> managers();
    public Manager manager(int id);
    public Manager manager(String nombre);
    public void crearManager(Manager manager);
    public void eliminarManager(int id);
    public boolean existsById(int id);
    public boolean existsByNombre(String nombre);
    
    
}
