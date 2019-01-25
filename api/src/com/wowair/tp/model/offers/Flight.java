
package com.wowair.tp.model.offers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "flightId",
    "carrierCode",
    "flightSegments",
    "origin",
    "destination",
    "flightNumber",
    "flightDuration",
    "sta",
    "std"
})
public class Flight {

    @JsonProperty("flightId")
    private String flightId;
    @JsonProperty("carrierCode")
    private String carrierCode;
    @JsonProperty("flightSegments")
    private List<FlightSegment> flightSegments = null;
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

    @JsonProperty("flightId")
    public String getFlightId() {
        return flightId;
    }

    @JsonProperty("flightId")
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    @JsonProperty("carrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    @JsonProperty("carrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    @JsonProperty("flightSegments")
    public List<FlightSegment> getFlightSegments() {
        return flightSegments;
    }

    @JsonProperty("flightSegments")
    public void setFlightSegments(List<FlightSegment> flightSegments) {
        this.flightSegments = flightSegments;
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
