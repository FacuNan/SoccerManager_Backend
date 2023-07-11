/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.SoccerManager.SoccerManager.Interface;

import com.SoccerManager.SoccerManager.Entity.Equipo;
import com.SoccerManager.SoccerManager.Entity.Liga;
import java.util.List;

/**
 *
 * @author facundo
 */
public interface LigaInterface {
    public List<Liga> ligas();
    public Liga liga(int id);
    public Liga liga(String nombre);
    public void agregarLiga(Liga liga);
    public void eliminarLiga(int id);
    public void agregarEquipo(int id, Equipo equipo);
    public void eliminarEquipo(int id, Equipo equipo);
    public List<Equipo> verEquipos(int id);
    
    
    
    
}
