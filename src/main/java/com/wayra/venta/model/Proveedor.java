package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the proveedor database table.
 * 
 */
@Entity
@NamedQuery(name="Proveedor.findAll", query="SELECT p FROM Proveedor p")
public class Proveedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idProveedor;

	private String celular;

	private String codTabla;

	private String comentario;

	private String direccion;

	private String email;

	private byte estado;

	private String nombre;

	private String representante;

	private String telefono;

	//bi-directional many-to-one association to Compra
	@OneToMany(mappedBy="proveedor")
	private List<Compra> compras;

	//bi-directional many-to-one association to DevolucionProv
	@OneToMany(mappedBy="proveedor")
	private List<DevolucionProv> devolucionProvs;

	//bi-directional many-to-one association to Lote
	@OneToMany(mappedBy="proveedor")
	private List<Lote> lotes;

	//bi-directional many-to-one association to OrdenCompra
	@OneToMany(mappedBy="proveedor")
	private List<OrdenCompra> ordenCompras;

	public Proveedor() {
	}

	public int getIdProveedor() {
		return this.idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCodTabla() {
		return this.codTabla;
	}

	public void setCodTabla(String codTabla) {
		this.codTabla = codTabla;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRepresentante() {
		return this.representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Compra> getCompras() {
		return this.compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public Compra addCompra(Compra compra) {
		getCompras().add(compra);
		compra.setProveedor(this);

		return compra;
	}

	public Compra removeCompra(Compra compra) {
		getCompras().remove(compra);
		compra.setProveedor(null);

		return compra;
	}

	public List<DevolucionProv> getDevolucionProvs() {
		return this.devolucionProvs;
	}

	public void setDevolucionProvs(List<DevolucionProv> devolucionProvs) {
		this.devolucionProvs = devolucionProvs;
	}

	public DevolucionProv addDevolucionProv(DevolucionProv devolucionProv) {
		getDevolucionProvs().add(devolucionProv);
		devolucionProv.setProveedor(this);

		return devolucionProv;
	}

	public DevolucionProv removeDevolucionProv(DevolucionProv devolucionProv) {
		getDevolucionProvs().remove(devolucionProv);
		devolucionProv.setProveedor(null);

		return devolucionProv;
	}

	public List<Lote> getLotes() {
		return this.lotes;
	}

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}

	public Lote addLote(Lote lote) {
		getLotes().add(lote);
		lote.setProveedor(this);

		return lote;
	}

	public Lote removeLote(Lote lote) {
		getLotes().remove(lote);
		lote.setProveedor(null);

		return lote;
	}

	public List<OrdenCompra> getOrdenCompras() {
		return this.ordenCompras;
	}

	public void setOrdenCompras(List<OrdenCompra> ordenCompras) {
		this.ordenCompras = ordenCompras;
	}

	public OrdenCompra addOrdenCompra(OrdenCompra ordenCompra) {
		getOrdenCompras().add(ordenCompra);
		ordenCompra.setProveedor(this);

		return ordenCompra;
	}

	public OrdenCompra removeOrdenCompra(OrdenCompra ordenCompra) {
		getOrdenCompras().remove(ordenCompra);
		ordenCompra.setProveedor(null);

		return ordenCompra;
	}

}