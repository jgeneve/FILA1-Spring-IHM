package org.emn.fila1.transactionOffre;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TransactionOffreService {
	
	@Autowired
	private TransactionOffreRepository transactionOffreRepository;
	
	public int getNombreCourses(String statut) {
		return transactionOffreRepository.getNombreCoursesByStatut(statut);
	}
	
	public List<Object> getNombreCoursesDay(String statut) {
		return transactionOffreRepository.getNombreCoursesDayByStatut(statut);
	}
	
	
}
