package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the venta_articulo database table.
 * 
 */
@Embeddable
public class VentaArticuloPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idVentaFk;

	@Column(insertable=false, updatable=false)
	private int idArticuloFk;

	public VentaArticuloPK() {
	}
	public int getIdVentaFk() {
		return this.idVentaFk;
	}
	public void setIdVentaFk(int idVentaFk) {
		this.idVentaFk = idVentaFk;
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
		if (!(other instanceof VentaArticuloPK)) {
			return false;
		}
		VentaArticuloPK castOther = (VentaArticuloPK)other;
		return 
			(this.idVentaFk == castOther.idVentaFk)
			&& (this.idArticuloFk == castOther.idArticuloFk);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idVentaFk;
		hash = hash * prime + this.idArticuloFk;
		
		return hash;
	}
}