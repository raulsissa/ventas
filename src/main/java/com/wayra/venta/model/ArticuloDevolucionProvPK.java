package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the articulo_devolucion_prov database table.
 * 
 */
@Embeddable
public class ArticuloDevolucionProvPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idArticuloFk;

	@Column(insertable=false, updatable=false)
	private int idDevolucionProvFk;

	public ArticuloDevolucionProvPK() {
	}
	public int getIdArticuloFk() {
		return this.idArticuloFk;
	}
	public void setIdArticuloFk(int idArticuloFk) {
		this.idArticuloFk = idArticuloFk;
	}
	public int getIdDevolucionProvFk() {
		return this.idDevolucionProvFk;
	}
	public void setIdDevolucionProvFk(int idDevolucionProvFk) {
		this.idDevolucionProvFk = idDevolucionProvFk;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ArticuloDevolucionProvPK)) {
			return false;
		}
		ArticuloDevolucionProvPK castOther = (ArticuloDevolucionProvPK)other;
		return 
			(this.idArticuloFk == castOther.idArticuloFk)
			&& (this.idDevolucionProvFk == castOther.idDevolucionProvFk);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idArticuloFk;
		hash = hash * prime + this.idDevolucionProvFk;
		
		return hash;
	}
}