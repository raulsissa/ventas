package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ajuste_inventario database table.
 * 
 */
@Entity
@Table(name="ajuste_inventario")
@NamedQuery(name="AjusteInventario.findAll", query="SELECT a FROM AjusteInventario a")
public class AjusteInventario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idAjusteInventario;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String nroAjusteInv;

	private String tipo;

	private BigDecimal total;

	//bi-directional many-to-one association to AjusteArticulo
	@OneToMany(mappedBy="ajusteInventario")
	private List<AjusteArticulo> ajusteArticulos;

	public AjusteInventario() {
	}

	public int getIdAjusteInventario() {
		return this.idAjusteInventario;
	}

	public void setIdAjusteInventario(int idAjusteInventario) {
		this.idAjusteInventario = idAjusteInventario;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNroAjusteInv() {
		return this.nroAjusteInv;
	}

	public void setNroAjusteInv(String nroAjusteInv) {
		this.nroAjusteInv = nroAjusteInv;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public List<AjusteArticulo> getAjusteArticulos() {
		return this.ajusteArticulos;
	}

	public void setAjusteArticulos(List<AjusteArticulo> ajusteArticulos) {
		this.ajusteArticulos = ajusteArticulos;
	}

	public AjusteArticulo addAjusteArticulo(AjusteArticulo ajusteArticulo) {
		getAjusteArticulos().add(ajusteArticulo);
		ajusteArticulo.setAjusteInventario(this);

		return ajusteArticulo;
	}

	public AjusteArticulo removeAjusteArticulo(AjusteArticulo ajusteArticulo) {
		getAjusteArticulos().remove(ajusteArticulo);
		ajusteArticulo.setAjusteInventario(null);

		return ajusteArticulo;
	}

}