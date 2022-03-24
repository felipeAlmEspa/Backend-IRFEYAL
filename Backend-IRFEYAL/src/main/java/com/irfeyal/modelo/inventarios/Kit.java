package com.irfeyal.modelo.inventarios;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "kit")
@NamedQueries({
    @NamedQuery(name = "Kit.findAll", query = "SELECT k FROM Kit k"),
    @NamedQuery(name = "Kit.findBykit_id", query = "SELECT k FROM Kit k WHERE k.kit_id = :kit_id"),
    @NamedQuery(name = "Kit.findByPrecioKit", query = "SELECT k FROM Kit k WHERE k.precioKit = :precioKit"),
    @NamedQuery(name = "Kit.findByPeriodo", query = "SELECT k FROM Kit k WHERE k.periodo = :periodo")})
public class Kit implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long kit_id;
    
    
    @Column(name = "precio_kit")
    private Long precioKit;
    @Column(name = "periodo")
    private String periodo;
    
    @OneToMany()
    @JoinColumn(name = "kit_id")
    private List<ModuloLibro> modulo_libro = new ArrayList<ModuloLibro>();

    public Kit() {
    }
    
    public Kit(Long precioKit, String periodo, List<ModuloLibro> modulo_libro) {
		super();
		this.precioKit = precioKit;
		this.periodo = periodo;
		this.modulo_libro = modulo_libro;
	}




	public Kit(Long kit_id) {
        this.kit_id = kit_id;
    }

    public Long getkit_id() {
        return kit_id;
    }

    public void setkit_id(Long kit_id) {
        this.kit_id = kit_id;
    }

    public Long getPrecioKit() {
        return precioKit;
    }

    public void setPrecioKit(Long precioKit) {
        this.precioKit = precioKit;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

   

    public List<ModuloLibro> getModulo_libro() {
		return modulo_libro;
	}

	public void setModulo_libro(List<ModuloLibro> modulo_libro) {
		this.modulo_libro = modulo_libro;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (kit_id != null ? kit_id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kit)) {
            return false;
        }
        Kit other = (Kit) object;
        if ((this.kit_id == null && other.kit_id != null) || (this.kit_id != null && !this.kit_id.equals(other.kit_id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.irfeyal.kitmodulo.Kit[ kit_id=" + kit_id + " ]";
    }
    
}
