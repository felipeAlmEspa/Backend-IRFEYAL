package com.irfeyal.modelo.rolseguridad;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "genero")
public class Genero implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long idGenero;

	private String genero;

	//bi-directional many-to-one association to Persona
	@OneToMany(mappedBy="genero")
	private List<Persona> personas;

	public Genero() {
	}

	public Long getIdGenero() {
		return this.idGenero;
	}

	public void setIdGenero(Long idGenero) {
		this.idGenero = idGenero;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	public Persona addPersona(Persona persona) {
		getPersonas().add(persona);
		persona.setGenero(this);

		return persona;
	}

	public Persona removePersona(Persona persona) {
		getPersonas().remove(persona);
		persona.setGenero(null);

		return persona;
	}

}