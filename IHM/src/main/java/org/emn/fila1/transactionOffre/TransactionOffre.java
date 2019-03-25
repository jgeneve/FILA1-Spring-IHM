package org.emn.fila1.transactionOffre;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TransactionOffre {
	
	@Id
	private int id;
	
	private int offre_id;
	private String statut;
	private String date_transaction_offre;
	private int nombre_passagers;
	
	public TransactionOffre() {}
	
	public TransactionOffre(int id, int offre_id, String statut, String date_transaction_offre, int nombre_passagers) {
		super();
		this.id = id;
		this.offre_id = offre_id;
		this.statut = statut;
		this.date_transaction_offre = date_transaction_offre;
		this.nombre_passagers = nombre_passagers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOffre_id() {
		return offre_id;
	}
	public void setOffre_id(int offre_id) {
		this.offre_id = offre_id;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getDate_transaction_offre() {
		return date_transaction_offre;
	}
	public void setDate_transaction_offre(String date_transaction_offre) {
		this.date_transaction_offre = date_transaction_offre;
	}
	public int getNombre_passagers() {
		return nombre_passagers;
	}
	public void setNombre_passagers(int nombre_passagers) {
		this.nombre_passagers = nombre_passagers;
	}
	
	
}
