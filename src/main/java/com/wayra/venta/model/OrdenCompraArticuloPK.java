package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the orden_compra_articulo database table.
 * 
 */
@Embeddable
public class OrdenCompraArticuloPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idOrdenCompraFk;

	@Column(insertable=false, updatable=false)
	private int idArticuloFk;

	public OrdenCompraArticuloPK() {
	}
	public int getIdOrdenCompraFk() {
		return this.idOrdenCompraFk;
	}
	public void setIdOrdenCompraFk(int idOrdenCompraFk) {
		this.idOrdenCompraFk = idOrdenCompraFk;
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
		if (!(other instanceof OrdenCompraArticuloPK)) {
			return false;
		}
		OrdenCompraArticuloPK castOther = (OrdenCompraArticuloPK)other;
		return 
			(this.idOrdenCompraFk == castOther.idOrdenCompraFk)
			&& (this.idArticuloFk == castOther.idArticuloFk);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idOrdenCompraFk;
		hash = hash * prime + this.idArticuloFk;
		
		return hash;
	}
}