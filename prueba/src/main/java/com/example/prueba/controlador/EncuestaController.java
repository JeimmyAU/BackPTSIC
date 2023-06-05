package com.example.prueba.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.prueba.modelo.Encuesta;
import com.example.prueba.servicio.EncuestaServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/encuestas")
@CrossOrigin(origins = "http://localhost:4200")
public class EncuestaController {
	@Autowired
    private EncuestaServicio encuestaServicio;
    
    // Obtener todas las encuestas
    @GetMapping("/listar")
    public ResponseEntity<List<Encuesta>> obtenerEncuestas() {
        List<Encuesta> encuestas = encuestaServicio.obtenerEncuestas();
        return new ResponseEntity<>(encuestas, HttpStatus.OK);
    }

    // Crear una nueva encuesta
    @PostMapping("/crear")
    public ResponseEntity<Encuesta> crearEncuesta(@RequestBody Encuesta encuesta) {
        Encuesta nuevaEncuesta = encuestaServicio.crearEncuesta(encuesta);
        return new ResponseEntity<>(nuevaEncuesta, HttpStatus.CREATED);
    }

    // Actualizar una encuesta existente
    @PutMapping("/actualizar-encuesta")
    public ResponseEntity<Encuesta> actualizarEncuesta(@PathVariable("id") int id, @RequestBody Encuesta encuestaDatos) {
        Encuesta encuestaActualizada = encuestaServicio.actualizarEncuesta(id, encuestaDatos);
        return new ResponseEntity<>(encuestaActualizada, HttpStatus.OK);
    }

    // Eliminar una encuesta existente
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminarEncuesta(@PathVariable("id") int id) {
        encuestaServicio.eliminarEncuesta(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
