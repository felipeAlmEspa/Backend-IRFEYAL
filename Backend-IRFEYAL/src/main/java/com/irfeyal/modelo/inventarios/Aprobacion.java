package com.irfeyal.modelo.inventarios;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "aprobacion")
/*@NamedQueries({
    @NamedQuery(name = "Aprobacion.findAll", query = "SELECT a FROM Aprobacion a"),
    @NamedQuery(name = "Aprobacion.findByAprobacionId", query = "SELECT a FROM Aprobacion a WHERE a.aprobacionId = :aprobacionId"),
    @NamedQuery(name = "Aprobacion.findByObservacionAproba", query = "SELECT a FROM Aprobacion a WHERE a.observacionAproba = :observacionAproba"),
    @NamedQuery(name = "Aprobacion.findByEstadoAproba", query = "SELECT a FROM Aprobacion a WHERE a.estadoAproba = :estadoAproba"),
    @NamedQuery(name = "Aprobacion.findByDetalleControl", query = "SELECT a FROM Aprobacion a WHERE a.detalleControl = :detalleControl"),
    @NamedQuery(name = "Aprobacion.findByFechaAprobacion", query = "SELECT a FROM Aprobacion a WHERE a.fechaAprobacion = :fechaAprobacion"),
    @NamedQuery(name = "Aprobacion.findByFechaControl", query = "SELECT a FROM Aprobacion a WHERE a.fechaControl = :fechaControl")})*/
public class Aprobacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "aprobacion_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aprobacionId;
    
    @Column(name = "observacion_aproba")
    private String observacionAproba;
    @Column(name = "estado_aproba")
    private Boolean estadoAproba;
    @Column(name = "detalle_control")
    private String detalleControl;
    @Column(name = "fecha_aprobacion")
    @Temporal(TemporalType.DATE)
    private Date fechaAprobacion;
    @Column(name = "fecha_control")
    @Temporal(TemporalType.DATE)
    private Date fechaControl;
    @Column(name = "id_rolu_admin")
    private Integer id_rolu_admin;

    
    
   /* 
    @OneToOne()
    @JoinColumn(name = "id_rolu_admin")
    private RolUsuario id_rolu_admin = new RolUsuario();*/
    
    
    
    
    /*
    @OneToOne()
    @JoinColumn(name = "aprobacion_id")
    private IngresoKit ingresoKit = new IngresoKit();
    
    */
    
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "aprobacionId")
    //private Collection<EntregaKit> entregaKitCollection;
  /*  
    @JoinColumn(name = "id_rolu_admin", referencedColumnName = "id_rolusuario")
    @ManyToOne(optional = false)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aprobacionId")
    private Collection<IngresoKit> ingresoKitCollection;
    
    @JoinColumn(name = "id_rolu_admin", referencedColumnName = "id_rolusuario")
    @ManyToOne(optional = false)
    private RolUsuario idRoluAdmin;
    */
    
    public Aprobacion() {
    }
    
	public Aprobacion(Integer aprobacionId, String observacionAproba, Boolean estadoAproba, String detalleControl,
			Date fechaAprobacion, Date fechaControl, Integer id_rolu_admin) {
		super();
		this.aprobacionId = aprobacionId;
		this.observacionAproba = observacionAproba;
		this.estadoAproba = estadoAproba;
		this.detalleControl = detalleControl;
		this.fechaAprobacion = fechaAprobacion;
		this.fechaControl = fechaControl;
		this.id_rolu_admin = id_rolu_admin;
	}


	public Aprobacion(Integer aprobacionId) {
        this.aprobacionId = aprobacionId;
    }

    public Integer getAprobacionId() {
        return aprobacionId;
    }

    public void setAprobacionId(Integer aprobacionId) {
        this.aprobacionId = aprobacionId;
    }

    public String getObservacionAproba() {
        return observacionAproba;
    }

    public void setObservacionAproba(String observacionAproba) {
        this.observacionAproba = observacionAproba;
    }

    public Boolean getEstadoAproba() {
        return estadoAproba;
    }

    public void setEstadoAproba(Boolean estadoAproba) {
        this.estadoAproba = estadoAproba;
    }

    public String getDetalleControl() {
        return detalleControl;
    }

    public void setDetalleControl(String detalleControl) {
        this.detalleControl = detalleControl;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public Date getFechaControl() {
        return fechaControl;
    }

    public void setFechaControl(Date fechaControl) {
        this.fechaControl = fechaControl;
    }
    
    
    
    public Integer getId_rolu_admin() {
		return id_rolu_admin;
	}

	public void setId_rolu_admin(Integer id_rolu_admin) {
		this.id_rolu_admin = id_rolu_admin;
	}

	/*
    
public RolUsuario getId_rolu_admin() {
		return id_rolu_admin;
	}

	public void setId_rolu_admin(RolUsuario id_rolu_admin) {
		this.id_rolu_admin = id_rolu_admin;
	}

	
    public Collection<EntregaKit> getEntregaKitCollection() {
        return entregaKitCollection;
    }

    public void setEntregaKitCollection(Collection<EntregaKit> entregaKitCollection) {
        this.entregaKitCollection = entregaKitCollection;
    }

    public RolUsuario getIdRoluAdmin() {
        return idRoluAdmin;
    }

    public void setIdRoluAdmin(RolUsuario idRoluAdmin) {
        this.idRoluAdmin = idRoluAdmin;
    }

    public Collection<IngresoKit> getIngresoKitCollection() {
        return ingresoKitCollection;
    }

    public void setIngresoKitCollection(Collection<IngresoKit> ingresoKitCollection) {
        this.ingresoKitCollection = ingresoKitCollection;
    }

    public IngresoKit getIngresoKit() {
		return ingresoKit;
	}

	public void setIngresoKit(IngresoKit ingresoKit) {
		this.ingresoKit = ingresoKit;
	}
*/
	@Override
    public int hashCode() {
        int hash = 0;
        hash += (aprobacionId != null ? aprobacionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aprobacion)) {
            return false;
        }
        Aprobacion other = (Aprobacion) object;
        if ((this.aprobacionId == null && other.aprobacionId != null) || (this.aprobacionId != null && !this.aprobacionId.equals(other.aprobacionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.irfeyal.ingresokit.resources.Aprobacion[ aprobacionId=" + aprobacionId + " ]";
    }
    
}
