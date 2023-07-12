
package com.pruebaacerca.demo.service;

import com.pruebaacerca.demo.entity.Proyecto;
import com.pruebaacerca.demo.repository.ProyectoRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService {
    
    @Autowired
    ProyectoRepository proyectoRepository;
    
    public List<Proyecto>list(){
        return proyectoRepository.findAll();
    }
    public Optional<Proyecto> getOne(int id){
        return proyectoRepository.findById(id);
    }
    
    public void save(Proyecto proyecto){
        proyectoRepository.save(proyecto);
    }
    
    public void borrar(int id){
        proyectoRepository.deleteById(id);
    }
    
    
}
