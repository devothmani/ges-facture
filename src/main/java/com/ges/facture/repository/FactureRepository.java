package com.ges.facture.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ges.facture.model.Facture;

@Repository
public interface FactureRepository extends CrudRepository<Facture, Long>{

}
