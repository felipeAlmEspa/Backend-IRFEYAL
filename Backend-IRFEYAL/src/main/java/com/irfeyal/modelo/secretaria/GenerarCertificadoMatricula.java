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

import com.irfeyal.modelo.matricula.Matricula;
import com.irfeyal.modelo.rolseguridad.Direccion;
import com.irfeyal.modelo.rolseguridad.RolUsuario;

@Entity
@Table(name = "generar_certificado_matricula")

public class GenerarCertificadoMatricula implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(columnDefinition = "serial")
	private Long id_generar_certificado_matricula;
	@Column
	private int id;
	@Column
	private String rectora;
	@Column
	private Date fecha;
	
	@OneToOne
	@JoinColumn(name = "id_rolusuario")
	private RolUsuario rolusuario;
	
	@OneToOne
	@JoinColumn(name = "id_matricula")
	private Matricula matricula;
	
	@OneToOne
	@JoinColumn(name = "id_direccion")
	private Direccion direccion;

	public GenerarCertificadoMatricula() {
		
	}

	public GenerarCertificadoMatricula(Long id_generar_certificado_matricula, int id, String rectora, Date fecha,
			RolUsuario rolusuario, Matricula matricula, Direccion direccion) {
		super();
		this.id_generar_certificado_matricula = id_generar_certificado_matricula;
		this.id = id;
		this.rectora = rectora;
		this.fecha = fecha;
		this.rolusuario = rolusuario;
		this.matricula = matricula;
		this.direccion = direccion;
	}

	public Long getId_generar_certificado_matricula() {
		return id_generar_certificado_matricula;
	}

	public void setId_generar_certificado_matricula(Long id_generar_certificado_matricula) {
		this.id_generar_certificado_matricula = id_generar_certificado_matricula;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRectora() {
		return rectora;
	}

	public void setRectora(String rectora) {
		this.rectora = rectora;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public RolUsuario getRolusuario() {
		return rolusuario;
	}

	public void setRolusuario(RolUsuario rolusuario) {
		this.rolusuario = rolusuario;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}
