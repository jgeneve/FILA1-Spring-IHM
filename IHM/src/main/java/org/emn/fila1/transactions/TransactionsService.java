package org.emn.fila1.transactions;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.emn.fila1.ville.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TransactionsService {
	
	@Autowired
	private TransactionsRepository transactionsRepository;
	
	public int getScore() {
		return transactionsRepository.getTotalScore();	
	}
	
	public List<Object> getScoreJour() {
		return transactionsRepository.getScoreJour();	
	}
	
	public List<Object> getNombreTravauxJour() {
		return transactionsRepository.getNombreTravauxJour();	
	}
	
	public List<Transactions> getTransactions() {
		List<Transactions> transactions = new ArrayList<Transactions>();
		
		for(Transactions t: transactionsRepository.findAll()) {
			transactions.add(t);
		}
		
		return transactions;	
	}
}
