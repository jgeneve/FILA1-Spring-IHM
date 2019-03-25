package kafka.classes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transport {
    @JsonProperty("start_station")
    private String start_station;
    @JsonProperty("end_station")
    private String end_station;
    @JsonProperty("start")
    private String start;
    @JsonProperty("nb_passengers")
    private String nb_passengers;
    
	public String getStart_station() {
		return start_station;
	}
	public String getEnd_station() {
		return end_station;
	}
	public String getStart() {
		return start;
	}
	public String getNb_passengers() {
		return nb_passengers;
	}

    
}
