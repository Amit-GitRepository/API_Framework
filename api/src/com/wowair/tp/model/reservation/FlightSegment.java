
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
    "aircraftType",
    "carrierCode",
    "operator",
    "destination",
    "flightNumber",
    "flightDuration",
    "originTerminal",
    "origin",
    "flightSegmentId",
    "sta",
    "std",
    "destinationTerminal",
    "originCountry",
    "destinationCountry",
    "originCity",
    "destinationCity"
})
public class FlightSegment {

    @JsonProperty("aircraftType")
    private String aircraftType;
    @JsonProperty("carrierCode")
    private String carrierCode;
    @JsonProperty("operator")
    private String operator;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("flightNumber")
    private String flightNumber;
    @JsonProperty("flightDuration")
    private Integer flightDuration;
    @JsonProperty("originTerminal")
    private String originTerminal;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("flightSegmentId")
    private String flightSegmentId;
    @JsonProperty("sta")
    private String sta;
    @JsonProperty("std")
    private String std;
    @JsonProperty("destinationTerminal")
    private String destinationTerminal;
    @JsonProperty("originCountry")
    private String originCountry;
    @JsonProperty("destinationCountry")
    private String destinationCountry;
    @JsonProperty("originCity")
    private String originCity;
    @JsonProperty("destinationCity")
    private String destinationCity;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("aircraftType")
    public String getAircraftType() {
        return aircraftType;
    }

    @JsonProperty("aircraftType")
    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    @JsonProperty("carrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    @JsonProperty("carrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
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

    @JsonProperty("originTerminal")
    public String getOriginTerminal() {
        return originTerminal;
    }

    @JsonProperty("originTerminal")
    public void setOriginTerminal(String originTerminal) {
        this.originTerminal = originTerminal;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("flightSegmentId")
    public String getFlightSegmentId() {
        return flightSegmentId;
    }

    @JsonProperty("flightSegmentId")
    public void setFlightSegmentId(String flightSegmentId) {
        this.flightSegmentId = flightSegmentId;
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

    @JsonProperty("destinationTerminal")
    public String getDestinationTerminal() {
        return destinationTerminal;
    }

    @JsonProperty("destinationTerminal")
    public void setDestinationTerminal(String destinationTerminal) {
        this.destinationTerminal = destinationTerminal;
    }

    @JsonProperty("originCountry")
    public String getOriginCountry() {
        return originCountry;
    }

    @JsonProperty("originCountry")
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    @JsonProperty("destinationCountry")
    public String getDestinationCountry() {
        return destinationCountry;
    }

    @JsonProperty("destinationCountry")
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    @JsonProperty("originCity")
    public String getOriginCity() {
        return originCity;
    }

    @JsonProperty("originCity")
    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    @JsonProperty("destinationCity")
    public String getDestinationCity() {
        return destinationCity;
    }

    @JsonProperty("destinationCity")
    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
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
