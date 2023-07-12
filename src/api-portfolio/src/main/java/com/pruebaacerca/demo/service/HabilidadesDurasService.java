
package com.pruebaacerca.demo.service;

import com.pruebaacerca.demo.entity.HabilidadesDuras;
import com.pruebaacerca.demo.repository.HabilidadesDurasRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HabilidadesDurasService {
    
    @Autowired
    HabilidadesDurasRepository durasRepository;
    
    public List<HabilidadesDuras>list(){
        return durasRepository.findAll();
    }
    public Optional<HabilidadesDuras> getOne(int id){
        return durasRepository.findById(id);
    }
    
    public void save(HabilidadesDuras habDuras){
        durasRepository.save(habDuras);
    }
    
    public void borrar(int id){
        durasRepository.deleteById(id);
    }
    
}
