package com.wayra.venta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wayra.venta.model.Impuesto;

@Repository
public interface ImpuestoRepository  extends JpaRepository<Impuesto, Integer> {

}
