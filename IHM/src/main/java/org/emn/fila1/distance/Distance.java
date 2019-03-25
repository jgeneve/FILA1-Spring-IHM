package org.emn.fila1.distance;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Distance {
	
	@Id
	private Integer id;
	
	private int ville_depart_id;
	
	private int ville_arrivee_id;
	
	private int distance;
	
	public Distance() {}

	public Distance(Integer id, int ville_depart_id, int ville_arrivee_id, int distance) {
		super();
		this.id = id;
		this.ville_depart_id = ville_depart_id;
		this.ville_arrivee_id = ville_arrivee_id;
		this.distance = distance;
	}

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

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
}
