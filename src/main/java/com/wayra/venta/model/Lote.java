package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the lote database table.
 * 
 */
@Entity
@NamedQuery(name="Lote.findAll", query="SELECT l FROM Lote l")
public class Lote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idlote;

	private int cantidad;

	private String codigoLote;

	@Temporal(TemporalType.DATE)
	private Date fechaIngreso;

	@Temporal(TemporalType.DATE)
	private Date fechaVencimiento;

	//bi-directional many-to-one association to Articulo
	@ManyToOne
	@JoinColumn(name="idArticuloFk")
	private Articulo articulo;

	//bi-directional many-to-one association to Proveedor
	@ManyToOne
	@JoinColumn(name="idProveedorFk")
	private Proveedor proveedor;

	public Lote() {
	}

	public int getIdlote() {
		return this.idlote;
	}

	public void setIdlote(int idlote) {
		this.idlote = idlote;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getCodigoLote() {
		return this.codigoLote;
	}

	public void setCodigoLote(String codigoLote) {
		this.codigoLote = codigoLote;
	}

	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

}