package com.example.prueba.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.prueba.modelo.Marca;
import com.example.prueba.servicio.MarcaServicio;

import java.util.List;

@RestController
@RequestMapping("/marcas")
@CrossOrigin(origins = "http://localhost:4200")
public class MarcaController {
	@Autowired
    MarcaServicio marcaServicio;

    @GetMapping("/listar")
    public ResponseEntity<List<Marca>> obtenerMarcas() {
        List<Marca> marcas = marcaServicio.obtenerMarcas();
        return new ResponseEntity<>(marcas, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Marca> crearMarca(@RequestBody Marca marca) {
        Marca nuevaMarca = marcaServicio.crearMarca(marca);
        return new ResponseEntity<>(nuevaMarca, HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar")
    public ResponseEntity<?> eliminarMarca(@PathVariable("id") Long id) {
    	marcaServicio.eliminarMarca(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}