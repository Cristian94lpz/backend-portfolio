
package com.pruebaacerca.demo.service;

import com.pruebaacerca.demo.entity.Experiencia;
import com.pruebaacerca.demo.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {
    

    
    @Autowired
    ExperienciaRepository experienciaRepository;
    
    public List<Experiencia>list(){
        return experienciaRepository.findAll();
    }
    public Optional<Experiencia> getOne(int id){
        return experienciaRepository.findById(id);
    }
    
    public void save(Experiencia experiencia){
        experienciaRepository.save(experiencia);
    }
    
    public void borrar(int id){
        experienciaRepository.deleteById(id);
    }
    
}
