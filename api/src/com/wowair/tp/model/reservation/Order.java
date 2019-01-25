
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
    "cabin",
    "flightId",
    "fareBasisCode",
    "fareClassCode",
    "priceNoTaxes",
    "priceWithTaxes",
    "passengerId",
    "isPaid",
    "includedServices",
    "additionalServices",
    "seats",
    "taxes"
})
public class Order {

    @JsonProperty("cabin")
    private String cabin;
    @JsonProperty("flightId")
    private String flightId;
    @JsonProperty("fareBasisCode")
    private String fareBasisCode;
    @JsonProperty("fareClassCode")
    private String fareClassCode;
    @JsonProperty("priceNoTaxes")
    private Double priceNoTaxes;
    @JsonProperty("priceWithTaxes")
    private Double priceWithTaxes;
    @JsonProperty("passengerId")
    private String passengerId;
    @JsonProperty("isPaid")
    private Boolean isPaid;
    @JsonProperty("includedServices")
    private List<IncludedService> includedServices = null;
    @JsonProperty("additionalServices")
    private List<Object> additionalServices = null;
    @JsonProperty("seats")
    private List<Seat> seats = null;
    @JsonProperty("taxes")
    private List<Tax> taxes = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cabin")
    public String getCabin() {
        return cabin;
    }

    @JsonProperty("cabin")
    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    @JsonProperty("flightId")
    public String getFlightId() {
        return flightId;
    }

    @JsonProperty("flightId")
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    @JsonProperty("fareBasisCode")
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    @JsonProperty("fareBasisCode")
    public void setFareBasisCode(String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }

    @JsonProperty("fareClassCode")
    public String getFareClassCode() {
        return fareClassCode;
    }

    @JsonProperty("fareClassCode")
    public void setFareClassCode(String fareClassCode) {
        this.fareClassCode = fareClassCode;
    }

    @JsonProperty("priceNoTaxes")
    public Double getPriceNoTaxes() {
        return priceNoTaxes;
    }

    @JsonProperty("priceNoTaxes")
    public void setPriceNoTaxes(Double priceNoTaxes) {
        this.priceNoTaxes = priceNoTaxes;
    }

    @JsonProperty("priceWithTaxes")
    public Double getPriceWithTaxes() {
        return priceWithTaxes;
    }

    @JsonProperty("priceWithTaxes")
    public void setPriceWithTaxes(Double priceWithTaxes) {
        this.priceWithTaxes = priceWithTaxes;
    }

    @JsonProperty("passengerId")
    public String getPassengerId() {
        return passengerId;
    }

    @JsonProperty("passengerId")
    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    @JsonProperty("isPaid")
    public Boolean getIsPaid() {
        return isPaid;
    }

    @JsonProperty("isPaid")
    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    @JsonProperty("includedServices")
    public List<IncludedService> getIncludedServices() {
        return includedServices;
    }

    @JsonProperty("includedServices")
    public void setIncludedServices(List<IncludedService> includedServices) {
        this.includedServices = includedServices;
    }

    @JsonProperty("additionalServices")
    public List<Object> getAdditionalServices() {
        return additionalServices;
    }

    @JsonProperty("additionalServices")
    public void setAdditionalServices(List<Object> additionalServices) {
        this.additionalServices = additionalServices;
    }

    @JsonProperty("seats")
    public List<Seat> getSeats() {
        return seats;
    }

    @JsonProperty("seats")
    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    @JsonProperty("taxes")
    public List<Tax> getTaxes() {
        return taxes;
    }

    @JsonProperty("taxes")
    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
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
