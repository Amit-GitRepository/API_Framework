
package com.wowair.tp.model.bundles;

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
    "arrivalTime",
    "departureTime",
    "destination",
    "destinationMetroGroup",
    "flightNumber",
    "flightTime",
    "fromTerminal",
    "toTerminal",
    "international",
    "operatingCarrier",
    "origin",
    "originMetroGroup",
    "physicalFlightID",
    "originName",
    "destinationName",
    "physicalFlightKey",
    "seat",
    "carrierCode",
    "customerKey",
    "apisType",
    "airCraftType",
    "recordNumber",
    "active",
    "flightTimeMinutes",
    "destinationShortName",
    "originShortName"
})
public class LegDetail {

    @JsonProperty("arrivalTime")
    private String arrivalTime;
    @JsonProperty("departureTime")
    private String departureTime;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("destinationMetroGroup")
    private Object destinationMetroGroup;
    @JsonProperty("flightNumber")
    private String flightNumber;
    @JsonProperty("flightTime")
    private Double flightTime;
    @JsonProperty("fromTerminal")
    private String fromTerminal;
    @JsonProperty("toTerminal")
    private Object toTerminal;
    @JsonProperty("international")
    private Boolean international;
    @JsonProperty("operatingCarrier")
    private String operatingCarrier;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("originMetroGroup")
    private Object originMetroGroup;
    @JsonProperty("physicalFlightID")
    private Integer physicalFlightID;
    @JsonProperty("originName")
    private String originName;
    @JsonProperty("destinationName")
    private String destinationName;
    @JsonProperty("physicalFlightKey")
    private Object physicalFlightKey;
    @JsonProperty("seat")
    private Object seat;
    @JsonProperty("carrierCode")
    private Object carrierCode;
    @JsonProperty("customerKey")
    private Object customerKey;
    @JsonProperty("apisType")
    private Integer apisType;
    @JsonProperty("airCraftType")
    private String airCraftType;
    @JsonProperty("recordNumber")
    private Integer recordNumber;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("flightTimeMinutes")
    private Double flightTimeMinutes;
    @JsonProperty("destinationShortName")
    private String destinationShortName;
    @JsonProperty("originShortName")
    private String originShortName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("arrivalTime")
    public String getArrivalTime() {
        return arrivalTime;
    }

    @JsonProperty("arrivalTime")
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @JsonProperty("departureTime")
    public String getDepartureTime() {
        return departureTime;
    }

    @JsonProperty("departureTime")
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("destinationMetroGroup")
    public Object getDestinationMetroGroup() {
        return destinationMetroGroup;
    }

    @JsonProperty("destinationMetroGroup")
    public void setDestinationMetroGroup(Object destinationMetroGroup) {
        this.destinationMetroGroup = destinationMetroGroup;
    }

    @JsonProperty("flightNumber")
    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("flightTime")
    public Double getFlightTime() {
        return flightTime;
    }

    @JsonProperty("flightTime")
    public void setFlightTime(Double flightTime) {
        this.flightTime = flightTime;
    }

    @JsonProperty("fromTerminal")
    public String getFromTerminal() {
        return fromTerminal;
    }

    @JsonProperty("fromTerminal")
    public void setFromTerminal(String fromTerminal) {
        this.fromTerminal = fromTerminal;
    }

    @JsonProperty("toTerminal")
    public Object getToTerminal() {
        return toTerminal;
    }

    @JsonProperty("toTerminal")
    public void setToTerminal(Object toTerminal) {
        this.toTerminal = toTerminal;
    }

    @JsonProperty("international")
    public Boolean getInternational() {
        return international;
    }

    @JsonProperty("international")
    public void setInternational(Boolean international) {
        this.international = international;
    }

    @JsonProperty("operatingCarrier")
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    @JsonProperty("operatingCarrier")
    public void setOperatingCarrier(String operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
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

    @JsonProperty("physicalFlightID")
    public Integer getPhysicalFlightID() {
        return physicalFlightID;
    }

    @JsonProperty("physicalFlightID")
    public void setPhysicalFlightID(Integer physicalFlightID) {
        this.physicalFlightID = physicalFlightID;
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

    @JsonProperty("physicalFlightKey")
    public Object getPhysicalFlightKey() {
        return physicalFlightKey;
    }

    @JsonProperty("physicalFlightKey")
    public void setPhysicalFlightKey(Object physicalFlightKey) {
        this.physicalFlightKey = physicalFlightKey;
    }

    @JsonProperty("seat")
    public Object getSeat() {
        return seat;
    }

    @JsonProperty("seat")
    public void setSeat(Object seat) {
        this.seat = seat;
    }

    @JsonProperty("carrierCode")
    public Object getCarrierCode() {
        return carrierCode;
    }

    @JsonProperty("carrierCode")
    public void setCarrierCode(Object carrierCode) {
        this.carrierCode = carrierCode;
    }

    @JsonProperty("customerKey")
    public Object getCustomerKey() {
        return customerKey;
    }

    @JsonProperty("customerKey")
    public void setCustomerKey(Object customerKey) {
        this.customerKey = customerKey;
    }

    @JsonProperty("apisType")
    public Integer getApisType() {
        return apisType;
    }

    @JsonProperty("apisType")
    public void setApisType(Integer apisType) {
        this.apisType = apisType;
    }

    @JsonProperty("airCraftType")
    public String getAirCraftType() {
        return airCraftType;
    }

    @JsonProperty("airCraftType")
    public void setAirCraftType(String airCraftType) {
        this.airCraftType = airCraftType;
    }

    @JsonProperty("recordNumber")
    public Integer getRecordNumber() {
        return recordNumber;
    }

    @JsonProperty("recordNumber")
    public void setRecordNumber(Integer recordNumber) {
        this.recordNumber = recordNumber;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("flightTimeMinutes")
    public Double getFlightTimeMinutes() {
        return flightTimeMinutes;
    }

    @JsonProperty("flightTimeMinutes")
    public void setFlightTimeMinutes(Double flightTimeMinutes) {
        this.flightTimeMinutes = flightTimeMinutes;
    }

    @JsonProperty("destinationShortName")
    public String getDestinationShortName() {
        return destinationShortName;
    }

    @JsonProperty("destinationShortName")
    public void setDestinationShortName(String destinationShortName) {
        this.destinationShortName = destinationShortName;
    }

    @JsonProperty("originShortName")
    public String getOriginShortName() {
        return originShortName;
    }

    @JsonProperty("originShortName")
    public void setOriginShortName(String originShortName) {
        this.originShortName = originShortName;
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
