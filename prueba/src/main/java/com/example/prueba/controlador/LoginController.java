package com.example.prueba.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba.servicio.LoginServicio;

@RestController
@RequestMapping("/formulario")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	@Autowired
    private LoginServicio loginServicio;

    @PostMapping("/login")
    public ResponseEntity<Boolean> login(@RequestParam String username, @RequestParam String pass) {
        
    	Boolean ingreso = loginServicio.login(username, pass);    	
        return new ResponseEntity<>(ingreso, HttpStatus.OK);	
    }

}

