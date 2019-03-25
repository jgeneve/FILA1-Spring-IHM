package org.emn.fila1.offre;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OffreService {
	
	@Autowired
	private OffreRepository offreRepository;
	
	public List<Offre> getOffres() {
		List<Offre> topics = new ArrayList<Offre>();
		
		for(Offre t: offreRepository.findAll()) {
			topics.add(t);
		}
		
		return topics;
			
	}
	
	public Offre getOffre(String dateOffre){
		return offreRepository.findByDateOffre(dateOffre);
	}

}
