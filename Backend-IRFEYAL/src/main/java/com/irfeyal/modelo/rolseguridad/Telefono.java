package com.irfeyal.modelo.rolseguridad;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "telefono")
public class Telefono implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long idTelefono;

	@Column(name="num_celular")
	private String numCelular;

	private String telefono;

	//bi-directional many-to-one association to Empresa
	@ManyToOne
	@JoinColumn(name="id_empresa")
	private Empresa empresa;

	//bi-directional many-to-one association to Extension
	@ManyToOne
	@JoinColumn(name="id_extension")
	private Extension extension;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="id_persona")
	private Persona persona;

	public Telefono() {
	}

	public Long getIdTelefono() {
		return this.idTelefono;
	}

	public void setIdTelefono(Long idTelefono) {
		this.idTelefono = idTelefono;
	}

	public String getNumCelular() {
		return this.numCelular;
	}

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Extension getExtension() {
		return this.extension;
	}

	public void setExtension(Extension extension) {
		this.extension = extension;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}