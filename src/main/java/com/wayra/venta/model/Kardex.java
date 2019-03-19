package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the kardex database table.
 * 
 */
@Entity
@NamedQuery(name="Kardex.findAll", query="SELECT k FROM Kardex k")
public class Kardex implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idKardex;

	private int cantidad;

	private String comentario;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private Time hora;

	private int idLoteFk;

	private String idMov;

	private String tipo;

	//bi-directional many-to-one association to Articulo
	@ManyToOne
	@JoinColumn(name="idArticuloFk")
	private Articulo articulo;

	public Kardex() {
	}

	public int getIdKardex() {
		return this.idKardex;
	}

	public void setIdKardex(int idKardex) {
		this.idKardex = idKardex;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return this.hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public int getIdLoteFk() {
		return this.idLoteFk;
	}

	public void setIdLoteFk(int idLoteFk) {
		this.idLoteFk = idLoteFk;
	}

	public String getIdMov() {
		return this.idMov;
	}

	public void setIdMov(String idMov) {
		this.idMov = idMov;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Articulo getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

}