package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the devolucion_prov database table.
 * 
 */
@Entity
@Table(name="devolucion_prov")
@NamedQuery(name="DevolucionProv.findAll", query="SELECT d FROM DevolucionProv d")
public class DevolucionProv implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idDevolucionProv;

	private String comentario;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to ArticuloDevolucionProv
	@OneToMany(mappedBy="devolucionProv")
	private List<ArticuloDevolucionProv> articuloDevolucionProvs;

	//bi-directional many-to-one association to Proveedor
	@ManyToOne
	@JoinColumn(name="idProveedorFk")
	private Proveedor proveedor;

	public DevolucionProv() {
	}

	public int getIdDevolucionProv() {
		return this.idDevolucionProv;
	}

	public void setIdDevolucionProv(int idDevolucionProv) {
		this.idDevolucionProv = idDevolucionProv;
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

	public List<ArticuloDevolucionProv> getArticuloDevolucionProvs() {
		return this.articuloDevolucionProvs;
	}

	public void setArticuloDevolucionProvs(List<ArticuloDevolucionProv> articuloDevolucionProvs) {
		this.articuloDevolucionProvs = articuloDevolucionProvs;
	}

	public ArticuloDevolucionProv addArticuloDevolucionProv(ArticuloDevolucionProv articuloDevolucionProv) {
		getArticuloDevolucionProvs().add(articuloDevolucionProv);
		articuloDevolucionProv.setDevolucionProv(this);

		return articuloDevolucionProv;
	}

	public ArticuloDevolucionProv removeArticuloDevolucionProv(ArticuloDevolucionProv articuloDevolucionProv) {
		getArticuloDevolucionProvs().remove(articuloDevolucionProv);
		articuloDevolucionProv.setDevolucionProv(null);

		return articuloDevolucionProv;
	}

	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

}