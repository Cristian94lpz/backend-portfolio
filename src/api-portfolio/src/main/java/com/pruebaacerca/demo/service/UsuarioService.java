
package com.pruebaacerca.demo.service;


import com.pruebaacerca.demo.entity.Usuario;
import com.pruebaacerca.demo.repository.UsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public Optional<Usuario> getOne(int id){
        return usuarioRepository.findById(id);
    }
}
