package com.wayra.venta.service;

import java.util.List;

import com.wayra.venta.model.Impuesto;

public interface ImpuestoService {
	public Impuesto save(Impuesto entity); 
	public Impuesto findById(int id); 
	public List<Impuesto> findAll(); 
	public void delete(Impuesto entity);
}
