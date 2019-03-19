package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the venta_articulo database table.
 * 
 */
@Entity
@Table(name="venta_articulo")
@NamedQuery(name="VentaArticulo.findAll", query="SELECT v FROM VentaArticulo v")
public class VentaArticulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VentaArticuloPK id;

	private int cantidad;

	private BigDecimal dsctoMonto;

	private BigDecimal dsctoPciento;

	private BigDecimal precioTotal;

	private BigDecimal precioUnidad;

	//bi-directional many-to-one association to Articulo
	@ManyToOne
	@JoinColumn(name="idArticuloFk")
	private Articulo articulo;

	//bi-directional many-to-one association to Venta
	@ManyToOne
	@JoinColumn(name="idVentaFk")
	private Venta venta;

	public VentaArticulo() {
	}

	public VentaArticuloPK getId() {
		return this.id;
	}

	public void setId(VentaArticuloPK id) {
		this.id = id;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getDsctoMonto() {
		return this.dsctoMonto;
	}

	public void setDsctoMonto(BigDecimal dsctoMonto) {
		this.dsctoMonto = dsctoMonto;
	}

	public BigDecimal getDsctoPciento() {
		return this.dsctoPciento;
	}

	public void setDsctoPciento(BigDecimal dsctoPciento) {
		this.dsctoPciento = dsctoPciento;
	}

	public BigDecimal getPrecioTotal() {
		return this.precioTotal;
	}

	public void setPrecioTotal(BigDecimal precioTotal) {
		this.precioTotal = precioTotal;
	}

	public BigDecimal getPrecioUnidad() {
		return this.precioUnidad;
	}

	public void setPrecioUnidad(BigDecimal precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Venta getVenta() {
		return this.venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

}