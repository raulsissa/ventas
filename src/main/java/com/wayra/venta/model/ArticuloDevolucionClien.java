package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the articulo_devolucion_clien database table.
 * 
 */
@Entity
@Table(name="articulo_devolucion_clien")
@NamedQuery(name="ArticuloDevolucionClien.findAll", query="SELECT a FROM ArticuloDevolucionClien a")
public class ArticuloDevolucionClien implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ArticuloDevolucionClienPK id;

	private int cantidad;

	private String precioTotal;

	private String precioUnidad;

	//bi-directional many-to-one association to Articulo
	@ManyToOne
	@JoinColumn(name="idArticuloFk")
	private Articulo articulo;

	//bi-directional many-to-one association to DevolucionClien
	@ManyToOne
	@JoinColumn(name="idDevolucionClienFk")
	private DevolucionClien devolucionClien;

	public ArticuloDevolucionClien() {
	}

	public ArticuloDevolucionClienPK getId() {
		return this.id;
	}

	public void setId(ArticuloDevolucionClienPK id) {
		this.id = id;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getPrecioTotal() {
		return this.precioTotal;
	}

	public void setPrecioTotal(String precioTotal) {
		this.precioTotal = precioTotal;
	}

	public String getPrecioUnidad() {
		return this.precioUnidad;
	}

	public void setPrecioUnidad(String precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public DevolucionClien getDevolucionClien() {
		return this.devolucionClien;
	}

	public void setDevolucionClien(DevolucionClien devolucionClien) {
		this.devolucionClien = devolucionClien;
	}

}