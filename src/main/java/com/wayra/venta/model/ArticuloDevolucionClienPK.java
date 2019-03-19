package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the articulo_devolucion_clien database table.
 * 
 */
@Embeddable
public class ArticuloDevolucionClienPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idArticuloFk;

	@Column(insertable=false, updatable=false)
	private int idDevolucionClienFk;

	public ArticuloDevolucionClienPK() {
	}
	public int getIdArticuloFk() {
		return this.idArticuloFk;
	}
	public void setIdArticuloFk(int idArticuloFk) {
		this.idArticuloFk = idArticuloFk;
	}
	public int getIdDevolucionClienFk() {
		return this.idDevolucionClienFk;
	}
	public void setIdDevolucionClienFk(int idDevolucionClienFk) {
		this.idDevolucionClienFk = idDevolucionClienFk;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ArticuloDevolucionClienPK)) {
			return false;
		}
		ArticuloDevolucionClienPK castOther = (ArticuloDevolucionClienPK)other;
		return 
			(this.idArticuloFk == castOther.idArticuloFk)
			&& (this.idDevolucionClienFk == castOther.idDevolucionClienFk);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idArticuloFk;
		hash = hash * prime + this.idDevolucionClienFk;
		
		return hash;
	}
}