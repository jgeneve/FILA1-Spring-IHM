package org.emn.fila1.kafkaListener;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaController {
	
	@Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
	
	@KafkaListener(topics = "request")
	public void listenerResponse(String message) throws JSONException {
		JSONObject jsonObj = new JSONObject(message);
		System.out.println(this.parseJsonTransactionOffre(jsonObj));
		//TODO parse obj
		//TODO push dans la BDD
	}
	
	public String parseJsonTransactionOffre(JSONObject obj) {
		try {
			String idRequest = (String) obj.get("idRequest");
			return idRequest;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
