
package com.pruebaacerca.demo.service;

import com.pruebaacerca.demo.entity.HabilidadesBlandas;
import com.pruebaacerca.demo.repository.HabilidadesBlandasRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HabilidadesBlandasService {
    
    @Autowired
    HabilidadesBlandasRepository blandasRepository;
    
    public List<HabilidadesBlandas>list(){
        return blandasRepository.findAll();
    }
    public Optional<HabilidadesBlandas> getOne(int id){
        return blandasRepository.findById(id);
    }
    
    public void save(HabilidadesBlandas habBlandas){
        blandasRepository.save(habBlandas);
    }
    
    public void borrar(int id){
        blandasRepository.deleteById(id);
    }
    
}
