package com.example.prueba.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.prueba.modelo.Encuesta;
import com.example.prueba.repositorio.IEncuestaRepository;

@Service
public class EncuestaServicio implements IEncuestaService{
	
	@Autowired
    private IEncuestaRepository encuestaRepository;
    

    public List<Encuesta>obtenerEncuestas() {
        List<Encuesta> encuestas = encuestaRepository.findAll();
        return encuestas;
    }


    public Encuesta crearEncuesta(Encuesta encuesta) {
        Encuesta nuevaEncuesta = encuestaRepository.save(encuesta);
        return nuevaEncuesta;
    }

    public Encuesta actualizarEncuesta( int id, Encuesta encuestaDatos) {
        Encuesta encuesta = encuestaRepository.findById(id)
                .orElseThrow();

        encuesta.setNumeroDocumento(encuestaDatos.getNumeroDocumento());
        encuesta.setEmail(encuestaDatos.getEmail());
        encuesta.setComentarios(encuestaDatos.getComentarios());
        encuesta.setMarcaFavoritaPc(encuestaDatos.getMarcaFavoritaPc());
        encuesta.setFechaRespuesta(encuestaDatos.getFechaRespuesta());

        Encuesta encuestaActualizada = encuestaRepository.save(encuesta);
        return encuestaActualizada;
    }


    public void eliminarEncuesta(int id) {
        Encuesta encuesta = encuestaRepository.findById(id)
                .orElseThrow();

        encuestaRepository.delete(encuesta);
    }

	
}
