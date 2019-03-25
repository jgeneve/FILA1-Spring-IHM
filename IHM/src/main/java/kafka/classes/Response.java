package kafka.classes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
    @JsonProperty("id")
    private final String id;
    @JsonProperty("outcome")
    private final boolean outcome;

    public Response(String id, boolean outcome) {
        this.id = id;
        this.outcome = outcome;
    }

    public String getId() {
        return id;
    }

    public boolean getOutcome() {
        return outcome;
    }

    public String toString() {
        return id + ", " + outcome;
    }
}
