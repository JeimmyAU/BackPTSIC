package com.example.prueba.modelo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "encuesta")
public class Encuesta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "num_documento")
	private int numeroDocumento;

	@Column(name = "email")
	private String email;

	@Column(name = "comentario")
	private String comentarios;

	@Column(name = "marca_favorito_pc")
	private String marcaFavoritaPc;

	@Column(name = "fecha_respuesta")
	private Date fechaRespuesta;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(int numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getMarcaFavoritaPc() {
		return marcaFavoritaPc;
	}

	public void setMarcaFavoritaPc(String marcaFavoritaPc) {
		this.marcaFavoritaPc = marcaFavoritaPc;
	}

	public Date getFechaRespuesta() {
		return fechaRespuesta;
	}

	public void setFechaRespuesta(Date fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}

}
