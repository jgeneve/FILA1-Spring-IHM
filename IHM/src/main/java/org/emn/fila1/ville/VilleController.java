package org.emn.fila1.ville;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VilleController {

	@Autowired
	private VilleService villeService;
		
	@CrossOrigin
	@RequestMapping("/villes")
	public List<Ville> getVilles() {
		return villeService.getVilles();
	}
}
