
package com.pruebaacerca.demo.repository;

import com.pruebaacerca.demo.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto,Integer>{
    
}
