package com.irfeyal.modelo.secretaria;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.irfeyal.modelo.parametrizacionacademica.Curso;
import com.irfeyal.modelo.rolseguridad.RolUsuario;
import com.irfeyal.modelo.tutorias.Registro;

@Entity
@Table(name = "generar_certificado_promocion")

public class GenerarCertificadoPromocion implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id_generar_certificado_promocion;
	
	@Column
	private float promedio_general_num;
	@Column
	private String promedio_general_let;
	@Column
	private String descripcion;
	@Column
	private Date fecha;
	@Column
	private String rectora;
	
	@OneToOne
	@JoinColumn(name="id_rolusuario")
	private RolUsuario rolusuario;
	
	@OneToOne
	@JoinColumn(name="id_registro")
	private Registro registro;
	
	@OneToOne
	@JoinColumn(name="id_curso")
	private Curso curso;

	public GenerarCertificadoPromocion() {
		
	}

	public GenerarCertificadoPromocion(Long id_generar_certificado_promocion, float promedio_general_num, String promedio_general_let, 
			String descripcion, Date fecha, String rectora, RolUsuario rolusuario, Registro registro, Curso curso) {

		this.id_generar_certificado_promocion = id_generar_certificado_promocion;
		this.promedio_general_num = promedio_general_num;
		this.promedio_general_let = promedio_general_let;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.rectora = rectora;
		this.rolusuario = rolusuario;
		this.registro = registro;
		this.curso = curso;
	}

	public Long getId_generar_certificado_promocion() {
		return id_generar_certificado_promocion;
	}

	public void setId_generar_certificado_promocion(Long id_generar_certificado_promocion) {
		this.id_generar_certificado_promocion = id_generar_certificado_promocion;
	}

	public float getPromedio_general_num() {
		return promedio_general_num;
	}

	public void setPromedio_general_num(float promedio_general_num) {
		this.promedio_general_num = promedio_general_num;
	}

	public String getPromedio_general_let() {
		return promedio_general_let;
	}

	public void setPromedio_general_let(String promedio_general_let) {
		this.promedio_general_let = promedio_general_let;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getRectora() {
		return rectora;
	}

	public void setRectora(String rectora) {
		this.rectora = rectora;
	}

	public RolUsuario getRolusuario() {
		return rolusuario;
	}

	public void setRolusuario(RolUsuario rolusuario) {
		this.rolusuario = rolusuario;
	}

	public Registro getRegistro() {
		return registro;
	}

	public void setRegistro(Registro registro) {
		this.registro = registro;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
