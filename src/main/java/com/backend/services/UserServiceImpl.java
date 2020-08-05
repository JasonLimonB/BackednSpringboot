package com.backend.services;

import com.backend.model.Usuario;
import com.backend.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserServiceImpl {

    @Autowired
    IUserRepository userRepository;

    public ArrayList<Usuario> getUsuarios(){
        return (ArrayList<Usuario>) userRepository.findAll();
    }

    public Usuario saveUser( Usuario usuario ){
        return userRepository.save(usuario);
    }

    public Optional<Usuario> buscarUsuario(Long id){
        return userRepository.findById(id);
    }

    public void eliminarUsuario( Long id ){
        userRepository.deleteById(id);
    }

}
