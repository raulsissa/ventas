package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the venta database table.
 * 
 */
@Entity
@NamedQuery(name="Venta.findAll", query="SELECT v FROM Venta v")
public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idVenta;

	private byte anulado;

	private String causaAnulacion;

	private String comentario;

	private BigDecimal dsctoMonto;

	private BigDecimal dsctoPciento;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private Time hora;

	private String nroVenta;

	private String recetaReferencia;

	private BigDecimal subTotal;

	private BigDecimal total;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="idClienteFk")
	private Cliente cliente;

	//bi-directional many-to-one association to Personal
	@ManyToOne
	@JoinColumn(name="idPersonalFk")
	private Personal personal;

	//bi-directional many-to-one association to TipoDocumento
	@ManyToOne
	@JoinColumn(name="idTipoDocumentoFk")
	private TipoDocumento tipoDocumento;

	//bi-directional many-to-one association to VentaArticulo
	@OneToMany(mappedBy="venta")
	private List<VentaArticulo> ventaArticulos;

	public Venta() {
	}

	public int getIdVenta() {
		return this.idVenta;
	}

	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	public byte getAnulado() {
		return this.anulado;
	}

	public void setAnulado(byte anulado) {
		this.anulado = anulado;
	}

	public String getCausaAnulacion() {
		return this.causaAnulacion;
	}

	public void setCausaAnulacion(String causaAnulacion) {
		this.causaAnulacion = causaAnulacion;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public BigDecimal getDsctoMonto() {
		return this.dsctoMonto;
	}

	public void setDsctoMonto(BigDecimal dsctoMonto) {
		this.dsctoMonto = dsctoMonto;
	}

	public BigDecimal getDsctoPciento() {
		return this.dsctoPciento;
	}

	public void setDsctoPciento(BigDecimal dsctoPciento) {
		this.dsctoPciento = dsctoPciento;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return this.hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public String getNroVenta() {
		return this.nroVenta;
	}

	public void setNroVenta(String nroVenta) {
		this.nroVenta = nroVenta;
	}

	public String getRecetaReferencia() {
		return this.recetaReferencia;
	}

	public void setRecetaReferencia(String recetaReferencia) {
		this.recetaReferencia = recetaReferencia;
	}

	public BigDecimal getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public BigDecimal getTotal() {
		return this.total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	public TipoDocumento getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public List<VentaArticulo> getVentaArticulos() {
		return this.ventaArticulos;
	}

	public void setVentaArticulos(List<VentaArticulo> ventaArticulos) {
		this.ventaArticulos = ventaArticulos;
	}

	public VentaArticulo addVentaArticulo(VentaArticulo ventaArticulo) {
		getVentaArticulos().add(ventaArticulo);
		ventaArticulo.setVenta(this);

		return ventaArticulo;
	}

	public VentaArticulo removeVentaArticulo(VentaArticulo ventaArticulo) {
		getVentaArticulos().remove(ventaArticulo);
		ventaArticulo.setVenta(null);

		return ventaArticulo;
	}

}