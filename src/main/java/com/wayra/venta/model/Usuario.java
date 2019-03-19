package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idUsuario;

	private byte cambioPassword;

	@Temporal(TemporalType.TIMESTAMP)
	private Date cambioPasswordFecha;

	private byte credencialNoExpirado;

	private byte cuentaNoBloqueado;

	private byte cuentaNoExpirado;

	private String email;

	private byte estado;

	@Temporal(TemporalType.TIMESTAMP)
	private Date insercionFecha;

	private String nombre;

	private byte notificacionLogin;

	private byte notificacionMensage;

	private String password;

	//bi-directional many-to-many association to Perfil
	@ManyToMany
	@JoinTable(
		name="usuario_perfil"
		, joinColumns={
			@JoinColumn(name="idUsuarioFk")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idPerfilFk")
			}
		)
	private List<Perfil> perfils;

	//bi-directional many-to-many association to Rol
	@ManyToMany
	@JoinTable(
		name="usuario_rol"
		, joinColumns={
			@JoinColumn(name="idusuario_fk")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idrol_fk")
			}
		)
	private List<Rol> rols;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public byte getCambioPassword() {
		return this.cambioPassword;
	}

	public void setCambioPassword(byte cambioPassword) {
		this.cambioPassword = cambioPassword;
	}

	public Date getCambioPasswordFecha() {
		return this.cambioPasswordFecha;
	}

	public void setCambioPasswordFecha(Date cambioPasswordFecha) {
		this.cambioPasswordFecha = cambioPasswordFecha;
	}

	public byte getCredencialNoExpirado() {
		return this.credencialNoExpirado;
	}

	public void setCredencialNoExpirado(byte credencialNoExpirado) {
		this.credencialNoExpirado = credencialNoExpirado;
	}

	public byte getCuentaNoBloqueado() {
		return this.cuentaNoBloqueado;
	}

	public void setCuentaNoBloqueado(byte cuentaNoBloqueado) {
		this.cuentaNoBloqueado = cuentaNoBloqueado;
	}

	public byte getCuentaNoExpirado() {
		return this.cuentaNoExpirado;
	}

	public void setCuentaNoExpirado(byte cuentaNoExpirado) {
		this.cuentaNoExpirado = cuentaNoExpirado;
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

	public Date getInsercionFecha() {
		return this.insercionFecha;
	}

	public void setInsercionFecha(Date insercionFecha) {
		this.insercionFecha = insercionFecha;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getNotificacionLogin() {
		return this.notificacionLogin;
	}

	public void setNotificacionLogin(byte notificacionLogin) {
		this.notificacionLogin = notificacionLogin;
	}

	public byte getNotificacionMensage() {
		return this.notificacionMensage;
	}

	public void setNotificacionMensage(byte notificacionMensage) {
		this.notificacionMensage = notificacionMensage;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Perfil> getPerfils() {
		return this.perfils;
	}

	public void setPerfils(List<Perfil> perfils) {
		this.perfils = perfils;
	}

	public List<Rol> getRols() {
		return this.rols;
	}

	public void setRols(List<Rol> rols) {
		this.rols = rols;
	}

}