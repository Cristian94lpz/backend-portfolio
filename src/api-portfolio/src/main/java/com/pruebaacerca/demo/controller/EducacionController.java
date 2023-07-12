
package com.pruebaacerca.demo.controller;

import com.pruebaacerca.demo.dto.EducacionDto;
import com.pruebaacerca.demo.entity.Educacion;
import com.pruebaacerca.demo.service.EducacionService;
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
public class EducacionController {
    
    @Autowired
    EducacionService educacionService;
    
    @GetMapping("/cursos")
    public ResponseEntity<List<Educacion>>cursos(){
        
        List<Educacion> list = educacionService.list();
        return new ResponseEntity(list,HttpStatus.OK);
        
    }
    
    @PostMapping("/crear_curso")
    public ResponseEntity<?>crearCurso (@RequestBody EducacionDto educacionDto){
        
        Educacion educacion = new Educacion(
                                            
                                            educacionDto.getNombre_curso(),
                                            educacionDto.getDescripcion_curso(),
                                            educacionDto.getModulo1(),
                                            educacionDto.getModulo2(),
                                            educacionDto.getModulo3(),
                                            educacionDto.getModulo4(),
                                            educacionDto.getModulo5(),
                                            educacionDto.getModulo6(),
                                            educacionDto.getModulo7(),
                                            educacionDto.getModulo8(),
                                            educacionDto.getModulo9(),
                                            educacionDto.getModulo10(),
                                            educacionDto.getModulo11(),
                                            educacionDto.getModulo12(),
                                            educacionDto.getFoto_curso(),
                                            educacionDto.getNombre_instituto_curso()
                                            );
        educacionService.save(educacion);
        return new ResponseEntity("Creado",HttpStatus.OK);
    }
        
    @PutMapping("/editar_curso_{id}")
    public ResponseEntity<?> editarCurso(@PathVariable("id") int id,@RequestBody EducacionDto educacionDto){
        
        Educacion educacion = educacionService.getOne(id).get();
        
        educacion.setNombre_instituto_curso(educacionDto.getNombre_instituto_curso());
        educacion.setNombre_curso(educacionDto.getNombre_curso());
        educacion.setDescripcion_curso(educacionDto.getDescripcion_curso());
        educacion.setFoto_curso(educacionDto.getFoto_curso());
        educacion.setModulo1(educacionDto.getModulo1());
        educacion.setModulo2(educacionDto.getModulo2());
        educacion.setModulo3(educacionDto.getModulo3());
        educacion.setModulo4(educacionDto.getModulo4());
        educacion.setModulo5(educacionDto.getModulo5());
        educacion.setModulo6(educacionDto.getModulo6());
        educacion.setModulo7(educacionDto.getModulo7());
        educacion.setModulo8(educacionDto.getModulo8());
        educacion.setModulo9(educacionDto.getModulo9());
        educacion.setModulo10(educacionDto.getModulo10());
        educacion.setModulo11(educacionDto.getModulo11());
        educacion.setModulo12(educacionDto.getModulo12());
        educacionService.save(educacion);
        return new ResponseEntity("Actualizado",HttpStatus.OK);
        
          
       
    }
    
    @DeleteMapping("/borrar_curso_{id}")
    public ResponseEntity<?> borrarCurso (@PathVariable("id") int id){
        educacionService.borrar(id);
        
        return new ResponseEntity("Borrado",HttpStatus.OK);
    }
}
    

