package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ajuste_articulo database table.
 * 
 */
@Entity
@Table(name="ajuste_articulo")
@NamedQuery(name="AjusteArticulo.findAll", query="SELECT a FROM AjusteArticulo a")
public class AjusteArticulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AjusteArticuloPK id;

	private int cantidad;

	private String codigoLote;

	private int precioTotal;

	private int precioUnidad;

	//bi-directional many-to-one association to AjusteInventario
	@ManyToOne
	@JoinColumn(name="idAjusteInevFk")
	private AjusteInventario ajusteInventario;

	//bi-directional many-to-one association to Articulo
	@ManyToOne
	@JoinColumn(name="idArticuloFk")
	private Articulo articulo;

	public AjusteArticulo() {
	}

	public AjusteArticuloPK getId() {
		return this.id;
	}

	public void setId(AjusteArticuloPK id) {
		this.id = id;
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

	public AjusteInventario getAjusteInventario() {
		return this.ajusteInventario;
	}

	public void setAjusteInventario(AjusteInventario ajusteInventario) {
		this.ajusteInventario = ajusteInventario;
	}

	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

}