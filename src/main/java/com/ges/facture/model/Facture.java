package com.ges.facture.model;

import java.time.LocalDate;

public class Facture {
	
	private long id;
	private String ref;
	private LocalDate date;
	
	
	
	public Facture() {
	}

	public Facture(long id, String ref, LocalDate date) {
		this.id = id;
		this.ref = ref;
		this.date = date;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

}
