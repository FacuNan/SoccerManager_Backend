/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SoccerManager.SoccerManager.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nombre;
    @NotNull
    private String img;
   
    @ManyToOne
     @JsonIgnoreProperties("jugadores")
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;
    @NotNull
    private String formafisica;
    @NotNull
    private String reputacion;
    @NotNull
    private int moral;
    

    public Jugador() {
    }

 

    public Jugador(String nombre, String img, Equipo equipo, String formafisica, String reputacion, int moral) {
        this.nombre = nombre;
        this.img = img;
        this.equipo = equipo;
        this.formafisica = formafisica;
        this.reputacion = reputacion;
        this.moral = moral;
    }
    
    

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getFormafisica() {
        return formafisica;
    }

    public void setFormafisica(String formafisica) {
        this.formafisica = formafisica;
    }

    public String getReputacion() {
        return reputacion;
    }

    public void setReputacion(String reputacion) {
        this.reputacion = reputacion;
    }

    public int getMoral() {
        return moral;
    }

    public void setMoral(int moral) {
        this.moral = moral;
    }
    
    
    
    
}
