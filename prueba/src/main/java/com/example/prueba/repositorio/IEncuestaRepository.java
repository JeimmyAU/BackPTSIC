package com.example.prueba.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prueba.modelo.Encuesta;

@Repository
public interface IEncuestaRepository extends JpaRepository<Encuesta, Integer> {
	
	List<Encuesta> findAll();
}
