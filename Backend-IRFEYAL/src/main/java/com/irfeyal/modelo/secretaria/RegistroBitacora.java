package com.irfeyal.modelo.secretaria;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.irfeyal.modelo.rolseguridad.RolUsuario;

import java.sql.Timestamp;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
@Table (name = "registro_bitacora")

public class RegistroBitacora implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(columnDefinition = "serial")
	private Long id_registro_bitacora;
	
	@Column
	private String solicitante;
	@Column
	private String emisor;
	@Column
	private Timestamp fecha;
	@Column
	private Timestamp hora;
	
	@OneToOne
	@JoinColumn(name = "id_rolusuario")
	private RolUsuario rolusuario;

	
	@OneToOne
	@JoinColumn(name = "id_registro_bitacora")
	private Documento documento;
	
	
	public RegistroBitacora() {
		super();
	}

	public RegistroBitacora(Long id_registro_bitacora, String solicitante, String emisor, Timestamp fecha, Timestamp hora, RolUsuario rolusuario, Documento documento) {
		
		this.id_registro_bitacora = id_registro_bitacora;
		this.solicitante = solicitante;
		this.emisor = emisor;
		this.fecha = fecha;
		this.hora = hora;
		this.rolusuario = rolusuario;
		this.documento = documento;
	}

	public Long getId_registro_bitacora() {
		return id_registro_bitacora;
	}

	public void setId_registro_bitacora(Long id_registro_bitacora) {
		this.id_registro_bitacora = id_registro_bitacora;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public Timestamp getHora() {
		return hora;
	}

	public void setHora(Timestamp hora) {
		this.hora = hora;
	}

	public RolUsuario getRolusuario() {
		return rolusuario;
	}

	public void setRolusuario(RolUsuario rolusuario) {
		this.rolusuario = rolusuario;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	
}
