package com.backend.controllers;

import com.backend.model.Usuario;
import com.backend.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Usuarios {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping( value = "/usuarios", method = RequestMethod.GET )
    public ArrayList<Usuario> getUsuarios(){
        return userService.getUsuarios();
    }

    @RequestMapping(value = "/nuevoUsuario", method = RequestMethod.POST)
    public Usuario nuevoUsuario(@RequestBody Usuario usuario){
        return userService.saveUser(usuario);
    }

}
