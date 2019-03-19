package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the grupo database table.
 * 
 */
@Entity
@NamedQuery(name="Grupo.findAll", query="SELECT g FROM Grupo g")
public class Grupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idGrupo;

	private String codGrupo;

	private String codTabla;

	private String descripcion;

	public Grupo() {
	}

	public int getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getCodGrupo() {
		return this.codGrupo;
	}

	public void setCodGrupo(String codGrupo) {
		this.codGrupo = codGrupo;
	}

	public String getCodTabla() {
		return this.codTabla;
	}

	public void setCodTabla(String codTabla) {
		this.codTabla = codTabla;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}