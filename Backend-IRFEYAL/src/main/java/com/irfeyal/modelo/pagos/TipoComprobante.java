package com.irfeyal.modelo.pagos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.irfeyal.modelo.parametrizacionacademica.Periodo;

@Entity
@Table(name="tipo_comprobante")
public class TipoComprobante {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id_tipo_comprobante;
	@Column
	private String concepto_pago;
	
	@OneToMany()
	@JoinColumn(name = "id_periodo")
	private Periodo id_periodo;
	
	@OneToMany()
	@JoinColumn(name = "id_kit")
	private Kit kit;

	public TipoComprobante() {
		
	}
	public TipoComprobante(Long id_tipo_comprobante, String concepto_pago, Periodo id_periodo, Kit kit) {
		this.id_tipo_comprobante = id_tipo_comprobante;
		this.concepto_pago = concepto_pago;
		this.id_periodo = id_periodo;
		this.kit = kit;
	}

	public Long getIdTipoComprobante() {
		return id_tipo_comprobante;
	}

	public void setIdTipoComprobante(Long id_tipo_comprobante) {
		this.id_tipo_comprobante = id_tipo_comprobante;
	}

	public String getConcepto_pago() {
		return concepto_pago;
	}

	public void setConcepto_pago(String concepto_pago) {
		this.concepto_pago = concepto_pago;
	}

	public Periodo getPeriodo() {
		return id_periodo;
	}

	public void setPeriodo(Periodo id_periodo) {
		this.id_periodo = id_periodo;
	}

	public Kit getKit() {
		return kit;
	}

	public void setKit(Kit kit) {
		this.kit = kit;
	}
	
}