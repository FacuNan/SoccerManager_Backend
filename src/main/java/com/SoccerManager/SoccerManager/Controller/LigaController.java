
package com.SoccerManager.SoccerManager.Controller;

import com.SoccerManager.SoccerManager.Entity.Liga;
import com.SoccerManager.SoccerManager.Service.LigaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class LigaController {
    @Autowired
    LigaService ligaService;
    
    @GetMapping("/mundo")
    public ResponseEntity<List<Liga>>liga(){
       List<Liga> ligas = ligaService.ligas();
        System.out.println(ligas);
       return new ResponseEntity<>(ligas, HttpStatus.OK);
    }
    
    
    
}
