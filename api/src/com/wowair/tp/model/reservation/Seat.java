
package com.wowair.tp.model.reservation;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "row",
    "seat",
    "flightSegmentId",
    "seatType"
})
public class Seat {

    @JsonProperty("row")
    private String row;
    @JsonProperty("seat")
    private String seat;
    @JsonProperty("flightSegmentId")
    private String flightSegmentId;
    @JsonProperty("seatType")
    private String seatType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("row")
    public String getRow() {
        return row;
    }

    @JsonProperty("row")
    public void setRow(String row) {
        this.row = row;
    }

    @JsonProperty("seat")
    public String getSeat() {
        return seat;
    }

    @JsonProperty("seat")
    public void setSeat(String seat) {
        this.seat = seat;
    }

    @JsonProperty("flightSegmentId")
    public String getFlightSegmentId() {
        return flightSegmentId;
    }

    @JsonProperty("flightSegmentId")
    public void setFlightSegmentId(String flightSegmentId) {
        this.flightSegmentId = flightSegmentId;
    }

    @JsonProperty("seatType")
    public String getSeatType() {
        return seatType;
    }

    @JsonProperty("seatType")
    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
