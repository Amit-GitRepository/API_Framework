
package com.wowair.tp.model.reservation;

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
    "isActive",
    "carrierCode",
    "destination",
    "flightNumber",
    "flightDuration",
    "flightId",
    "origin",
    "sta",
    "std",
    "originCity",
    "destinationCity",
    "flightSegments",
    "originIANATimeZoneName",
    "destinationIANATimeZoneName",
    "originCountry",
    "destinationCountry"
})
public class Flight {

    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("carrierCode")
    private String carrierCode;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("flightNumber")
    private String flightNumber;
    @JsonProperty("flightDuration")
    private Integer flightDuration;
    @JsonProperty("flightId")
    private String flightId;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("sta")
    private String sta;
    @JsonProperty("std")
    private String std;
    @JsonProperty("originCity")
    private String originCity;
    @JsonProperty("destinationCity")
    private String destinationCity;
    @JsonProperty("flightSegments")
    private List<FlightSegment> flightSegments = null;
    @JsonProperty("originIANATimeZoneName")
    private String originIANATimeZoneName;
    @JsonProperty("destinationIANATimeZoneName")
    private String destinationIANATimeZoneName;
    @JsonProperty("originCountry")
    private String originCountry;
    @JsonProperty("destinationCountry")
    private String destinationCountry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("isActive")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("isActive")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("carrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    @JsonProperty("carrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
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

    @JsonProperty("flightId")
    public String getFlightId() {
        return flightId;
    }

    @JsonProperty("flightId")
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
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

    @JsonProperty("flightSegments")
    public List<FlightSegment> getFlightSegments() {
        return flightSegments;
    }

    @JsonProperty("flightSegments")
    public void setFlightSegments(List<FlightSegment> flightSegments) {
        this.flightSegments = flightSegments;
    }

    @JsonProperty("originIANATimeZoneName")
    public String getOriginIANATimeZoneName() {
        return originIANATimeZoneName;
    }

    @JsonProperty("originIANATimeZoneName")
    public void setOriginIANATimeZoneName(String originIANATimeZoneName) {
        this.originIANATimeZoneName = originIANATimeZoneName;
    }

    @JsonProperty("destinationIANATimeZoneName")
    public String getDestinationIANATimeZoneName() {
        return destinationIANATimeZoneName;
    }

    @JsonProperty("destinationIANATimeZoneName")
    public void setDestinationIANATimeZoneName(String destinationIANATimeZoneName) {
        this.destinationIANATimeZoneName = destinationIANATimeZoneName;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
