package com.wayra.venta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.wayra.venta.model.Impuesto;
import com.wayra.venta.repository.ImpuestoRepository;

@Service
@Transactional
public class ImpuestoServiceImpl implements ImpuestoService {
	@Autowired
	private ImpuestoRepository impuestoRepository;

	@Override
	public Impuesto save(Impuesto entity) {
		return impuestoRepository.save(entity);
	}

	@Override
	public Impuesto findById(int id) {
		return impuestoRepository.getOne(id);
	}

	@Override
	public List<Impuesto> findAll() {
		return impuestoRepository.findAll();
	}

	@Override
	public void delete(Impuesto entity) {
		impuestoRepository.delete(entity);
	}

}
