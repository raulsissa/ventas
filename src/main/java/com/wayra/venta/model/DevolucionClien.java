package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the devolucion_clien database table.
 * 
 */
@Entity
@Table(name="devolucion_clien")
@NamedQuery(name="DevolucionClien.findAll", query="SELECT d FROM DevolucionClien d")
public class DevolucionClien implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idDevolucionClien;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	//bi-directional many-to-one association to ArticuloDevolucionClien
	@OneToMany(mappedBy="devolucionClien")
	private List<ArticuloDevolucionClien> articuloDevolucionCliens;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="idClienteFk")
	private Cliente cliente;

	//bi-directional many-to-one association to Personal
	@ManyToOne
	@JoinColumn(name="idPersonalFk")
	private Personal personal;

	public DevolucionClien() {
	}

	public int getIdDevolucionClien() {
		return this.idDevolucionClien;
	}

	public void setIdDevolucionClien(int idDevolucionClien) {
		this.idDevolucionClien = idDevolucionClien;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public List<ArticuloDevolucionClien> getArticuloDevolucionCliens() {
		return this.articuloDevolucionCliens;
	}

	public void setArticuloDevolucionCliens(List<ArticuloDevolucionClien> articuloDevolucionCliens) {
		this.articuloDevolucionCliens = articuloDevolucionCliens;
	}

	public ArticuloDevolucionClien addArticuloDevolucionClien(ArticuloDevolucionClien articuloDevolucionClien) {
		getArticuloDevolucionCliens().add(articuloDevolucionClien);
		articuloDevolucionClien.setDevolucionClien(this);

		return articuloDevolucionClien;
	}

	public ArticuloDevolucionClien removeArticuloDevolucionClien(ArticuloDevolucionClien articuloDevolucionClien) {
		getArticuloDevolucionCliens().remove(articuloDevolucionClien);
		articuloDevolucionClien.setDevolucionClien(null);

		return articuloDevolucionClien;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

}