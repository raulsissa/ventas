package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ajuste_articulo database table.
 * 
 */
@Embeddable
public class AjusteArticuloPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idAjusteInevFk;

	@Column(insertable=false, updatable=false)
	private int idArticuloFk;

	public AjusteArticuloPK() {
	}
	public int getIdAjusteInevFk() {
		return this.idAjusteInevFk;
	}
	public void setIdAjusteInevFk(int idAjusteInevFk) {
		this.idAjusteInevFk = idAjusteInevFk;
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
		if (!(other instanceof AjusteArticuloPK)) {
			return false;
		}
		AjusteArticuloPK castOther = (AjusteArticuloPK)other;
		return 
			(this.idAjusteInevFk == castOther.idAjusteInevFk)
			&& (this.idArticuloFk == castOther.idArticuloFk);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idAjusteInevFk;
		hash = hash * prime + this.idArticuloFk;
		
		return hash;
	}
}