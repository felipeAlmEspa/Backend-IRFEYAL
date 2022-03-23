package com.irfeyal.modelo.rolseguridad;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "provincia")
public class Provincia implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long idProvincia;

	private String provincia;

	//bi-directional many-to-one association to Direccion
	@OneToMany(mappedBy="provincia")
	private List<Direccion> direccions;

	public Provincia() {
	}

	public Long getIdProvincia() {
		return this.idProvincia;
	}

	public void setIdProvincia(Long idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getProvincia() {
		return this.provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public List<Direccion> getDireccions() {
		return this.direccions;
	}

	public void setDireccions(List<Direccion> direccions) {
		this.direccions = direccions;
	}

	public Direccion addDireccion(Direccion direccion) {
		getDireccions().add(direccion);
		direccion.setProvincia(this);

		return direccion;
	}

	public Direccion removeDireccion(Direccion direccion) {
		getDireccions().remove(direccion);
		direccion.setProvincia(null);

		return direccion;
	}

}