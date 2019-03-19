package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sede database table.
 * 
 */
@Entity
@NamedQuery(name="Sede.findAll", query="SELECT s FROM Sede s")
public class Sede implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idSede;

	private String codigo;

	private String direccion;

	private byte estado;

	private String nombre;

	private int telefono;

	//bi-directional many-to-one association to SedeArticulo
	@OneToMany(mappedBy="sede")
	private List<SedeArticulo> sedeArticulos;

	public Sede() {
	}

	public int getIdSede() {
		return this.idSede;
	}

	public void setIdSede(int idSede) {
		this.idSede = idSede;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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

	public List<SedeArticulo> getSedeArticulos() {
		return this.sedeArticulos;
	}

	public void setSedeArticulos(List<SedeArticulo> sedeArticulos) {
		this.sedeArticulos = sedeArticulos;
	}

	public SedeArticulo addSedeArticulo(SedeArticulo sedeArticulo) {
		getSedeArticulos().add(sedeArticulo);
		sedeArticulo.setSede(this);

		return sedeArticulo;
	}

	public SedeArticulo removeSedeArticulo(SedeArticulo sedeArticulo) {
		getSedeArticulos().remove(sedeArticulo);
		sedeArticulo.setSede(null);

		return sedeArticulo;
	}

}