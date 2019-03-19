package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the lotedisponible database table.
 * 
 */
@Entity
@NamedQuery(name="Lotedisponible.findAll", query="SELECT l FROM Lotedisponible l")
public class Lotedisponible implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String codigoLote;

	private int cantidad;

	@Temporal(TemporalType.DATE)
	private Date fechaVencimiento;

	private int idArticulo;

	public Lotedisponible() {
	}

	public String getCodigoLote() {
		return this.codigoLote;
	}

	public void setCodigoLote(String codigoLote) {
		this.codigoLote = codigoLote;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getIdArticulo() {
		return this.idArticulo;
	}

	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}

}