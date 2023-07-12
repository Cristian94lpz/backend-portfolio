
package com.pruebaacerca.demo.controller;

import com.pruebaacerca.demo.dto.Mensaje;
import com.pruebaacerca.demo.dto.UsuarioDto;
import com.pruebaacerca.demo.entity.Usuario;
import com.pruebaacerca.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hola")
@CrossOrigin(origins="http://localhost:4200")
//@CrossOrigin(origins="https://portfolio-cristian-fullstaker.web.app")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;
    
    @PostMapping("/iniciar-sesion")
    public ResponseEntity<?> verificar(@RequestBody UsuarioDto usuarioDto){
        
        Usuario usuario = usuarioService.getOne(1).get();
       
        
        if(!usuario.getNombre().equals(usuarioDto.getNombre()) && !usuario.getPassword().equals(usuarioDto.getPassword()) ){
            return new ResponseEntity(new Mensaje ("El nombre de usuario y la contraseña son incorrectos"),HttpStatus.BAD_REQUEST);
        }else if(!usuario.getNombre().equals(usuarioDto.getNombre())){
            return new ResponseEntity(new Mensaje ("El nombre de usuario es incorrecto"),HttpStatus.BAD_REQUEST);
            
        }else if(!usuario.getPassword().equals(usuarioDto.getPassword())){
            return new ResponseEntity(new Mensaje ("El password es incorrecto"),HttpStatus.BAD_REQUEST);
        }
        
        boolean autenticacion = true;
        return new ResponseEntity(autenticacion,HttpStatus.OK);
    }
    
   
    
}
