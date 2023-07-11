
package com.SoccerManager.SoccerManager.Interface;

import com.SoccerManager.SoccerManager.Entity.Jugador;
import java.util.List;


public interface JugadoresInterface {
    public List<Jugador> jugadores();
    public Jugador jugador(int id);
    public Jugador jugador(String nombre);
    public void crearJugador(Jugador jugador);
    public void eliminarjugador(int id);
    public boolean existsById(int id);
    public boolean existsByNombre(String nombre);
}
