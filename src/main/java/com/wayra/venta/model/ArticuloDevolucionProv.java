package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the articulo_devolucion_prov database table.
 * 
 */
@Entity
@Table(name="articulo_devolucion_prov")
@NamedQuery(name="ArticuloDevolucionProv.findAll", query="SELECT a FROM ArticuloDevolucionProv a")
public class ArticuloDevolucionProv implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ArticuloDevolucionProvPK id;

	private int cantidad;

	private String codigoLote;

	//bi-directional many-to-one association to Articulo
	@ManyToOne
	@JoinColumn(name="idArticuloFk")
	private Articulo articulo;

	//bi-directional many-to-one association to DevolucionProv
	@ManyToOne
	@JoinColumn(name="idDevolucionProvFk")
	private DevolucionProv devolucionProv;

	public ArticuloDevolucionProv() {
	}

	public ArticuloDevolucionProvPK getId() {
		return this.id;
	}

	public void setId(ArticuloDevolucionProvPK id) {
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

	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public DevolucionProv getDevolucionProv() {
		return this.devolucionProv;
	}

	public void setDevolucionProv(DevolucionProv devolucionProv) {
		this.devolucionProv = devolucionProv;
	}

}