package com.irfeyal.modelo.rolseguridad;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "parroquia")
public class Parroquia implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long idParroquia;

	private String parroquia;

	//bi-directional many-to-one association to Direccion
	@OneToMany(mappedBy="parroquia")
	private List<Direccion> direccions;

	public Parroquia() {
	}

	public Long getIdParroquia() {
		return this.idParroquia;
	}

	public void setIdParroquia(Long idParroquia) {
		this.idParroquia = idParroquia;
	}

	public String getParroquia() {
		return this.parroquia;
	}

	public void setParroquia(String parroquia) {
		this.parroquia = parroquia;
	}

	public List<Direccion> getDireccions() {
		return this.direccions;
	}

	public void setDireccions(List<Direccion> direccions) {
		this.direccions = direccions;
	}

	public Direccion addDireccion(Direccion direccion) {
		getDireccions().add(direccion);
		direccion.setParroquia(this);

		return direccion;
	}

	public Direccion removeDireccion(Direccion direccion) {
		getDireccions().remove(direccion);
		direccion.setParroquia(null);

		return direccion;
	}

}