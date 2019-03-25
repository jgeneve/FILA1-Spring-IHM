package org.emn.fila1.distance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DistanceService {
	
	@Autowired
	private DistanceRepository distanceRepository;
	
	public int getSillons(int idDepart, int idArrivee) {
		return distanceRepository.findByVilles(idDepart, idArrivee)/10;
	}
	
}
