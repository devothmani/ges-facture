package com.ges.facture.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ges.facture.model.Facture;
import com.ges.facture.service.FactureService;

@RestController
@RequestMapping("/factures")
public class FactureController {
	
	@Autowired
	private FactureService factureService;
	
	@GetMapping("/")
	public List<Facture> getAllFacture(){
		return factureService.getAllFacture();
	}
	
	@GetMapping("/{id}")
	public Facture getFactureById(@PathVariable long id){
		return factureService.getFactureById(id);
	}

}
