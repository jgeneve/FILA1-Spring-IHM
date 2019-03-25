package kafka.classes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Line {
    @JsonProperty("startStation")
    private String startStation;
    @JsonProperty("endStation")
    private String endStation;
    @JsonProperty("startTime")
    private String startTime;

    public String getStartStation() {
        return startStation;
    }

    public String getEndStation() {
        return endStation;
    }

    public String getStartTime() {
        return startTime;
    }

    @Override
    public String toString() {
        return startStation + ", " + endStation + ", " + startTime;
    }
}
