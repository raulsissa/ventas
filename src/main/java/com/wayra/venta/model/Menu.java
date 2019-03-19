package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the menu database table.
 * 
 */
@Entity
@NamedQuery(name="Menu.findAll", query="SELECT m FROM Menu m")
public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idmenu;

	private byte administrar;

	private byte carga;

	private byte descargar;

	private String descripcion;

	private byte eliminar;

	private byte exportar;

	private byte insertar;

	private byte modificar;

	private String nombre;

	private byte predeterminado;

	private byte visualizar;

	public Menu() {
	}

	public int getIdmenu() {
		return this.idmenu;
	}

	public void setIdmenu(int idmenu) {
		this.idmenu = idmenu;
	}

	public byte getAdministrar() {
		return this.administrar;
	}

	public void setAdministrar(byte administrar) {
		this.administrar = administrar;
	}

	public byte getCarga() {
		return this.carga;
	}

	public void setCarga(byte carga) {
		this.carga = carga;
	}

	public byte getDescargar() {
		return this.descargar;
	}

	public void setDescargar(byte descargar) {
		this.descargar = descargar;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public byte getEliminar() {
		return this.eliminar;
	}

	public void setEliminar(byte eliminar) {
		this.eliminar = eliminar;
	}

	public byte getExportar() {
		return this.exportar;
	}

	public void setExportar(byte exportar) {
		this.exportar = exportar;
	}

	public byte getInsertar() {
		return this.insertar;
	}

	public void setInsertar(byte insertar) {
		this.insertar = insertar;
	}

	public byte getModificar() {
		return this.modificar;
	}

	public void setModificar(byte modificar) {
		this.modificar = modificar;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getPredeterminado() {
		return this.predeterminado;
	}

	public void setPredeterminado(byte predeterminado) {
		this.predeterminado = predeterminado;
	}

	public byte getVisualizar() {
		return this.visualizar;
	}

	public void setVisualizar(byte visualizar) {
		this.visualizar = visualizar;
	}

}