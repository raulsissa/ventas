package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the compra database table.
 * 
 */
@Entity
@NamedQuery(name="Compra.findAll", query="SELECT c FROM Compra c")
public class Compra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idcompra;

	private BigDecimal dsctoMonto;

	private BigDecimal dsctoPciento;

	private byte estado;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String nroCompra;

	private BigDecimal subTotal;

	private BigDecimal total;

	//bi-directional many-to-one association to Proveedor
	@ManyToOne
	@JoinColumn(name="idProveedorFk")
	private Proveedor proveedor;

	//bi-directional many-to-one association to CompraArticulo
	@OneToMany(mappedBy="compra")
	private List<CompraArticulo> compraArticulos;

	public Compra() {
	}

	public int getIdcompra() {
		return this.idcompra;
	}

	public void setIdcompra(int idcompra) {
		this.idcompra = idcompra;
	}

	public BigDecimal getDsctoMonto() {
		return this.dsctoMonto;
	}

	public void setDsctoMonto(BigDecimal dsctoMonto) {
		this.dsctoMonto = dsctoMonto;
	}

	public BigDecimal getDsctoPciento() {
		return this.dsctoPciento;
	}

	public void setDsctoPciento(BigDecimal dsctoPciento) {
		this.dsctoPciento = dsctoPciento;
	}

	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNroCompra() {
		return this.nroCompra;
	}

	public void setNroCompra(String nroCompra) {
		this.nroCompra = nroCompra;
	}

	public BigDecimal getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public List<CompraArticulo> getCompraArticulos() {
		return this.compraArticulos;
	}

	public void setCompraArticulos(List<CompraArticulo> compraArticulos) {
		this.compraArticulos = compraArticulos;
	}

	public CompraArticulo addCompraArticulo(CompraArticulo compraArticulo) {
		getCompraArticulos().add(compraArticulo);
		compraArticulo.setCompra(this);

		return compraArticulo;
	}

	public CompraArticulo removeCompraArticulo(CompraArticulo compraArticulo) {
		getCompraArticulos().remove(compraArticulo);
		compraArticulo.setCompra(null);

		return compraArticulo;
	}

}