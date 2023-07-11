
package com.SoccerManager.SoccerManager.Service;

import com.SoccerManager.SoccerManager.Entity.Equipo;
import com.SoccerManager.SoccerManager.Entity.Jugador;
import com.SoccerManager.SoccerManager.Entity.Manager;
import com.SoccerManager.SoccerManager.Interface.EquipoInterface;
import com.SoccerManager.SoccerManager.Repositories.EquipoRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquipoService implements EquipoInterface {

    @Autowired
    private EquipoRepository equipoRepository;

    @Override
    public List<Equipo> equipos() {
        return equipoRepository.findAll();
    }

    @Override
    public Equipo equipo(int id) {
        return equipoRepository.findById(id).orElse(null);
    }

    @Override
    public Equipo equipo(String equipo) {
        return equipoRepository.findByNombre(equipo);
    }

    @Override
    public void agregarEquipo(Equipo equipo) {
        equipoRepository.save(equipo);
    }

    @Override
    public void eliminarEquipo(int id) {
        equipoRepository.deleteById(id);
    }

    @Override
    public void agregarJugadores(int id, Jugador jugador) {
        Equipo equipo = equipoRepository.findById(id).get();
        equipo.agregarJugador(jugador);
        equipoRepository.save(equipo);
    }

    @Override
    public void eliminarJugadores(int id, Jugador jugador) {
        Equipo equipo = equipoRepository.findById(id).get();
        equipo.eliminarJugador(jugador);
        equipoRepository.save(equipo);
    }

    @Override
    public void asignarManager(int id, Manager manager) {
        Equipo equipo = equipoRepository.findById(id).get();
        equipo.setManager(manager);
        equipoRepository.save(equipo);
    }

    @Override
    @Transactional
    public void despedirManager(int id) {
        Equipo equipo = equipoRepository.findById(id).orElse(null);
        if (equipo != null) {
            equipo.setManager(null);
            equipoRepository.save(equipo);
        } else {
            System.out.println("El equipo no ha sido encontrado");
        }
    }

    @Override
    public List<Jugador> obtenerjugadores(Equipo equipo) {
        return equipo.getJugadores();
    }

 


    
    
}
