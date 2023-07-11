/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.SoccerManager.SoccerManager.Interface;

import com.SoccerManager.SoccerManager.Entity.Equipo;
import com.SoccerManager.SoccerManager.Entity.Jugador;
import com.SoccerManager.SoccerManager.Entity.Manager;
import java.util.List;


public interface EquipoInterface {
    public List<Equipo>equipos();
    public Equipo equipo(int id);
    public Equipo equipo(String equipo);
    public void agregarEquipo(Equipo equipo);
    public void eliminarEquipo(int id);
    public  void agregarJugadores(int id, Jugador jugador);
    public void eliminarJugadores(int id, Jugador jugador);
    public void asignarManager(int id, Manager manager);
    public void despedirManager(int id);
    public List<Jugador> obtenerjugadores(Equipo equipo);
    
    
}
