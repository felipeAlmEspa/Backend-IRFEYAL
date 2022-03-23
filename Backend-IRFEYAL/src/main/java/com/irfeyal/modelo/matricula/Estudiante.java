package com.irfeyal.modelo.matricula;

import java.io.Serializable;
import javax.persistence.*;

import com.irfeyal.modelo.rolseguridad.Extension;
import com.irfeyal.modelo.rolseguridad.Persona;

@Entity
@Table(name="estudiantes")
@NamedQuery(name="Estudiante.findAll", query="SELECT e FROM Estudiante e")
public class Estudiante implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id_estudiante;

	@Column(name="estado_estudiante")
	private Boolean estadoEstudiante;

	//bi-directional many-to-one association to Extension

	@ManyToOne()
	@JoinColumn(name="idExtension")
	private Extension idExtension;

	//bi-directional one-to-one association to Persona
	@OneToOne()
	@JoinColumn(name="idPersona")
	private Persona idPersona;

	//bi-directional one-to-one association to Matricula

	public Estudiante() {
	}

	public Long getid_estudiante() {
		return this.id_estudiante;
	}

	public void setid_estudiante(Long id_estudiante) {
		this.id_estudiante = id_estudiante;
	}

	public Boolean getEstadoEstudiante() {
		return this.estadoEstudiante;
	}

	public void setEstadoEstudiante(Boolean estadoEstudiante) {
		this.estadoEstudiante = estadoEstudiante;
	}

	public Extension getId_extension() {
		return idExtension;
	}

	public void setId_extension(Extension id_extension) {
		this.idExtension = id_extension;
	}

	public Persona getId_persona() {
		return idPersona;
	}

	public void setId_persona(Persona idPersona) {
		this.idPersona = idPersona;
	}
	
}
