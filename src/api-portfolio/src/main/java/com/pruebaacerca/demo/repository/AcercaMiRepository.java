
package com.pruebaacerca.demo.repository;

import com.pruebaacerca.demo.entity.AcercaMi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaMiRepository extends JpaRepository<AcercaMi,Integer>{
    
}
