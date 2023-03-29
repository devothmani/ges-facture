package com.ges.facture.service;

import java.util.List;

import com.ges.facture.model.Facture;

public interface FactureService {
	
	List<Facture> getAllFacture();
	Facture getFactureById(long id);
	Facture addFacture(Facture facture);
	Facture updateFacture(Facture facture);
	void deleteFactureById(long id);

}
