package com.irfeyal.modelo.inventarios;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */
@Entity
@Table(name = "ingreso_kit")
@NamedQueries({ @NamedQuery(name = "IngresoKit.findAll", query = "SELECT i FROM IngresoKit i"),
		@NamedQuery(name = "IngresoKit.findByIngrekitId", query = "SELECT i FROM IngresoKit i WHERE i.ingrekitId = :ingrekitId"),
		@NamedQuery(name = "IngresoKit.findByFechaIngreso", query = "SELECT i FROM IngresoKit i WHERE i.fechaIngreso = :fechaIngreso") })
public class IngresoKit implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "ingrekit_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ingrekitId;
	
	
	@Column(name = "fecha_ingreso")
	@Temporal(TemporalType.DATE)
	private Date fechaIngreso;
	
	@OneToOne()
	@JoinColumn(name = "aprobacion_id")
	private Aprobacion aprobacion = new Aprobacion();
	
	@OneToOne()
	@JoinColumn(name = "kit_id")
	private Kit kit = new Kit();

	

	/*
	 * @OneToOne()
	 * 
	 * @JoinColumn(name = "id_secretaria") private RolUsuario secretaria = new
	 * RolUsuario();
	 */

	@Column(name = "id_secretaria")
	private Integer id_secretaria;

	public IngresoKit() {
	}

	
	public IngresoKit(Date fechaIngreso, Aprobacion aprobacion, Kit kit, Integer id_secretaria) {
		super();
		this.fechaIngreso = fechaIngreso;
		this.aprobacion = aprobacion;
		this.kit = kit;
		this.id_secretaria = id_secretaria;
	}







	public IngresoKit(Integer ingrekitId) {
		this.ingrekitId = ingrekitId;
	}

	public Integer getIngrekitId() {
		return ingrekitId;
	}

	public void setIngrekitId(Integer ingrekitId) {
		this.ingrekitId = ingrekitId;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Kit getKit() {
		return kit;
	}

	public void setKit(Kit kit) {
		this.kit = kit;
	}

	public Aprobacion getAprobacion() {
		return aprobacion;
	}

	public void setAprobacion(Aprobacion aprobacion) {
		this.aprobacion = aprobacion;
	}

	public Integer getId_secretaria() {
		return id_secretaria;
	}

	public void setId_secretaria(Integer id_secretaria) {
		this.id_secretaria = id_secretaria;
	}

	/*
	 * public RolUsuario getSecretaria() { return secretaria; }
	 * 
	 * public void setSecretaria(RolUsuario secretaria) { this.secretaria =
	 * secretaria; }
	 * 
	 * public Aprobacion getAprobacionId() { return aprobacionId; }
	 * 
	 * public void setAprobacionId(Aprobacion aprobacionId) { this.aprobacionId =
	 * aprobacionId; }
	 * 
	 * public RolUsuario getIdSecretaria() { return idSecretaria; }
	 * 
	 * public void setIdSecretaria(RolUsuario idSecretaria) { this.idSecretaria =
	 * idSecretaria; }
	 */
	@Override
	public int hashCode() {
		int hash = 0;
		hash += (ingrekitId != null ? ingrekitId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof IngresoKit)) {
			return false;
		}
		IngresoKit other = (IngresoKit) object;
		if ((this.ingrekitId == null && other.ingrekitId != null)
				|| (this.ingrekitId != null && !this.ingrekitId.equals(other.ingrekitId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.irfeyal.ingresokit.resources.IngresoKit[ ingrekitId=" + ingrekitId + " ]";
	}

}
