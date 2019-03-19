package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sede_articulo database table.
 * 
 */
@Entity
@Table(name="sede_articulo")
@NamedQuery(name="SedeArticulo.findAll", query="SELECT s FROM SedeArticulo s")
public class SedeArticulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SedeArticuloPK id;

	private int cantidad;

	//bi-directional many-to-one association to Articulo
	@ManyToOne
	@JoinColumn(name="idArticuloFk")
	private Articulo articulo;

	//bi-directional many-to-one association to Sede
	@ManyToOne
	@JoinColumn(name="idSedeFk")
	private Sede sede;

	public SedeArticulo() {
	}

	public SedeArticuloPK getId() {
		return this.id;
	}

	public void setId(SedeArticuloPK id) {
		this.id = id;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public Sede getSede() {
		return this.sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

}