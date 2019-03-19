package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the impuesto database table.
 * 
 */
@Entity
@NamedQuery(name="Impuesto.findAll", query="SELECT i FROM Impuesto i")
public class Impuesto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idImpuesto;

	private String tipoImpuesto;

	private BigDecimal valorImpuesto;

	//bi-directional many-to-one association to Articulo
	@OneToMany(mappedBy="impuesto")
	private List<Articulo> articulos;

	public Impuesto() {
	}

	public int getIdImpuesto() {
		return this.idImpuesto;
	}

	public void setIdImpuesto(int idImpuesto) {
		this.idImpuesto = idImpuesto;
	}

	public String getTipoImpuesto() {
		return this.tipoImpuesto;
	}

	public void setTipoImpuesto(String tipoImpuesto) {
		this.tipoImpuesto = tipoImpuesto;
	}

	public BigDecimal getValorImpuesto() {
		return this.valorImpuesto;
	}

	public void setValorImpuesto(BigDecimal valorImpuesto) {
		this.valorImpuesto = valorImpuesto;
	}

	public List<Articulo> getArticulos() {
		return this.articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public Articulo addArticulo(Articulo articulo) {
		getArticulos().add(articulo);
		articulo.setImpuesto(this);

		return articulo;
	}

	public Articulo removeArticulo(Articulo articulo) {
		getArticulos().remove(articulo);
		articulo.setImpuesto(null);

		return articulo;
	}

}