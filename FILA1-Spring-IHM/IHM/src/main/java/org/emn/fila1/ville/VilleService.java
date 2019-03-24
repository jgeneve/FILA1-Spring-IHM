package org.emn.fila1.ville;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class VilleService {
	
	@Autowired
	private VilleRepository villeRepository;
	
	public List<Ville> getVilles() {
		List<Ville> villes = new ArrayList<Ville>();
		
		for(Ville t: villeRepository.findAll()) {
			villes.add(t);
		}
		
		return villes;	
	}
}
