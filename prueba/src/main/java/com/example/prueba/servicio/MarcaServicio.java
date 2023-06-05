package com.example.prueba.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prueba.modelo.Marca;
import com.example.prueba.repositorio.IMarcaRepository;

@Service
public class MarcaServicio {
@Autowired
    IMarcaRepository marcaRepository;


    public List<Marca> obtenerMarcas() {
        List<Marca> marcas = marcaRepository.findAll();
        return marcas;
    }


    public Marca crearMarca(Marca marca) {
        Marca nuevaMarca = marcaRepository.save(marca);
        return nuevaMarca;
    }


    public void eliminarMarca(Long id) {
        Marca marca = marcaRepository.findById(id)
                .orElseThrow();

        marcaRepository.delete(marca);
    }
}
