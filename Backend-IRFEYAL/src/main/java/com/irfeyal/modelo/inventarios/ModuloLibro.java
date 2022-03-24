package com.irfeyal.modelo.inventarios;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "modulo_libro")
@NamedQueries({
    @NamedQuery(name = "ModuloLibro.findAll", query = "SELECT m FROM ModuloLibro m"),
    @NamedQuery(name = "ModuloLibro.findByModulolibroId", query = "SELECT m FROM ModuloLibro m WHERE m.modulolibroId = :modulolibroId"),
    @NamedQuery(name = "ModuloLibro.findByCodModulo", query = "SELECT m FROM ModuloLibro m WHERE m.codModulo = :codModulo"),
    @NamedQuery(name = "ModuloLibro.findByNombreModulo", query = "SELECT m FROM ModuloLibro m WHERE m.nombreModulo = :nombreModulo"),
    @NamedQuery(name = "ModuloLibro.findByCurso", query = "SELECT m FROM ModuloLibro m WHERE m.curso = :curso"),
    @NamedQuery(name = "ModuloLibro.findByCantidad", query = "SELECT m FROM ModuloLibro m WHERE m.cantidad = :cantidad"),
    @NamedQuery(name = "ModuloLibro.findByNumero", query = "SELECT m FROM ModuloLibro m WHERE m.numero = :numero"),
    @NamedQuery(name = "ModuloLibro.findByNumeroModulo", query = "SELECT m FROM ModuloLibro m WHERE m.numeroModulo = :numeroModulo")})
public class ModuloLibro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "modulolibro_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer modulolibroId;
    
    @Basic(optional = false)
    @Column(name = "cod_modulo")
    private int codModulo;
    @Column(name = "nombre_modulo")
    private String nombreModulo;
    @Column(name = "curso")
    private String curso;
    @Column(name = "cantidad")
    private Long cantidad;
    @Column(name = "numero")
    private Long numero;
    @Column(name = "numero_modulo")
    private String numeroModulo;
    
    
   // @ManyToOne(fetch = FetchType.LAZY)
   // private Kit kitId;

    public ModuloLibro() {
    }

    public ModuloLibro(int codModulo, String nombreModulo, String curso, Long cantidad, Long numero,
			String numeroModulo) {
		super();
		this.codModulo = codModulo;
		this.nombreModulo = nombreModulo;
		this.curso = curso;
		this.cantidad = cantidad;
		this.numero = numero;
		this.numeroModulo = numeroModulo;
	}





	public ModuloLibro(Integer modulolibroId) {
        this.modulolibroId = modulolibroId;
    }

    public ModuloLibro(Integer modulolibroId, int codModulo) {
        this.modulolibroId = modulolibroId;
        this.codModulo = codModulo;
    }

    public Integer getModulolibroId() {
        return modulolibroId;
    }

    public void setModulolibroId(Integer modulolibroId) {
        this.modulolibroId = modulolibroId;
    }

    public int getCodModulo() {
        return codModulo;
    }

    public void setCodModulo(int codModulo) {
        this.codModulo = codModulo;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getNumeroModulo() {
        return numeroModulo;
    }

    public void setNumeroModulo(String numeroModulo) {
        this.numeroModulo = numeroModulo;
    }
/*
    public Kit getKitId() {
        return kitId;
    }

    public void setKitId(Kit kitId) {
        this.kitId = kitId;
    }
*/
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modulolibroId != null ? modulolibroId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModuloLibro)) {
            return false;
        }
        ModuloLibro other = (ModuloLibro) object;
        if ((this.modulolibroId == null && other.modulolibroId != null) || (this.modulolibroId != null && !this.modulolibroId.equals(other.modulolibroId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.irfeyal.kitmodulo.ModuloLibro[ modulolibroId=" + modulolibroId + " ]";
    }
    
}
