package com.wayra.venta.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Size;


/**
 * The persistent class for the impuesto database table.
 * 
 */

@Entity // name = "impuesto"
@Table(name = "impuesto", schema = "ventasdb")
@NamedQuery(name="Impuesto.findAll", query="SELECT i FROM Impuesto i")
public class Impuesto implements Serializable {
	private static final long serialVersionUID = 1L;

	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="idimpuesto")
	private int idImpuesto;
	
	 @Size(min = 1, max = 45)
	@Column(name="tipoimpuesto")
	private String tipoImpuesto;
	
	
	@Column(name="valorimpuesto")
	 @DecimalMax("30.00")
	private BigDecimal valorImpuesto;

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

}