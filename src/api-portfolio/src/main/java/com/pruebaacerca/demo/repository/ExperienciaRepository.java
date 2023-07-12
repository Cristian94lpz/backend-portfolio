
package com.pruebaacerca.demo.repository;

import com.pruebaacerca.demo.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia,Integer> {
    
}
