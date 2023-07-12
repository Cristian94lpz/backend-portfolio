
package com.pruebaacerca.demo.repository;

import com.pruebaacerca.demo.entity.HabilidadesBlandas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesBlandasRepository extends JpaRepository<HabilidadesBlandas,Integer> {
    
}
