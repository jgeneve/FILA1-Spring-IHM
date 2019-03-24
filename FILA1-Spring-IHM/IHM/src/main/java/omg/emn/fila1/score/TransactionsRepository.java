package omg.emn.fila1.score;

import org.springframework.data.repository.CrudRepository;

public interface TransactionsRepository extends CrudRepository<Transactions, Integer> {
	Transactions findByName(String name);
	void deleteByName(String name);
}
