package com.wayra.venta.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wayra.venta.model.Impuesto;
import com.wayra.venta.service.ImpuestoService;

@RestController
@RequestMapping("/api")
public class ImpuestoController {
	
	@Autowired
    private ImpuestoService impuestoService;
	
	// Get All Notes
	@GetMapping("/impuestos")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Impuesto> getAllImpuestos() {
		System.out.println("listando");
		System.out.println("listando33");
	    return impuestoService.findAll();
	}
	
	// Create a new Note
	@PostMapping("/impuestos")
	public Impuesto createImpuesto(@Valid @RequestBody Impuesto impuesto) {
	    return impuestoService.save(impuesto);
	}
	
	// Get a Single Note
	@GetMapping("/impuestos/{id}")
	public Impuesto getImpuestoById(@PathVariable(value = "id") int idImpuesto) {
	    return impuestoService.findById(idImpuesto);
	}
	
	// Update a Note
	@PutMapping("/impuestos/{id}")
	public Impuesto updateImpuesto(@PathVariable(value = "id") int idImpuesto, @Valid @RequestBody Impuesto impuestoDetails) {

		Impuesto impuesto = impuestoService.findById(idImpuesto);

		impuesto.setTipoImpuesto(impuestoDetails.getTipoImpuesto());
		impuesto.setValorImpuesto(impuestoDetails.getValorImpuesto());

	    Impuesto updatedImpuesto = impuestoService.save(impuesto);
	    return updatedImpuesto;
	}
	
	// Delete a Note
	@DeleteMapping("/impuestos/{id}")
	public ResponseEntity<?> deleteImpuesto(@PathVariable(value = "id") int idImpuesto) {
		Impuesto impuesto = impuestoService.findById(idImpuesto);

		impuestoService.delete(impuesto);

	    return ResponseEntity.ok().build();
	}
}
