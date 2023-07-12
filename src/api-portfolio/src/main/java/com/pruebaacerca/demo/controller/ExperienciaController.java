
package com.pruebaacerca.demo.controller;

import com.pruebaacerca.demo.dto.ExperienciaDto;
import com.pruebaacerca.demo.entity.Experiencia;
import com.pruebaacerca.demo.service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portfolio")
@CrossOrigin(origins="http://localhost:4200")
//@CrossOrigin(origins="https://portfolio-cristian-fullstaker.web.app")
public class ExperienciaController {
    
    @Autowired
    ExperienciaService experienciaService;
    
    @GetMapping("/experiencias")
    public ResponseEntity<List<Experiencia>>listExp(){
        
        List<Experiencia> list = experienciaService.list();
        return new ResponseEntity(list,HttpStatus.OK);
        
    }
    
    @PostMapping("/crear_experiencia")
    public ResponseEntity<?>agregarExp (@RequestBody ExperienciaDto experienciaDto){
        
        Experiencia experiencia = new Experiencia(
                                            
                                            experienciaDto.getPuesto(),
                                            experienciaDto.getEmpresa(),
                                            experienciaDto.getInicio(),
                                            experienciaDto.getFin(),
                                            experienciaDto.getFotourl()
                                           
                                            );
        experienciaService.save(experiencia);
        return new ResponseEntity("Creado",HttpStatus.OK);
    }
        
    @PutMapping("/editar_experiencia_{id}")
    public ResponseEntity<?> editarExp(@PathVariable("id") int id,@RequestBody ExperienciaDto experienciaDto){
        
        Experiencia experiencia = experienciaService.getOne(id).get();
        
        experiencia.setPuesto(experienciaDto.getPuesto());
        experiencia.setEmpresa(experienciaDto.getEmpresa());
        experiencia.setInicio(experienciaDto.getInicio());
        experiencia.setFin(experienciaDto.getFin());
        experiencia.setFotourl(experienciaDto.getFotourl());
        
        experienciaService.save(experiencia);
        return new ResponseEntity("Actualizado",HttpStatus.OK);
        
          
       
    }
    
    @DeleteMapping("/borrar_experiencia_{id}")
    public ResponseEntity<?> borrarCurso (@PathVariable("id") int id){
        experienciaService.borrar(id);
        
        return new ResponseEntity("Borrado",HttpStatus.OK);
    }
}
