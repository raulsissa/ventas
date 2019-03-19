package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the orden_compra_articulo database table.
 * 
 */
@Entity
@Table(name="orden_compra_articulo")
@NamedQuery(name="OrdenCompraArticulo.findAll", query="SELECT o FROM OrdenCompraArticulo o")
public class OrdenCompraArticulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrdenCompraArticuloPK id;

	private int cantidad;

	private int dsctoMonto;

	private int dsctoPciento;

	private int precioTotal;

	private int precioUnidad;

	//bi-directional many-to-one association to Articulo
	@ManyToOne
	@JoinColumn(name="idArticuloFk")
	private Articulo articulo;

	//bi-directional many-to-one association to OrdenCompra
	@ManyToOne
	@JoinColumn(name="idOrdenCompraFk")
	private OrdenCompra ordenCompra;

	public OrdenCompraArticulo() {
	}

	public OrdenCompraArticuloPK getId() {
		return this.id;
	}

	public void setId(OrdenCompraArticuloPK id) {
		this.id = id;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getDsctoMonto() {
		return this.dsctoMonto;
	}

	public void setDsctoMonto(int dsctoMonto) {
		this.dsctoMonto = dsctoMonto;
	}

	public int getDsctoPciento() {
		return this.dsctoPciento;
	}

	public void setDsctoPciento(int dsctoPciento) {
		this.dsctoPciento = dsctoPciento;
	}

	public int getPrecioTotal() {
		return this.precioTotal;
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}

	public int getPrecioUnidad() {
		return this.precioUnidad;
	}

	public void setPrecioUnidad(int precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public OrdenCompra getOrdenCompra() {
		return this.ordenCompra;
	}

	public void setOrdenCompra(OrdenCompra ordenCompra) {
		this.ordenCompra = ordenCompra;
	}

}