package omg.emn.fila1.score;

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
}
