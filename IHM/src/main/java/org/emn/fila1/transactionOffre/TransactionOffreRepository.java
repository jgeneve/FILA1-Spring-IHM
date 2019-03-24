package org.emn.fila1.transactionOffre;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TransactionOffreRepository extends CrudRepository<TransactionOffre, Integer> {

	@Query(value = "SELECT count(*) FROM transaction_offre WHERE statut = :statut", nativeQuery = true)
	public int getNombreCoursesByStatut(@Param("statut") String statut);
	
	@Query(value = "SELECT count(id), SUBSTRING(date_transaction_offre, 1, 10) AS maDate FROM transaction_offre WHERE statut = :statut GROUP BY maDate", nativeQuery = true)
	public List<Object> getNombreCoursesDayByStatut(@Param("statut") String statut);
}
