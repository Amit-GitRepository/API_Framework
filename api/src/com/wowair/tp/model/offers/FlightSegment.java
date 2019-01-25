
package com.wowair.tp.model.offers;

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
    "flightSegmentId",
    "aircraftType",
    "operator",
    "originTerminal",
    "destinationTerminal",
    "origin",
    "destination",
    "flightNumber",
    "flightDuration",
    "sta",
    "std"
})
public class FlightSegment {

    @JsonProperty("flightSegmentId")
    private String flightSegmentId;
    @JsonProperty("aircraftType")
    private String aircraftType;
    @JsonProperty("operator")
    private String operator;
    @JsonProperty("originTerminal")
    private String originTerminal;
    @JsonProperty("destinationTerminal")
    private String destinationTerminal;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("flightNumber")
    private String flightNumber;
    @JsonProperty("flightDuration")
    private Integer flightDuration;
    @JsonProperty("sta")
    private String sta;
    @JsonProperty("std")
    private String std;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("flightSegmentId")
    public String getFlightSegmentId() {
        return flightSegmentId;
    }

    @JsonProperty("flightSegmentId")
    public void setFlightSegmentId(String flightSegmentId) {
        this.flightSegmentId = flightSegmentId;
    }

    @JsonProperty("aircraftType")
    public String getAircraftType() {
        return aircraftType;
    }

    @JsonProperty("aircraftType")
    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @JsonProperty("originTerminal")
    public String getOriginTerminal() {
        return originTerminal;
    }

    @JsonProperty("originTerminal")
    public void setOriginTerminal(String originTerminal) {
        this.originTerminal = originTerminal;
    }

    @JsonProperty("destinationTerminal")
    public String getDestinationTerminal() {
        return destinationTerminal;
    }

    @JsonProperty("destinationTerminal")
    public void setDestinationTerminal(String destinationTerminal) {
        this.destinationTerminal = destinationTerminal;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("flightNumber")
    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("flightDuration")
    public Integer getFlightDuration() {
        return flightDuration;
    }

    @JsonProperty("flightDuration")
    public void setFlightDuration(Integer flightDuration) {
        this.flightDuration = flightDuration;
    }

    @JsonProperty("sta")
    public String getSta() {
        return sta;
    }

    @JsonProperty("sta")
    public void setSta(String sta) {
        this.sta = sta;
    }

    @JsonProperty("std")
    public String getStd() {
        return std;
    }

    @JsonProperty("std")
    public void setStd(String std) {
        this.std = std;
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
