package com.irfeyal.modelo.pagos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.irfeyal.modelo.inventarios.Kit;
import com.irfeyal.modelo.parametrizacionacademica.Periodo;

@Entity
@Table(name = "tipo_comprobante")
public class TipoComprobante implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id_tipo_comprobante;

	@Column
	private String concepto_pago;

	@OneToMany()
	@JoinColumn(name = "id_periodo")
	private List<Periodo> id_periodo;

	@OneToMany()
	@JoinColumn(name = "kit_id")
	private List<Kit> kit_id;

	public TipoComprobante() {

	}

	public TipoComprobante(Long id_tipo_comprobante, String concepto_pago, List<Periodo> id_periodo, List<Kit> kit_id) {
		super();
		this.id_tipo_comprobante = id_tipo_comprobante;
		this.concepto_pago = concepto_pago;
		this.id_periodo = id_periodo;
		this.kit_id = kit_id;
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

	public List<Kit> getKit() {
		return kit_id;
	}

	public void setKit(List<Kit> kit_id) {
		this.kit_id = kit_id;
	}

	public List<Periodo> getId_periodo() {
		return id_periodo;
	}

	public void setId_periodo(List<Periodo> id_periodo) {
		this.id_periodo = id_periodo;
	}

}