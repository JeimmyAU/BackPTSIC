package com.example.prueba.repositorio;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prueba.modelo.Encuesta;
import com.example.prueba.modelo.Marca;

@Repository
public interface IMarcaRepository extends JpaRepository<Marca, Long> {
	
	List<Marca> findAll();
}
