package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the orden_compra database table.
 * 
 */
@Entity
@Table(name="orden_compra")
@NamedQuery(name="OrdenCompra.findAll", query="SELECT o FROM OrdenCompra o")
public class OrdenCompra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idOrdenCompra;

	private String estado;

	private String fecha;

	private String total;

	//bi-directional many-to-one association to Proveedor
	@ManyToOne
	@JoinColumn(name="idProveedorFk")
	private Proveedor proveedor;

	//bi-directional many-to-one association to OrdenCompraArticulo
	@OneToMany(mappedBy="ordenCompra")
	private List<OrdenCompraArticulo> ordenCompraArticulos;

	public OrdenCompra() {
	}

	public int getIdOrdenCompra() {
		return this.idOrdenCompra;
	}

	public void setIdOrdenCompra(int idOrdenCompra) {
		this.idOrdenCompra = idOrdenCompra;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public List<OrdenCompraArticulo> getOrdenCompraArticulos() {
		return this.ordenCompraArticulos;
	}

	public void setOrdenCompraArticulos(List<OrdenCompraArticulo> ordenCompraArticulos) {
		this.ordenCompraArticulos = ordenCompraArticulos;
	}

	public OrdenCompraArticulo addOrdenCompraArticulo(OrdenCompraArticulo ordenCompraArticulo) {
		getOrdenCompraArticulos().add(ordenCompraArticulo);
		ordenCompraArticulo.setOrdenCompra(this);

		return ordenCompraArticulo;
	}

	public OrdenCompraArticulo removeOrdenCompraArticulo(OrdenCompraArticulo ordenCompraArticulo) {
		getOrdenCompraArticulos().remove(ordenCompraArticulo);
		ordenCompraArticulo.setOrdenCompra(null);

		return ordenCompraArticulo;
	}

}