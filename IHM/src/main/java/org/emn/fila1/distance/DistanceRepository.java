package org.emn.fila1.distance;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DistanceRepository extends CrudRepository<Distance, Integer>{
	
	@Query(value = "SELECT distance WHERE ville_depart_id=:depart AND ville_arrivee_id=:arrivee", nativeQuery=true)
	int findByVilles(int depart, int arrivee);
	
	
}
