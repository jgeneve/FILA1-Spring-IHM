package org.emn.fila1.transactionOffre;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import kafka.classes.Line;
import kafka.classes.Request;

@RestController
public class TransactionOffreController {

	@Autowired
	private TransactionOffreService transactionOffreService;

	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
		
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
	
	
	Gson gson = new Gson();
	
	@KafkaListener(topics = "request")
	public void listenerResponse(String message) throws JSONException, ParseException {
		JsonParser parser = new JsonParser();
		JsonObject obj = parser.parse(message).getAsJsonObject();		
		Request request = gson.fromJson(obj, Request.class);
		for(Line l : request.getRun().getLines()) {
			int idOffre = this.getIdOffre(l.getStartStation(), l.getEndStation());
				
			 Long startTime = Long.parseLong(l.getStartTime())*1000;
             Date dateOffer = new Date(startTime);
			 DateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			 f.setTimeZone(TimeZone.getTimeZone("UTC"));
			 String formattedDate = f.format(dateOffer);
			
			TransactionOffre t = new TransactionOffre(Integer.parseInt(request.getIdRequest()), idOffre, "demand", formattedDate, 0);
			transactionOffreService.addTransactionOffre(t);
		}
	}
	
	public int getIdOffre(String villeDepart, String villeArrivee) {
		int idOffre = 0;
		if (villeDepart.equals("A") && villeArrivee.equals("B")) idOffre = 1;
		if (villeDepart.equals("A") && villeArrivee.equals("C")) idOffre = 2;
		if (villeDepart.equals("A") && villeArrivee.equals("D")) idOffre = 3;
		if (villeDepart.equals("B") && villeArrivee.equals("A")) idOffre = 4;
		if (villeDepart.equals("B") && villeArrivee.equals("C")) idOffre = 5;
		if (villeDepart.equals("B") && villeArrivee.equals("D")) idOffre = 6;
		if (villeDepart.equals("C") && villeArrivee.equals("A")) idOffre = 7;
		if (villeDepart.equals("C") && villeArrivee.equals("B")) idOffre = 8;
		if (villeDepart.equals("C") && villeArrivee.equals("D")) idOffre = 9;
		return idOffre;
	}
}
