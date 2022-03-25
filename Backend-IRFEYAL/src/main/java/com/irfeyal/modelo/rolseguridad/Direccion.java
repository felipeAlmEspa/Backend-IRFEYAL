package com.irfeyal.modelo.rolseguridad;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "direccion")
public class Direccion implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long idDireccion;

	@Column(name="av_principal")
	private String avPrincipal;

	@Column(name="av_secundaria")
	private String avSecundaria;

	//bi-directional many-to-one association to Canton
	@ManyToOne
	@JoinColumn(name="id_canton")
	private Canton canton;

	

	//bi-directional many-to-one association to Pais
	@ManyToOne
	@JoinColumn(name="id_pais")
	private Pais pais;

	//bi-directional many-to-one association to Parroquia
	@ManyToOne
	@JoinColumn(name="id_parroquia")
	private Parroquia parroquia;

	//bi-directional many-to-one association to Provincia
	@ManyToOne
	@JoinColumn(name="id_provincia")
	private Provincia provincia;

	//bi-directional many-to-one association to Extension
	@OneToMany(mappedBy="direccion")
	private List<Extension> extensions;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="direccion")
	private List<Persona> personas;

	public Direccion() {
	}

	public Long getIdDireccion() {
		return this.idDireccion;
	}

	public void setIdDireccion(Long idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getAvPrincipal() {
		return this.avPrincipal;
	}

	public void setAvPrincipal(String avPrincipal) {
		this.avPrincipal = avPrincipal;
	}

	public String getAvSecundaria() {
		return this.avSecundaria;
	}

	public void setAvSecundaria(String avSecundaria) {
		this.avSecundaria = avSecundaria;
	}

	public Canton getCanton() {
		return this.canton;
	}

	public void setCanton(Canton canton) {
		this.canton = canton;
	}



	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Parroquia getParroquia() {
		return this.parroquia;
	}

	public void setParroquia(Parroquia parroquia) {
		this.parroquia = parroquia;
	}

	public Provincia getProvincia() {
		return this.provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public List<Extension> getExtensions() {
		return this.extensions;
	}

	public void setExtensions(List<Extension> extensions) {
		this.extensions = extensions;
	}

	public Extension addExtension(Extension extension) {
		getExtensions().add(extension);
		extension.setDireccion(this);

		return extension;
	}

	public Extension removeExtension(Extension extension) {
		getExtensions().remove(extension);
		extension.setDireccion(null);

		return extension;
	}

	

	public List<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Persona addPersona(Persona persona) {
		getPersonas().add(persona);
		persona.setDireccion(this);

		return persona;
	}

	public Persona removePersona(Persona persona) {
		getPersonas().remove(persona);
		persona.setDireccion(null);

		return persona;
	}

}