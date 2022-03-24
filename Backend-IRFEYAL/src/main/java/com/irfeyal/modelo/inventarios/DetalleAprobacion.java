package com.irfeyal.modelo.inventarios;

import java.util.Date;

public class DetalleAprobacion {
	private String obs;
	private String detalleControl;
	private Date fechaAproba;
	private String tipoAdmin;
	private String nombreCoordi;
	private String precioKit;
	private String periodo;
	private String nombModulo;
	private String numeroModulo;
	private String codigoModul;
	private String ingresadoPor;

	public DetalleAprobacion() {
		super();
	}

	public DetalleAprobacion(String obs, String detalleControl, Date fechaAproba, String tipoAdmin, String nombreCoordi,
			String precioKit, String periodo, String nombModulo, String numeroModulo, String codigoModul,
			String ingresadoPor) {
		super();
		this.obs = obs;
		this.detalleControl = detalleControl;
		this.fechaAproba = fechaAproba;
		this.tipoAdmin = tipoAdmin;
		this.nombreCoordi = nombreCoordi;
		this.precioKit = precioKit;
		this.periodo = periodo;
		this.nombModulo = nombModulo;
		this.numeroModulo = numeroModulo;
		this.codigoModul = codigoModul;
		this.ingresadoPor = ingresadoPor;
	}



	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String getDetalleControl() {
		return detalleControl;
	}

	public void setDetalleControl(String detalleControl) {
		this.detalleControl = detalleControl;
	}

	public Date getFechaAproba() {
		return fechaAproba;
	}

	public void setFechaAproba(Date fechaAproba) {
		this.fechaAproba = fechaAproba;
	}

	public String getTipoAdmin() {
		return tipoAdmin;
	}

	public void setTipoAdmin(String tipoAdmin) {
		this.tipoAdmin = tipoAdmin;
	}

	public String getNombreCoordi() {
		return nombreCoordi;
	}

	public void setNombreCoordi(String nombreCoordi) {
		this.nombreCoordi = nombreCoordi;
	}

	public String getPrecioKit() {
		return precioKit;
	}

	public void setPrecioKit(String precioKit) {
		this.precioKit = precioKit;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getNombModulo() {
		return nombModulo;
	}

	public void setNombModulo(String nombModulo) {
		this.nombModulo = nombModulo;
	}



	public String getNumeroModulo() {
		return numeroModulo;
	}



	public void setNumeroModulo(String numeroModulo) {
		this.numeroModulo = numeroModulo;
	}



	public String getCodigoModul() {
		return codigoModul;
	}

	public void setCodigoModul(String codigoModul) {
		this.codigoModul = codigoModul;
	}

	public String getIngresadoPor() {
		return ingresadoPor;
	}

	public void setIngresadoPor(String ingresadoPor) {
		this.ingresadoPor = ingresadoPor;
	}

}
