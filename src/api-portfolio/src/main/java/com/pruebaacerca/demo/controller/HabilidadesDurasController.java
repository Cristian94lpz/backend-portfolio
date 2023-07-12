
package com.pruebaacerca.demo.controller;


import com.pruebaacerca.demo.dto.HabilidadesDurasDto;
import com.pruebaacerca.demo.entity.HabilidadesDuras;
import com.pruebaacerca.demo.service.HabilidadesDurasService;
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
public class HabilidadesDurasController {
    
    @Autowired
    HabilidadesDurasService durasService;
    
    @GetMapping("/HabilidadesDuras_{id}")
    public ResponseEntity<Optional<HabilidadesDuras>>HabDura(@PathVariable("id") int id){
        
        Optional<HabilidadesDuras> habDuras = durasService.getOne(id);
        return new ResponseEntity(habDuras,HttpStatus.OK);
        
    }
    
    @PutMapping("/editar_habilidaddura_{id}")
    public ResponseEntity<?> editarHabDura(@PathVariable("id") int id,@RequestBody HabilidadesDurasDto habilidadesDurasDto){
        
        HabilidadesDuras habDuras = durasService.getOne(id).get();
        
        habDuras.setAngular(habilidadesDurasDto.getAngular());
        habDuras.setVisual_studio(habilidadesDurasDto.getVisual_studio());
        habDuras.setConsola_npm(habilidadesDurasDto.getConsola_npm());
        habDuras.setMysql(habilidadesDurasDto.getMysql());
        habDuras.setSql0(habilidadesDurasDto.getSql0());
        habDuras.setPhp(habilidadesDurasDto.getPhp());
        habDuras.setPhpmyadmin(habilidadesDurasDto.getPhpmyadmin());
        habDuras.setCss(habilidadesDurasDto.getCss());
        habDuras.setHtml(habilidadesDurasDto.getHtml());
        habDuras.setJavascript(habilidadesDurasDto.getJavascript());
        habDuras.setTypescript(habilidadesDurasDto.getTypescript());
        habDuras.setGit(habilidadesDurasDto.getGit());
        habDuras.setAdobe_photoshop(habilidadesDurasDto.getAdobe_photoshop());
        
       durasService.save(habDuras);
        return new ResponseEntity("Actualizado",HttpStatus.OK);
        
          
       
    }
    
    
    
}
