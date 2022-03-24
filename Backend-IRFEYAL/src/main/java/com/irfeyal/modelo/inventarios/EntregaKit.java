package com.irfeyal.modelo.inventarios;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.irfeyal.modelo.rolseguridad.RolUsuario;

/**
 *
 * @author User
 */
@Entity
@Table(name = "entrega_kit")
@NamedQueries({ @NamedQuery(name = "EntregaKit.findAll", query = "SELECT e FROM EntregaKit e"),
		@NamedQuery(name = "EntregaKit.findByEntregakitId", query = "SELECT e FROM EntregaKit e WHERE e.entregakitId = :entregakitId"),
		@NamedQuery(name = "EntregaKit.findByFechaEntregaKit", query = "SELECT e FROM EntregaKit e WHERE e.fechaEntregaKit = :fechaEntregaKit")
		 })
public class EntregaKit implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@Column(name = "entregakit_id")
	private Integer entregakitId;
	@Column(name = "fecha_entrega_kit")
	@Temporal(TemporalType.DATE)
	private Date fechaEntregaKit;

	@OneToOne()
	@JoinColumn(name = "aprobacion_id")
	private Aprobacion aprobacion = new Aprobacion();

	@OneToOne()
	@JoinColumn(name = "id_rol_usuario")
	private RolUsuario secretaria = new RolUsuario();

	@OneToOne()
	@JoinColumn(name = "kit_id")
	private Kit kit_id = new Kit();

	@OneToOne()
	@JoinColumn(name = "id_estudiante")
	private RolUsuario estudiante = new RolUsuario();

	
	public EntregaKit() {
	}

	public EntregaKit(Integer entregakitId) {
		this.entregakitId = entregakitId;
	}



	public Integer getEntregakitId() {
		return entregakitId;
	}

	public void setEntregakitId(Integer entregakitId) {
		this.entregakitId = entregakitId;
	}

	public Date getFechaEntregaKit() {
		return fechaEntregaKit;
	}

	public void setFechaEntregaKit(Date fechaEntregaKit) {
		this.fechaEntregaKit = fechaEntregaKit;
	}

	
	public Aprobacion getAprobacion() {
		return aprobacion;
	}

	public void setAprobacion(Aprobacion aprobacion) {
		this.aprobacion = aprobacion;
	}

	public RolUsuario getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(RolUsuario secretaria) {
		this.secretaria = secretaria;
	}

	public Kit getKit() {
		return kit_id;
	}

	public void setKit(Kit kit_id) {
		this.kit_id = kit_id;
	}

	public RolUsuario getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(RolUsuario estudiante) {
		this.estudiante = estudiante;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (entregakitId != null ? entregakitId.hashCode() : 0);
		return hash;
	}
	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof EntregaKit)) {
			return false;
		}
		EntregaKit other = (EntregaKit) object;
		if ((this.entregakitId == null && other.entregakitId != null)
				|| (this.entregakitId != null && !this.entregakitId.equals(other.entregakitId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.irfeyal.ingresokit.resources.EntregaKit[ entregakitId=" + entregakitId + " ]";
	}

}
