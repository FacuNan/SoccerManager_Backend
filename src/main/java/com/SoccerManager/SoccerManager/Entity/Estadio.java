/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SoccerManager.SoccerManager.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Estadio {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    
    private int id;
    @NotNull
    private String nombre;
    @NotNull
    private String img;
    @NotNull
    private boolean cespedHumedo;
    @NotNull
    private boolean cespedLargo;
    @NotNull
    private int capacidad;
     @OneToOne
    @JoinColumn(name="equipo_id")
    private Equipo equipo;

    public Estadio() {
    }

    public Estadio(String nombre, String img, boolean cespedHumedo, boolean cespedLargo, int capacidad) {
        this.nombre = nombre;
        this.img = img;
        this.cespedHumedo = cespedHumedo;
        this.cespedLargo = cespedLargo;
        this.capacidad = capacidad;
    }


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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isCespedHumedo() {
        return cespedHumedo;
    }

    public void setCespedHumedo(boolean cespedHumedo) {
        this.cespedHumedo = cespedHumedo;
    }

    public boolean isCespedLargo() {
        return cespedLargo;
    }

    public void setCespedLargo(boolean cespedLargo) {
        this.cespedLargo = cespedLargo;
    }
  
    
}
