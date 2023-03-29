package com.ges.facture.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ges.facture.model.Facture;
import com.ges.facture.repository.FactureRepository;
import com.ges.facture.service.FactureService;

public class FactureServiceImpl implements FactureService{
	
	@Autowired
	private FactureRepository factureRepository;

	@Override
	public List<Facture> getAllFacture() {
		// TODO Auto-generated method stub
		return (List<Facture>) factureRepository.findAll();
	}

	@Override
	public Facture getFactureById(long id) {
		// TODO Auto-generated method stub
		return factureRepository.findById(id).get();
	}

	@Override
	public Facture addFacture(Facture facture) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Facture updateFacture(Facture facture) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFactureById(long id) {
		// TODO Auto-generated method stub
		
	}

}
