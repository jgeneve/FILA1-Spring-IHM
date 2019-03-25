package kafka.classes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request {
    @JsonProperty("idRequest")
    private String idRequest;

    @JsonProperty("run")
    private Run run;

    public String getIdRequest() {
        return idRequest;
    }

    public Run getRun() {
        return run;
    }

    public String toString() {
        return "idRequest="+idRequest+", "+run.toString();
    }
}
