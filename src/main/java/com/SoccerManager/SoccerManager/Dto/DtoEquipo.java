/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SoccerManager.SoccerManager.Dto;

import com.SoccerManager.SoccerManager.Entity.Aficion;
import com.SoccerManager.SoccerManager.Entity.Estadio;
import com.SoccerManager.SoccerManager.Entity.Jugador;
import com.SoccerManager.SoccerManager.Entity.Liga;
import com.SoccerManager.SoccerManager.Entity.Manager;
import java.util.List;




public class DtoEquipo {
   
    private String nombre;
   
    private String img;
   
    private List<Jugador> jugadores;
   
    private Liga liga;
   
    private Manager manager;
  
    private Estadio estadio;
    

    private Aficion aficion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Aficion getAficion() {
        return aficion;
    }

    public void setAficion(Aficion aficion) {
        this.aficion = aficion;
    }
    
    
      
}
