package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the compra_articulo database table.
 * 
 */
@Embeddable
public class CompraArticuloPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idCompraFk;

	@Column(insertable=false, updatable=false)
	private int idArticuloFk;

	public CompraArticuloPK() {
	}
	public int getIdCompraFk() {
		return this.idCompraFk;
	}
	public void setIdCompraFk(int idCompraFk) {
		this.idCompraFk = idCompraFk;
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
		if (!(other instanceof CompraArticuloPK)) {
			return false;
		}
		CompraArticuloPK castOther = (CompraArticuloPK)other;
		return 
			(this.idCompraFk == castOther.idCompraFk)
			&& (this.idArticuloFk == castOther.idArticuloFk);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idCompraFk;
		hash = hash * prime + this.idArticuloFk;
		
		return hash;
	}
}