package com.irfeyal.modelo.rolseguridad;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="pais")
public class Pais implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long idPais;

	@Column(name="pais")
	private String pais;

	public Pais() {
	}

	public Long getIdPais() {
		return this.idPais;
	}

	public void setIdPais(Long idPais) {
		this.idPais = idPais;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	
	

}