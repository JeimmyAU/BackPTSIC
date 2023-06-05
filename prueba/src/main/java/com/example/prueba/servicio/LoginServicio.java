package com.example.prueba.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prueba.modelo.Login;
import com.example.prueba.repositorio.LoginRepository;

@Service
public class LoginServicio {
	@Autowired
    private LoginRepository loginRepository;
	
    public Boolean login( String username, String pass) {
        
    	Login user = loginRepository.findByNombreUsuario(username);

        if (user != null && user.getPassword().equals(pass)) {
            return true;
        } else {
            return false;
        }
    }

}
