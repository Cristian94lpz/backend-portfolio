
package com.pruebaacerca.demo.repository;

import com.pruebaacerca.demo.entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Integer> {
    
}
