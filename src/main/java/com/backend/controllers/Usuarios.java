package com.backend.controllers;

import com.backend.model.Usuario;
import com.backend.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class Usuarios {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping( value = "/usuarios", method = RequestMethod.GET )
    public ArrayList<Usuario> getUsuarios(){
        return userService.getUsuarios();
    }

    @RequestMapping(value = "/nuevoUsuario", method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "POST")
    public Usuario nuevoUsuario(@RequestBody Usuario usuario){
        return userService.saveUser(usuario);
    }

    @RequestMapping( value = "/usuarios/{id}", method = RequestMethod.GET)
    public Optional<Usuario> buscarPorId(@PathVariable Long id){
        return userService.buscarUsuario(id);
    }

    @RequestMapping( value = "/eliminarUsuario/{id}", method = RequestMethod.GET)
    public void eliminar( @PathVariable Long id ){
        userService.eliminarUsuario(id);
    }

}
