
package com.SoccerManager.SoccerManager.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String nombre;
    @NotNull
    private String img;
    @ElementCollection
     @JsonIgnoreProperties("equipo")
    @OneToMany(mappedBy="equipo")
    private List<Jugador> jugadores;
    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name = "liga_id")
    private Liga liga;
    @OneToOne
    @JoinColumn(name="manager_id")
    private Manager manager;
    @OneToOne
    @JoinColumn(name="estadio_id")
    private Estadio estadio;
    @NotNull
    @OneToOne
    @JoinColumn(name="aficion_id")
    private Aficion aficion;
    
   

    public Equipo() {
    }

    public Equipo(String nombre, String img, List<Jugador> jugadores, Liga liga, Manager manager, Estadio estadio) {
        this.nombre = nombre;
        this.img = img;
        this.jugadores = jugadores;
        this.liga = liga;
        this.manager = manager;
        this.estadio = estadio;
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

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> juagadores) {
        this.jugadores = juagadores;
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
    
    
    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }
    
    public void eliminarJugador(Jugador jugador){
        jugadores.remove(jugador);
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    
    public void despedirManager(){
        this.manager=null;
    }
}
