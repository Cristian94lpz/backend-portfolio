
package com.pruebaacerca.demo.service;


import com.pruebaacerca.demo.entity.Educacion;
import com.pruebaacerca.demo.repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    
    @Autowired
    EducacionRepository educacionRepository;
    
    public List<Educacion>list(){
        return educacionRepository.findAll();
    }
    public Optional<Educacion> getOne(int id){
        return educacionRepository.findById(id);
    }
    
    public void save(Educacion educacion){
        educacionRepository.save(educacion);
    }
    
    public void borrar(int id){
        educacionRepository.deleteById(id);
    }
}
