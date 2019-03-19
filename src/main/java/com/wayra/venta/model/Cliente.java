package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idCliente;

	private int celular;

	private String codTabla;

	private String direccion;

	private String email;

	private byte estado;

	private String nombre;

	private String representante;

	private int telefono;

	//bi-directional many-to-one association to DevolucionClien
	@OneToMany(mappedBy="cliente")
	private List<DevolucionClien> devolucionCliens;

	//bi-directional many-to-one association to Venta
	@OneToMany(mappedBy="cliente")
	private List<Venta> ventas;

	public Cliente() {
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getCelular() {
		return this.celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getCodTabla() {
		return this.codTabla;
	}

	public void setCodTabla(String codTabla) {
		this.codTabla = codTabla;
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

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public List<DevolucionClien> getDevolucionCliens() {
		return this.devolucionCliens;
	}

	public void setDevolucionCliens(List<DevolucionClien> devolucionCliens) {
		this.devolucionCliens = devolucionCliens;
	}

	public DevolucionClien addDevolucionClien(DevolucionClien devolucionClien) {
		getDevolucionCliens().add(devolucionClien);
		devolucionClien.setCliente(this);

		return devolucionClien;
	}

	public DevolucionClien removeDevolucionClien(DevolucionClien devolucionClien) {
		getDevolucionCliens().remove(devolucionClien);
		devolucionClien.setCliente(null);

		return devolucionClien;
	}

	public List<Venta> getVentas() {
		return this.ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public Venta addVenta(Venta venta) {
		getVentas().add(venta);
		venta.setCliente(this);

		return venta;
	}

	public Venta removeVenta(Venta venta) {
		getVentas().remove(venta);
		venta.setCliente(null);

		return venta;
	}

}