
package com.pruebaacerca.demo.controller;

import com.pruebaacerca.demo.dto.HabilidadesBlandasDto;
import com.pruebaacerca.demo.entity.HabilidadesBlandas;
import com.pruebaacerca.demo.service.HabilidadesBlandasService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portfolio")
@CrossOrigin(origins="http://localhost:4200")
//@CrossOrigin(origins="https://portfolio-cristian-fullstaker.web.app")
public class HabilidadesBlandasController {
    
    @Autowired
    HabilidadesBlandasService blandasService;
    
    @GetMapping("/HabilidadesBlandas_{id}")
    public ResponseEntity<Optional<HabilidadesBlandas>>HabBlanda(@PathVariable("id") int id){
        
        Optional<HabilidadesBlandas> habBlandas = blandasService.getOne(id);
        return new ResponseEntity(habBlandas,HttpStatus.OK);
        
    }
    
    @PutMapping("/editar_habilidadblanda_{id}")
    public ResponseEntity<?> editarHabBlanda(@PathVariable("id") int id,@RequestBody HabilidadesBlandasDto habilidadesBlandasDto){
        
        HabilidadesBlandas habBlandas = blandasService.getOne(id).get();
        
        habBlandas.setTrabajo_equipo(habilidadesBlandasDto.getTrabajo_equipo());
        habBlandas.setPensamiento_critico(habilidadesBlandasDto.getPensamiento_critico());
        habBlandas.setComunicacion_asertiva(habilidadesBlandasDto.getComunicacion_asertiva());
        habBlandas.setEscucha_activa(habilidadesBlandasDto.getEscucha_activa());
        habBlandas.setAdaptacion_cambio(habilidadesBlandasDto.getAdaptacion_cambio());
        habBlandas.setCreatividad(habilidadesBlandasDto.getCreatividad());
        habBlandas.setRespeto_opiniones(habilidadesBlandasDto.getRespeto_opiniones());
        
       blandasService.save(habBlandas);
        return new ResponseEntity("Actualizado",HttpStatus.OK);
        
          
       
    }
    
}
