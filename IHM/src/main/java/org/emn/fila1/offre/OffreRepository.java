package org.emn.fila1.offre;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface OffreRepository extends CrudRepository<Offre, Integer>{
	@Query(value = "SELECT * FROM offre WHERE date_offre=:dateOffre", nativeQuery = true)
	Offre findByDateOffre(String dateOffre);
}