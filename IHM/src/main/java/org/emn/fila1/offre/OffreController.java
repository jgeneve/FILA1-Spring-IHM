package org.emn.fila1.offre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OffreController {
	
	@Autowired
	private OffreService offreService;
	
	@CrossOrigin
	@RequestMapping("/offres/{dateOffre}")
	public Offre getOffre(@PathVariable String dateOffre) {
		return offreService.getOffre(dateOffre);
	}
	
	@CrossOrigin
	@RequestMapping("/offres")
	public List<Offre> getOffres() {
		return offreService.getOffres();
	}
}
