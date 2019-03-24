package org.emn.fila1.transactions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionsController {

	@Autowired
	private TransactionsService transactionsService;
		
	@CrossOrigin
	@RequestMapping("/score")
	public int getScore() {
		return transactionsService.getScore();
	}	
	
	@CrossOrigin
	@RequestMapping("/transactions")
	public List<Transactions> getTransactions() {
		return transactionsService.getTransactions();
	}	
	
	@CrossOrigin
	@RequestMapping("/scorejour")
	public List<Object> getScoreJour() {
		return transactionsService.getScoreJour();
	}
	
	@CrossOrigin
	@RequestMapping("/travauxjour")
	public List<Object> getTravauxJour() {
		return transactionsService.getNombreTravauxJour();
	}
}
