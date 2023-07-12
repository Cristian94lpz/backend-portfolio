
package com.pruebaacerca.demo.controller;

import com.pruebaacerca.demo.dto.ProyectoDto;
import com.pruebaacerca.demo.entity.Proyecto;
import com.pruebaacerca.demo.service.ProyectoService;
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
public class ProyectoController {
    
    @Autowired
    ProyectoService proyectoService;
    
    @GetMapping("/proyectos")
    public ResponseEntity<List<Proyecto>>listProyecto(){
        
        List<Proyecto> list = proyectoService.list();
        return new ResponseEntity(list,HttpStatus.OK);
        
    }
    
    @PostMapping("/crear_proyecto")
    public ResponseEntity<?>agregarProyecto (@RequestBody ProyectoDto proyectoDto){
        
        Proyecto proyecto = new Proyecto(
                                            proyectoDto.getNombre(),
                                            proyectoDto.getDescripcion(),
                                            proyectoDto.getUrl(),
                                            proyectoDto.getFotourl()
                                            );
        proyectoService.save(proyecto);
        return new ResponseEntity("Creado",HttpStatus.OK);
    }
        
    @PutMapping("/editar_proyecto_{id}")
    public ResponseEntity<?> editarPrpyecto(@PathVariable("id") int id,@RequestBody ProyectoDto proyectoDto){
        
        Proyecto proyecto = proyectoService.getOne(id).get();
        
        proyecto.setNombre(proyectoDto.getNombre());
        proyecto.setDescripcion(proyectoDto.getDescripcion());
        proyecto.setUrl(proyectoDto.getUrl());
        proyecto.setFotourl(proyectoDto.getFotourl());
   
        
        proyectoService.save(proyecto);
        return new ResponseEntity("Actualizado",HttpStatus.OK);
        
          
       
    }
    
    @DeleteMapping("/borrar_proyecto_{id}")
    public ResponseEntity<?> borrarExperiencia (@PathVariable("id") int id){
        proyectoService.borrar(id);
        
        return new ResponseEntity("Borrado",HttpStatus.OK);
    }
    
    
}
