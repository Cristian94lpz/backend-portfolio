
package com.pruebaacerca.demo.service;

import com.pruebaacerca.demo.entity.AcercaMi;
import com.pruebaacerca.demo.repository.AcercaMiRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AcercaMiService {
    
    @Autowired
    AcercaMiRepository acercaMiRepository;
    
    public List<AcercaMi>list(){
        return acercaMiRepository.findAll();
    }
    public Optional<AcercaMi> getOne(int id){
        return acercaMiRepository.findById(id);
    }
    
    public void save(AcercaMi acercaMi){
        acercaMiRepository.save(acercaMi);
    }
}
