package org.emn.fila1.transactionOffre;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TransactionOffre {
	
	@Id
	private int id;
	
	private String offre_id;
	private int statut;
	private int date_transaction_offre;
	private String nombre_passagers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOffre_id() {
		return offre_id;
	}
	public void setOffre_id(String offre_id) {
		this.offre_id = offre_id;
	}
	public int getStatut() {
		return statut;
	}
	public void setStatut(int statut) {
		this.statut = statut;
	}
	public int getDate_transaction_offre() {
		return date_transaction_offre;
	}
	public void setDate_transaction_offre(int date_transaction_offre) {
		this.date_transaction_offre = date_transaction_offre;
	}
	public String getNombre_passagers() {
		return nombre_passagers;
	}
	public void setNombre_passagers(String nombre_passagers) {
		this.nombre_passagers = nombre_passagers;
	}
	
	
}
