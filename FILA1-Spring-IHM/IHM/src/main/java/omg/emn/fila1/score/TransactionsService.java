package omg.emn.fila1.score;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TransactionsService {
	
	@Autowired
	private TransactionsRepository transactionsRepository;
	
	public int getScore() {
		int score = 0;
		for(Transactions t: transactionsRepository.findAll()) {
			score += t.getScore();
		}
		
		return score;		
	}
}
