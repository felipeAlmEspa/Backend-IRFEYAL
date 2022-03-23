package com.irfeyal.modelo.matricula;

import java.io.Serializable;
import javax.persistence.*;

import com.irfeyal.modelo.parametrizacionacademica.Curso;
import com.irfeyal.modelo.parametrizacionacademica.Modalidad;
import com.irfeyal.modelo.parametrizacionacademica.Paralelo;
import com.irfeyal.modelo.parametrizacionacademica.Periodo;
import com.irfeyal.modelo.rolseguridad.Usuario;

import java.sql.Timestamp;

@Entity
@Table(name="matriculas")
@NamedQuery(name="Matricula.findAll", query="SELECT m FROM Matricula m")

public class Matricula implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id_matricula;

	@Column(name="fecha_matricula")
	private Timestamp fechaMatricula;

	@OneToOne()
	@JoinColumn(name = "id_periodo")
	private Periodo id_periodo;

	//bi-directional many-to-one association to Curso
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_curso")
	private Curso id_curso;

	//bi-directional many-to-one association to Modalidad
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_modalidad")
	private Modalidad id_modalidad;

	//bi-directional many-to-one association to Usuario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_usuario")
	private Usuario id_usuario;

	//bi-directional many-to-one association to Paralelo
	@OneToOne()
	@JoinColumn(name="id_paralelo")
	private Paralelo id_paralelo;

	//bi-directional one-to-one association to Estudiante
	/*@OneToOne(fetch=FetchType.LAZY)
	@Column(name="id_estudiante")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Estudiante estudiante;
*/
	
//	 referencedColumnName = "id_estudiante", insertable = false, updatable = false
	
	@OneToOne()
	@JoinColumn(name = "id_estudiante")
	private Estudiante estudiante;

	
	
	public Matricula() {
	}
	
	public Long getid_matricula() {
		return this.id_matricula;
	}

	public void setid_matricula(Long id_matricula) {
		this.id_matricula = id_matricula;
	}

	public Timestamp getFechaMatricula() {
		return this.fechaMatricula;
	}

	public void setFechaMatricula(Timestamp fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	
	public Periodo getId_periodo() {
		return id_periodo;
	}

	public void setId_periodo(Periodo id_periodo) {
		this.id_periodo = id_periodo;
	}

	public Curso getCurso() {
		return id_curso;
	}

	public void setCurso(Curso curso) {
		this.id_curso = curso;
	}

	public Modalidad getModalidad() {
		return id_modalidad;
	}

	public void setModalidad(Modalidad modalidad) {
		this.id_modalidad = modalidad;
	}

	public Usuario getUsuario() {
		return id_usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.id_usuario = usuario;
	}

	public Paralelo getId_paralelo() {
		return id_paralelo;
	}

	public void setId_paralelo(Paralelo id_paralelo) {
		this.id_paralelo = id_paralelo;
	}

	public Estudiante getEstudiante() {
		return this.estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

}