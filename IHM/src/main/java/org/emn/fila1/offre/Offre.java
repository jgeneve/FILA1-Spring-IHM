package org.emn.fila1.offre;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Offre {
	
	@Id
	private Integer id;
	
	private int ville_depart_id;
	
	private int ville_arrivee_id;
	
	private int nombre_passagers;
	
	private String date_offre;
	
	public Offre() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getVille_depart_id() {
		return ville_depart_id;
	}

	public void setVille_depart_id(int ville_depart_id) {
		this.ville_depart_id = ville_depart_id;
	}

	public int getVille_arrivee_id() {
		return ville_arrivee_id;
	}

	public void setVille_arrivee_id(int ville_arrivee_id) {
		this.ville_arrivee_id = ville_arrivee_id;
	}

	public int getNombre_passagers() {
		return nombre_passagers;
	}

	public void setNombre_passagers(int nombre_passagers) {
		this.nombre_passagers = nombre_passagers;
	}

	public String getDate_offre() {
		return date_offre;
	}

	public void setDate_offre(String date_offre) {
		this.date_offre = date_offre;
	}

	public Offre(Integer id, int ville_depart_id, int ville_arrivee_id, int nombre_passagers, String date_offre) {
		super();
		this.id = id;
		this.ville_depart_id = ville_depart_id;
		this.ville_arrivee_id = ville_arrivee_id;
		this.nombre_passagers = nombre_passagers;
		this.date_offre = date_offre;
	}
	
	
}
