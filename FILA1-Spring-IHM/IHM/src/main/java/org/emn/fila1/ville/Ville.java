package org.emn.fila1.ville;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ville {

	@Id
	private Integer id;
	
	private String nom;
	
	public Ville() {}
	
	public Ville(Integer id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String name) {
		this.nom = name;
	}	
}
