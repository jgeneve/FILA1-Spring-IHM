package kafka.classes;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Offers {
    @JsonProperty("offers")
    private List<Offer> offers;

	public List<Offer> getOffers() {
		return offers;
	}    
}
