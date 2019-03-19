package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_documento database table.
 * 
 */
@Entity
@Table(name="tipo_documento")
@NamedQuery(name="TipoDocumento.findAll", query="SELECT t FROM TipoDocumento t")
public class TipoDocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idNumeroDocumento;

	private String abreviatura;

	private String contadorDia;

	private String contadorInicio;

	private String correlativo;

	private String nombre;

	//bi-directional many-to-one association to Venta
	@OneToMany(mappedBy="tipoDocumento")
	private List<Venta> ventas;

	public TipoDocumento() {
	}

	public int getIdNumeroDocumento() {
		return this.idNumeroDocumento;
	}

	public void setIdNumeroDocumento(int idNumeroDocumento) {
		this.idNumeroDocumento = idNumeroDocumento;
	}

	public String getAbreviatura() {
		return this.abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getContadorDia() {
		return this.contadorDia;
	}

	public void setContadorDia(String contadorDia) {
		this.contadorDia = contadorDia;
	}

	public String getContadorInicio() {
		return this.contadorInicio;
	}

	public void setContadorInicio(String contadorInicio) {
		this.contadorInicio = contadorInicio;
	}

	public String getCorrelativo() {
		return this.correlativo;
	}

	public void setCorrelativo(String correlativo) {
		this.correlativo = correlativo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Venta> getVentas() {
		return this.ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public Venta addVenta(Venta venta) {
		getVentas().add(venta);
		venta.setTipoDocumento(this);

		return venta;
	}

	public Venta removeVenta(Venta venta) {
		getVentas().remove(venta);
		venta.setTipoDocumento(null);

		return venta;
	}

}