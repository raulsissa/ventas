package com.wayra.venta.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the articulo database table.
 * 
 */
@Entity
@NamedQuery(name="Articulo.findAll", query="SELECT a FROM Articulo a")
public class Articulo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idarticulo;

	private String aceptaLote;

	private String codGrupo;

	private String codigoArticulo;

	private String codTabla;

	private String comentario;

	private String condicionPrescripcion;

	private String descripcionArticulo;

	private byte estado;

	private int incremento;

	private int precioCompra;

	private int precioSugerido;

	private int precioVenta;

	private int stockMax;

	private int stockMin;

	private int stockTeorico;

	private String ubicacion;

	//bi-directional many-to-one association to AjusteArticulo
	@OneToMany(mappedBy="articulo")
	private List<AjusteArticulo> ajusteArticulos;

	//bi-directional many-to-one association to Impuesto
	@ManyToOne
	@JoinColumn(name="idImpuestoFk")
	private Impuesto impuesto;

	//bi-directional many-to-one association to UnidadMedida
	@ManyToOne
	@JoinColumn(name="idUnidadMedidaFk")
	private UnidadMedida unidadMedida;

	//bi-directional many-to-one association to ArticuloDevolucionClien
	@OneToMany(mappedBy="articulo")
	private List<ArticuloDevolucionClien> articuloDevolucionCliens;

	//bi-directional many-to-one association to ArticuloDevolucionProv
	@OneToMany(mappedBy="articulo")
	private List<ArticuloDevolucionProv> articuloDevolucionProvs;

	//bi-directional many-to-one association to CompraArticulo
	@OneToMany(mappedBy="articulo")
	private List<CompraArticulo> compraArticulos;

	//bi-directional many-to-one association to Kardex
	@OneToMany(mappedBy="articulo")
	private List<Kardex> kardexs;

	//bi-directional many-to-one association to Lote
	@OneToMany(mappedBy="articulo")
	private List<Lote> lotes;

	//bi-directional many-to-one association to OrdenCompraArticulo
	@OneToMany(mappedBy="articulo")
	private List<OrdenCompraArticulo> ordenCompraArticulos;

	//bi-directional many-to-one association to SedeArticulo
	@OneToMany(mappedBy="articulo")
	private List<SedeArticulo> sedeArticulos;

	//bi-directional many-to-one association to VentaArticulo
	@OneToMany(mappedBy="articulo")
	private List<VentaArticulo> ventaArticulos;

	public Articulo() {
	}

	public int getIdarticulo() {
		return this.idarticulo;
	}

	public void setIdarticulo(int idarticulo) {
		this.idarticulo = idarticulo;
	}

	public String getAceptaLote() {
		return this.aceptaLote;
	}

	public void setAceptaLote(String aceptaLote) {
		this.aceptaLote = aceptaLote;
	}

	public String getCodGrupo() {
		return this.codGrupo;
	}

	public void setCodGrupo(String codGrupo) {
		this.codGrupo = codGrupo;
	}

	public String getCodigoArticulo() {
		return this.codigoArticulo;
	}

	public void setCodigoArticulo(String codigoArticulo) {
		this.codigoArticulo = codigoArticulo;
	}

	public String getCodTabla() {
		return this.codTabla;
	}

	public void setCodTabla(String codTabla) {
		this.codTabla = codTabla;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getCondicionPrescripcion() {
		return this.condicionPrescripcion;
	}

	public void setCondicionPrescripcion(String condicionPrescripcion) {
		this.condicionPrescripcion = condicionPrescripcion;
	}

	public String getDescripcionArticulo() {
		return this.descripcionArticulo;
	}

	public void setDescripcionArticulo(String descripcionArticulo) {
		this.descripcionArticulo = descripcionArticulo;
	}

	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	public int getIncremento() {
		return this.incremento;
	}

	public void setIncremento(int incremento) {
		this.incremento = incremento;
	}

	public int getPrecioCompra() {
		return this.precioCompra;
	}

	public void setPrecioCompra(int precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getPrecioSugerido() {
		return this.precioSugerido;
	}

	public void setPrecioSugerido(int precioSugerido) {
		this.precioSugerido = precioSugerido;
	}

	public int getPrecioVenta() {
		return this.precioVenta;
	}

	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStockMax() {
		return this.stockMax;
	}

	public void setStockMax(int stockMax) {
		this.stockMax = stockMax;
	}

	public int getStockMin() {
		return this.stockMin;
	}

	public void setStockMin(int stockMin) {
		this.stockMin = stockMin;
	}

	public int getStockTeorico() {
		return this.stockTeorico;
	}

	public void setStockTeorico(int stockTeorico) {
		this.stockTeorico = stockTeorico;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<AjusteArticulo> getAjusteArticulos() {
		return this.ajusteArticulos;
	}

	public void setAjusteArticulos(List<AjusteArticulo> ajusteArticulos) {
		this.ajusteArticulos = ajusteArticulos;
	}

	public AjusteArticulo addAjusteArticulo(AjusteArticulo ajusteArticulo) {
		getAjusteArticulos().add(ajusteArticulo);
		ajusteArticulo.setArticulo(this);

		return ajusteArticulo;
	}

	public AjusteArticulo removeAjusteArticulo(AjusteArticulo ajusteArticulo) {
		getAjusteArticulos().remove(ajusteArticulo);
		ajusteArticulo.setArticulo(null);

		return ajusteArticulo;
	}

	public Impuesto getImpuesto() {
		return this.impuesto;
	}

	public void setImpuesto(Impuesto impuesto) {
		this.impuesto = impuesto;
	}

	public UnidadMedida getUnidadMedida() {
		return this.unidadMedida;
	}

	public void setUnidadMedida(UnidadMedida unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public List<ArticuloDevolucionClien> getArticuloDevolucionCliens() {
		return this.articuloDevolucionCliens;
	}

	public void setArticuloDevolucionCliens(List<ArticuloDevolucionClien> articuloDevolucionCliens) {
		this.articuloDevolucionCliens = articuloDevolucionCliens;
	}

	public ArticuloDevolucionClien addArticuloDevolucionClien(ArticuloDevolucionClien articuloDevolucionClien) {
		getArticuloDevolucionCliens().add(articuloDevolucionClien);
		articuloDevolucionClien.setArticulo(this);

		return articuloDevolucionClien;
	}

	public ArticuloDevolucionClien removeArticuloDevolucionClien(ArticuloDevolucionClien articuloDevolucionClien) {
		getArticuloDevolucionCliens().remove(articuloDevolucionClien);
		articuloDevolucionClien.setArticulo(null);

		return articuloDevolucionClien;
	}

	public List<ArticuloDevolucionProv> getArticuloDevolucionProvs() {
		return this.articuloDevolucionProvs;
	}

	public void setArticuloDevolucionProvs(List<ArticuloDevolucionProv> articuloDevolucionProvs) {
		this.articuloDevolucionProvs = articuloDevolucionProvs;
	}

	public ArticuloDevolucionProv addArticuloDevolucionProv(ArticuloDevolucionProv articuloDevolucionProv) {
		getArticuloDevolucionProvs().add(articuloDevolucionProv);
		articuloDevolucionProv.setArticulo(this);

		return articuloDevolucionProv;
	}

	public ArticuloDevolucionProv removeArticuloDevolucionProv(ArticuloDevolucionProv articuloDevolucionProv) {
		getArticuloDevolucionProvs().remove(articuloDevolucionProv);
		articuloDevolucionProv.setArticulo(null);

		return articuloDevolucionProv;
	}

	public List<CompraArticulo> getCompraArticulos() {
		return this.compraArticulos;
	}

	public void setCompraArticulos(List<CompraArticulo> compraArticulos) {
		this.compraArticulos = compraArticulos;
	}

	public CompraArticulo addCompraArticulo(CompraArticulo compraArticulo) {
		getCompraArticulos().add(compraArticulo);
		compraArticulo.setArticulo(this);

		return compraArticulo;
	}

	public CompraArticulo removeCompraArticulo(CompraArticulo compraArticulo) {
		getCompraArticulos().remove(compraArticulo);
		compraArticulo.setArticulo(null);

		return compraArticulo;
	}

	public List<Kardex> getKardexs() {
		return this.kardexs;
	}

	public void setKardexs(List<Kardex> kardexs) {
		this.kardexs = kardexs;
	}

	public Kardex addKardex(Kardex kardex) {
		getKardexs().add(kardex);
		kardex.setArticulo(this);

		return kardex;
	}

	public Kardex removeKardex(Kardex kardex) {
		getKardexs().remove(kardex);
		kardex.setArticulo(null);

		return kardex;
	}

	public List<Lote> getLotes() {
		return this.lotes;
	}

	public void setLotes(List<Lote> lotes) {
		this.lotes = lotes;
	}

	public Lote addLote(Lote lote) {
		getLotes().add(lote);
		lote.setArticulo(this);

		return lote;
	}

	public Lote removeLote(Lote lote) {
		getLotes().remove(lote);
		lote.setArticulo(null);

		return lote;
	}

	public List<OrdenCompraArticulo> getOrdenCompraArticulos() {
		return this.ordenCompraArticulos;
	}

	public void setOrdenCompraArticulos(List<OrdenCompraArticulo> ordenCompraArticulos) {
		this.ordenCompraArticulos = ordenCompraArticulos;
	}

	public OrdenCompraArticulo addOrdenCompraArticulo(OrdenCompraArticulo ordenCompraArticulo) {
		getOrdenCompraArticulos().add(ordenCompraArticulo);
		ordenCompraArticulo.setArticulo(this);

		return ordenCompraArticulo;
	}

	public OrdenCompraArticulo removeOrdenCompraArticulo(OrdenCompraArticulo ordenCompraArticulo) {
		getOrdenCompraArticulos().remove(ordenCompraArticulo);
		ordenCompraArticulo.setArticulo(null);

		return ordenCompraArticulo;
	}

	public List<SedeArticulo> getSedeArticulos() {
		return this.sedeArticulos;
	}

	public void setSedeArticulos(List<SedeArticulo> sedeArticulos) {
		this.sedeArticulos = sedeArticulos;
	}

	public SedeArticulo addSedeArticulo(SedeArticulo sedeArticulo) {
		getSedeArticulos().add(sedeArticulo);
		sedeArticulo.setArticulo(this);

		return sedeArticulo;
	}

	public SedeArticulo removeSedeArticulo(SedeArticulo sedeArticulo) {
		getSedeArticulos().remove(sedeArticulo);
		sedeArticulo.setArticulo(null);

		return sedeArticulo;
	}

	public List<VentaArticulo> getVentaArticulos() {
		return this.ventaArticulos;
	}

	public void setVentaArticulos(List<VentaArticulo> ventaArticulos) {
		this.ventaArticulos = ventaArticulos;
	}

	public VentaArticulo addVentaArticulo(VentaArticulo ventaArticulo) {
		getVentaArticulos().add(ventaArticulo);
		ventaArticulo.setArticulo(this);

		return ventaArticulo;
	}

	public VentaArticulo removeVentaArticulo(VentaArticulo ventaArticulo) {
		getVentaArticulos().remove(ventaArticulo);
		ventaArticulo.setArticulo(null);

		return ventaArticulo;
	}

}