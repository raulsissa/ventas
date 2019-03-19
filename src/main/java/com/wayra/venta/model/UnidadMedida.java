package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the unidad_medida database table.
 * 
 */
@Entity
@Table(name="unidad_medida")
@NamedQuery(name="UnidadMedida.findAll", query="SELECT u FROM UnidadMedida u")
public class UnidadMedida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUnidadMedida;

	private String abreviatura;

	private String descripcionUnidad;

	private int nroArticulos;

	//bi-directional many-to-one association to Articulo
	@OneToMany(mappedBy="unidadMedida")
	private List<Articulo> articulos;

	public UnidadMedida() {
	}

	public int getIdUnidadMedida() {
		return this.idUnidadMedida;
	}

	public void setIdUnidadMedida(int idUnidadMedida) {
		this.idUnidadMedida = idUnidadMedida;
	}

	public String getAbreviatura() {
		return this.abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getDescripcionUnidad() {
		return this.descripcionUnidad;
	}

	public void setDescripcionUnidad(String descripcionUnidad) {
		this.descripcionUnidad = descripcionUnidad;
	}

	public int getNroArticulos() {
		return this.nroArticulos;
	}

	public void setNroArticulos(int nroArticulos) {
		this.nroArticulos = nroArticulos;
	}

	public List<Articulo> getArticulos() {
		return this.articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public Articulo addArticulo(Articulo articulo) {
		getArticulos().add(articulo);
		articulo.setUnidadMedida(this);

		return articulo;
	}

	public Articulo removeArticulo(Articulo articulo) {
		getArticulos().remove(articulo);
		articulo.setUnidadMedida(null);

		return articulo;
	}

}