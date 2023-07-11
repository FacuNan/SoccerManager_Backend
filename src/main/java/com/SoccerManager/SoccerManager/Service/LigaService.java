/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.SoccerManager.SoccerManager.Service;

import com.SoccerManager.SoccerManager.Entity.Equipo;
import com.SoccerManager.SoccerManager.Entity.Liga;
import com.SoccerManager.SoccerManager.Interface.LigaInterface;
import com.SoccerManager.SoccerManager.Repositories.LigaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LigaService implements LigaInterface {
    @Autowired
    LigaRepository ligaRepository;
    

    @Override
    public List<Liga> ligas() {
        return ligaRepository.findAll();
    }

    @Override
    public Liga liga(int id) {
        return ligaRepository.findById(id).get();
    }

    @Override
    public Liga liga(String nombre) {
        return ligaRepository.findByNombre(nombre);
    }

    @Override
    public void agregarLiga(Liga liga) {
       ligaRepository.save(liga);
    }

    @Override
    public void eliminarLiga(int id) {
       ligaRepository.deleteById(id);
    }

    @Override
    public void agregarEquipo(int id, Equipo equipo) {
       Liga liga = ligaRepository.findById(id).get();
       liga.agregarEquipo(equipo);
       ligaRepository.save(liga);
    }

    @Override
    public void eliminarEquipo(int id, Equipo equipo) {
        Liga liga = ligaRepository.findById(id).get();
        liga.eliminarEquipo(equipo);
        ligaRepository.save(liga);
    }

    @Override
    public List<Equipo> verEquipos(int id) {
       Liga liga = ligaRepository.findById(id).get();
       return liga.getEquipos();
    }
    
}
