package com.example.prueba.servicio;

import java.util.List;

import com.example.prueba.modelo.Encuesta;

public interface IEncuestaService {
	
    public List<Encuesta> obtenerEncuestas();

    public Encuesta crearEncuesta(Encuesta encuesta);

    public Encuesta actualizarEncuesta( int id, Encuesta encuestaDatos);

    public void eliminarEncuesta(int id);

}
