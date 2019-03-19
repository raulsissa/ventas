package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sede_articulo database table.
 * 
 */
@Embeddable
public class SedeArticuloPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idSedeFk;

	@Column(insertable=false, updatable=false)
	private int idArticuloFk;

	public SedeArticuloPK() {
	}
	public int getIdSedeFk() {
		return this.idSedeFk;
	}
	public void setIdSedeFk(int idSedeFk) {
		this.idSedeFk = idSedeFk;
	}
	public int getIdArticuloFk() {
		return this.idArticuloFk;
	}
	public void setIdArticuloFk(int idArticuloFk) {
		this.idArticuloFk = idArticuloFk;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SedeArticuloPK)) {
			return false;
		}
		SedeArticuloPK castOther = (SedeArticuloPK)other;
		return 
			(this.idSedeFk == castOther.idSedeFk)
			&& (this.idArticuloFk == castOther.idArticuloFk);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idSedeFk;
		hash = hash * prime + this.idArticuloFk;
		
		return hash;
	}
}