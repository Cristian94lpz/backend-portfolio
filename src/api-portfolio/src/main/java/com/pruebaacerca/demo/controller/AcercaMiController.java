
package com.pruebaacerca.demo.controller;

import com.pruebaacerca.demo.dto.AcercaMiDto;
import com.pruebaacerca.demo.entity.AcercaMi;
import com.pruebaacerca.demo.service.AcercaMiService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portfolio")
@CrossOrigin(origins="http://localhost:4200")
//@CrossOrigin(origins="https://portfolio-cristian-fullstaker.web.app")
public class AcercaMiController {
    
    @Autowired
    AcercaMiService acercaMiService;
    
    @GetMapping("/descripcion")
    public ResponseEntity<Optional<AcercaMi>>getOne(){
        
        
        Optional<AcercaMi> getone = acercaMiService.getOne(1);
        return new ResponseEntity(getone,HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<?>update(@RequestBody AcercaMiDto acercaMiDto){
            
        AcercaMi acercaMi = acercaMiService.getOne(1).get(); 
        acercaMi.setDescripcion(acercaMiDto.getDescripcion());
        acercaMi.setFotourl(acercaMiDto.getFotourl());
        acercaMiService.save(acercaMi);
        return new ResponseEntity("Actualizado",HttpStatus.OK);
        
    }
}
