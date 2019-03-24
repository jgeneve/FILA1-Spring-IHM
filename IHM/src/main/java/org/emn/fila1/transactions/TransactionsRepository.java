package org.emn.fila1.transactions;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TransactionsRepository extends CrudRepository<Transactions, Integer> {

	@Query(value = "SELECT sum(score) FROM TRANSACTIONS", nativeQuery = true)
	public int getTotalScore();
	
	@Query(value = "SELECT sum(score), SUBSTRING(date_transaction_offre, 1, 10) AS maDate\n" + 
			"FROM transactions t\n" + 
			"LEFT OUTER JOIN transaction_offre t_o on t.transaction_id = t_o.id\n" + 
			"LEFT OUTER JOIN transaction_travaux t_t on t.transaction_id = t_t.id\n" + 
			"LEFT OUTER JOIN transaction_sillon t_s on t.transaction_id = t_s.id\n" + 
			"GROUP BY maDate", nativeQuery = true)
	public List<Object> getScoreJour();
	
	@Query(value = "SELECT count(*) as nbTravaux, SUBSTRING(date_travaux, 1, 10) AS date "
			+ "FROM transaction_travaux GROUP BY date ", nativeQuery = true)
	public List<Object> getNombreTravauxJour();
	
	
	
}
