
package com.SoccerManager.SoccerManager.Controller;


import com.SoccerManager.SoccerManager.Entity.Equipo;
import com.SoccerManager.SoccerManager.Entity.Jugador;
import com.SoccerManager.SoccerManager.Entity.Manager;
import com.SoccerManager.SoccerManager.Entity.Mensaje;
import com.SoccerManager.SoccerManager.Service.EquipoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquiposController {
    @Autowired
    EquipoService equipoService;
    @GetMapping("/equipos")
    public ResponseEntity<List<Equipo>> equipos(){
        List<Equipo> equipo = equipoService.equipos();
        return new ResponseEntity<>(equipo, HttpStatus.OK);
        
    }
    
    @GetMapping("/equipo/{id}")
    public ResponseEntity<Equipo> equipo(@PathVariable("id") int id){
        Equipo equipo = equipoService.equipo(id);
        return new ResponseEntity<>(equipo, HttpStatus.OK);
    }
    
    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> eliminarEquipo(@PathVariable("id") int id){
        equipoService.eliminarEquipo(id);
        return new ResponseEntity(new Mensaje("El equipo se ha eliminado con exito"), HttpStatus.OK);
    }
    
    @PostMapping("add/{id}/jugador")
    public ResponseEntity<?>add(@PathVariable("id") int id, @RequestBody Jugador jugador){
        Equipo equipo = equipoService.equipo(id);
        equipo.agregarJugador(jugador);
        return new ResponseEntity<>(new Mensaje("Jugador añadido exitosamente"), HttpStatus.OK);
    }
   
    @DeleteMapping("delete/{id}/jugador")
    public ResponseEntity<?> removeJugador(@PathVariable("id")int id, @RequestBody Jugador jugador){
        Equipo equipo = equipoService.equipo(id);
        equipo.eliminarJugador(jugador);
       return new ResponseEntity<>(new Mensaje("El jugador ha sido quitado de la plantilla"), HttpStatus.OK);
    }
    
    @PostMapping("addManager/{id}/manager")
    public ResponseEntity<?> tomarEquipo(@PathVariable("id")int id, @RequestBody Manager manager){
        equipoService.asignarManager(id, manager);
        return new ResponseEntity<>(new Mensaje("Bienvenido"), HttpStatus.OK);
    }
    
    @DeleteMapping("despido/{id}/manager")
    
    public ResponseEntity<?> despedirManager(@PathVariable("id") int id){
        equipoService.despedirManager(id);
        
        return new ResponseEntity<>(new Mensaje("No has cumplido con los objetivos y el club ha decidido despedirte"),HttpStatus.OK);
    }
    
    
}

