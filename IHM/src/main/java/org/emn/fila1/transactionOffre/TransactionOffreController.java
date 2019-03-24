package org.emn.fila1.transactionOffre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionOffreController {

	@Autowired
	private TransactionOffreService transactionOffreService;
		
	@CrossOrigin
	@RequestMapping("/courses/{statut}")
	public int getNombreCoursesByStatut(@PathVariable String statut) {
		return transactionOffreService.getNombreCourses(statut);
	}
	
	@CrossOrigin
	@RequestMapping("/coursesday/{statut}")
	public List<Object> getNombreCoursesDayByStatut(@PathVariable String statut) {
		return transactionOffreService.getNombreCoursesDay(statut);
	}	
}
