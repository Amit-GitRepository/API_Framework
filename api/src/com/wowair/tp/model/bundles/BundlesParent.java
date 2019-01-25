
package com.wowair.tp.model.bundles;

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
    "logicalFlightId",
    "logicalFlightKey",
    "flightNumber",
    "carrierCode",
    "departureTime",
    "arrivalTime",
    "origin",
    "originMetroGroup",
    "destinationMetroGroup",
    "destination",
    "originDefaultTerminal",
    "originName",
    "destinationName",
    "flightTime",
    "aircraftType",
    "originCity",
    "destinationCity",
    "legDetails",
    "promoCode",
    "customerKey",
    "airlinePersonKey",
    "originIANATimeZoneName",
    "destinationIANATimeZoneName",
    "bundles"
})
public class BundlesParent {

    @JsonProperty("logicalFlightId")
    private Integer logicalFlightId;
    @JsonProperty("logicalFlightKey")
    private Object logicalFlightKey;
    @JsonProperty("flightNumber")
    private String flightNumber;
    @JsonProperty("carrierCode")
    private String carrierCode;
    @JsonProperty("departureTime")
    private String departureTime;
    @JsonProperty("arrivalTime")
    private String arrivalTime;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("originMetroGroup")
    private Object originMetroGroup;
    @JsonProperty("destinationMetroGroup")
    private Object destinationMetroGroup;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("originDefaultTerminal")
    private Object originDefaultTerminal;
    @JsonProperty("originName")
    private String originName;
    @JsonProperty("destinationName")
    private String destinationName;
    @JsonProperty("flightTime")
    private Double flightTime;
    @JsonProperty("aircraftType")
    private String aircraftType;
    @JsonProperty("originCity")
    private Object originCity;
    @JsonProperty("destinationCity")
    private Object destinationCity;
    @JsonProperty("legDetails")
    private List<LegDetail> legDetails = null;
    @JsonProperty("promoCode")
    private Object promoCode;
    @JsonProperty("customerKey")
    private Object customerKey;
    @JsonProperty("airlinePersonKey")
    private Object airlinePersonKey;
    @JsonProperty("originIANATimeZoneName")
    private Object originIANATimeZoneName;
    @JsonProperty("destinationIANATimeZoneName")
    private Object destinationIANATimeZoneName;
    @JsonProperty("bundles")
    private Bundles bundles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("logicalFlightId")
    public Integer getLogicalFlightId() {
        return logicalFlightId;
    }

    @JsonProperty("logicalFlightId")
    public void setLogicalFlightId(Integer logicalFlightId) {
        this.logicalFlightId = logicalFlightId;
    }

    @JsonProperty("logicalFlightKey")
    public Object getLogicalFlightKey() {
        return logicalFlightKey;
    }

    @JsonProperty("logicalFlightKey")
    public void setLogicalFlightKey(Object logicalFlightKey) {
        this.logicalFlightKey = logicalFlightKey;
    }

    @JsonProperty("flightNumber")
    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("carrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    @JsonProperty("carrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    @JsonProperty("departureTime")
    public String getDepartureTime() {
        return departureTime;
    }

    @JsonProperty("departureTime")
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @JsonProperty("arrivalTime")
    public String getArrivalTime() {
        return arrivalTime;
    }

    @JsonProperty("arrivalTime")
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("originMetroGroup")
    public Object getOriginMetroGroup() {
        return originMetroGroup;
    }

    @JsonProperty("originMetroGroup")
    public void setOriginMetroGroup(Object originMetroGroup) {
        this.originMetroGroup = originMetroGroup;
    }

    @JsonProperty("destinationMetroGroup")
    public Object getDestinationMetroGroup() {
        return destinationMetroGroup;
    }

    @JsonProperty("destinationMetroGroup")
    public void setDestinationMetroGroup(Object destinationMetroGroup) {
        this.destinationMetroGroup = destinationMetroGroup;
    }

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("originDefaultTerminal")
    public Object getOriginDefaultTerminal() {
        return originDefaultTerminal;
    }

    @JsonProperty("originDefaultTerminal")
    public void setOriginDefaultTerminal(Object originDefaultTerminal) {
        this.originDefaultTerminal = originDefaultTerminal;
    }

    @JsonProperty("originName")
    public String getOriginName() {
        return originName;
    }

    @JsonProperty("originName")
    public void setOriginName(String originName) {
        this.originName = originName;
    }

    @JsonProperty("destinationName")
    public String getDestinationName() {
        return destinationName;
    }

    @JsonProperty("destinationName")
    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    @JsonProperty("flightTime")
    public Double getFlightTime() {
        return flightTime;
    }

    @JsonProperty("flightTime")
    public void setFlightTime(Double flightTime) {
        this.flightTime = flightTime;
    }

    @JsonProperty("aircraftType")
    public String getAircraftType() {
        return aircraftType;
    }

    @JsonProperty("aircraftType")
    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    @JsonProperty("originCity")
    public Object getOriginCity() {
        return originCity;
    }

    @JsonProperty("originCity")
    public void setOriginCity(Object originCity) {
        this.originCity = originCity;
    }

    @JsonProperty("destinationCity")
    public Object getDestinationCity() {
        return destinationCity;
    }

    @JsonProperty("destinationCity")
    public void setDestinationCity(Object destinationCity) {
        this.destinationCity = destinationCity;
    }

    @JsonProperty("legDetails")
    public List<LegDetail> getLegDetails() {
        return legDetails;
    }

    @JsonProperty("legDetails")
    public void setLegDetails(List<LegDetail> legDetails) {
        this.legDetails = legDetails;
    }

    @JsonProperty("promoCode")
    public Object getPromoCode() {
        return promoCode;
    }

    @JsonProperty("promoCode")
    public void setPromoCode(Object promoCode) {
        this.promoCode = promoCode;
    }

    @JsonProperty("customerKey")
    public Object getCustomerKey() {
        return customerKey;
    }

    @JsonProperty("customerKey")
    public void setCustomerKey(Object customerKey) {
        this.customerKey = customerKey;
    }

    @JsonProperty("airlinePersonKey")
    public Object getAirlinePersonKey() {
        return airlinePersonKey;
    }

    @JsonProperty("airlinePersonKey")
    public void setAirlinePersonKey(Object airlinePersonKey) {
        this.airlinePersonKey = airlinePersonKey;
    }

    @JsonProperty("originIANATimeZoneName")
    public Object getOriginIANATimeZoneName() {
        return originIANATimeZoneName;
    }

    @JsonProperty("originIANATimeZoneName")
    public void setOriginIANATimeZoneName(Object originIANATimeZoneName) {
        this.originIANATimeZoneName = originIANATimeZoneName;
    }

    @JsonProperty("destinationIANATimeZoneName")
    public Object getDestinationIANATimeZoneName() {
        return destinationIANATimeZoneName;
    }

    @JsonProperty("destinationIANATimeZoneName")
    public void setDestinationIANATimeZoneName(Object destinationIANATimeZoneName) {
        this.destinationIANATimeZoneName = destinationIANATimeZoneName;
    }

    @JsonProperty("bundles")
    public Bundles getBundles() {
        return bundles;
    }

    @JsonProperty("bundles")
    public void setBundles(Bundles bundles) {
        this.bundles = bundles;
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
