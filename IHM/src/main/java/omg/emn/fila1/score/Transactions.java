package omg.emn.fila1.score;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transactions {
	
	@Id
	private int id;
	
	private String type_transaction;
	private int transaction_id;
	private int score;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType_transaction() {
		return type_transaction;
	}
	public void setType_transaction(String type_transaction) {
		this.type_transaction = type_transaction;
	}
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
