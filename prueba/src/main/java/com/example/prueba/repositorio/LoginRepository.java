package com.example.prueba.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.prueba.modelo.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

    public Login findByNombreUsuario(String nombreUsuario);
}
