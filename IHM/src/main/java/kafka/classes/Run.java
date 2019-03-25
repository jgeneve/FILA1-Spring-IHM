package kafka.classes;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Run {
    @JsonProperty("lines")
    private List<Line> lines;

    public List<Line> getLines() {
        return lines;
    }

    public String toString() {
        return lines.toString();
    }
}
