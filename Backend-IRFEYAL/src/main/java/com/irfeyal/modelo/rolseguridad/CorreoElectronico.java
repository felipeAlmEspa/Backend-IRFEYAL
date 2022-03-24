package com.irfeyal.modelo.rolseguridad;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="correo_electronico")
public class CorreoElectronico implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id_correo;

	private String correo;

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

	public CorreoElectronico() {
	}

	public Long getIdCorreo() {
		return this.id_correo;
	}

	public void setIdCorreo(Long id_correo) {
		this.id_correo = id_correo;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
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