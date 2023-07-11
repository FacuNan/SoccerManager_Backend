/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SoccerManager.SoccerManager.Service;

import com.SoccerManager.SoccerManager.Entity.Jugador;
import com.SoccerManager.SoccerManager.Interface.JugadoresInterface;
import com.SoccerManager.SoccerManager.Repositories.JugadorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JugadorService implements JugadoresInterface{
@Autowired
JugadorRepository jugadorRepository;
    @Override
    public List<Jugador> jugadores() {
       return jugadorRepository.findAll();
    }

    @Override
    public Jugador jugador(int id) {
       return jugadorRepository.findById(id).get();
    }

    @Override
    public Jugador jugador(String nombre) {
       return jugadorRepository.findByNombre(nombre);
    }

    @Override
    public void crearJugador(Jugador jugador) {
        jugadorRepository.save(jugador);
    }

    @Override
    public void eliminarjugador(int id) {
        jugadorRepository.deleteById(id);
    }

    @Override
    public boolean existsById(int id) {
       return jugadorRepository.existsById(id);
    }

    @Override
    public boolean existsByNombre(String nombre) {
       return jugadorRepository.existsByNombre(nombre);
    }
    
}
