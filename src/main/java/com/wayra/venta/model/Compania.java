package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the compania database table.
 * 
 */
@Entity
@NamedQuery(name="Compania.findAll", query="SELECT c FROM Compania c")
public class Compania implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCompania;

	private byte nombreComercial;

	private byte razonSocial;

	private String ruc;

	public Compania() {
	}

	public int getIdCompania() {
		return this.idCompania;
	}

	public void setIdCompania(int idCompania) {
		this.idCompania = idCompania;
	}

	public byte getNombreComercial() {
		return this.nombreComercial;
	}

	public void setNombreComercial(byte nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public byte getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(byte razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getRuc() {
		return this.ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

}