package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the personal database table.
 * 
 */
@Entity
@NamedQuery(name="Personal.findAll", query="SELECT p FROM Personal p")
public class Personal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPersonal;

	private String apellidoMaterno;

	private String apellidoPaterno;

	private int celular;

	private String codTabla;

	private String direccion;

	private String email;

	private byte estado;

	private String nombre;

	private int telefono;

	//bi-directional many-to-one association to DevolucionClien
	@OneToMany(mappedBy="personal")
	private List<DevolucionClien> devolucionCliens;

	//bi-directional many-to-one association to Venta
	@OneToMany(mappedBy="personal")
	private List<Venta> ventas;

	public Personal() {
	}

	public int getIdPersonal() {
		return this.idPersonal;
	}

	public void setIdPersonal(int idPersonal) {
		this.idPersonal = idPersonal;
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
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
		devolucionClien.setPersonal(this);

		return devolucionClien;
	}

	public DevolucionClien removeDevolucionClien(DevolucionClien devolucionClien) {
		getDevolucionCliens().remove(devolucionClien);
		devolucionClien.setPersonal(null);

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
		venta.setPersonal(this);

		return venta;
	}

	public Venta removeVenta(Venta venta) {
		getVentas().remove(venta);
		venta.setPersonal(null);

		return venta;
	}

}