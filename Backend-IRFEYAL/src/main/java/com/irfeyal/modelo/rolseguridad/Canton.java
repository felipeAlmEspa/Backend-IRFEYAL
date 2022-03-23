package com.irfeyal.modelo.rolseguridad;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the canton database table.
 * 
 */
@Entity
@Table(name = "canton")
public class Canton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id_canton;

	@Column(name = "canton")
	private String canton;

	// bi-directional many-to-one association to Direccion
	@OneToMany(mappedBy = "canton")
	private List<Direccion> direccions;

	public Canton() {
		super();
	}

	public Long getIdCanton() {
		return this.id_canton;
	}

	public void setIdCanton(Long idCanton) {
		this.id_canton = idCanton;
	}

	public String getCanton() {
		return this.canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	public List<Direccion> getDireccions() {
		return this.direccions;
	}

	public void setDireccions(List<Direccion> direccions) {
		this.direccions = direccions;
	}

	public Direccion addDireccion(Direccion direccion) {
		getDireccions().add(direccion);
		direccion.setCanton(this);

		return direccion;
	}

	public Direccion removeDireccion(Direccion direccion) {
		getDireccions().remove(direccion);
		direccion.setCanton(null);

		return direccion;
	}

}