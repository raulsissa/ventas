package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the perfil database table.
 * 
 */
@Entity
@NamedQuery(name="Perfil.findAll", query="SELECT p FROM Perfil p")
public class Perfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idPerfil;

	private String estado;

	private String nombre;

	//bi-directional many-to-many association to Rol
	@ManyToMany
	@JoinTable(
		name="perfil_rol"
		, joinColumns={
			@JoinColumn(name="idperfil_fk")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idrol_fk")
			}
		)
	private List<Rol> rols;

	//bi-directional many-to-many association to Usuario
	@ManyToMany(mappedBy="perfils")
	private List<Usuario> usuarios;

	public Perfil() {
	}

	public int getIdPerfil() {
		return this.idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Rol> getRols() {
		return this.rols;
	}

	public void setRols(List<Rol> rols) {
		this.rols = rols;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}