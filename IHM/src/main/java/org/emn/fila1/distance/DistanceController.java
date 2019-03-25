package org.emn.fila1.distance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistanceController {
	
	
	@Autowired
	private DistanceService distanceService;
	
}
