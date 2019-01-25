
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
    "administrationFee",
    "fareBasisCode",
    "fareClassCode",
    "priceNoTaxes",
    "brandedFare",
    "priceWithTaxes",
    "flightId",
    "paxType",
    "isMyWow",
    "taxes",
    "includedServices"
})
public class Offer {

    @JsonProperty("administrationFee")
    private Integer administrationFee;
    @JsonProperty("fareBasisCode")
    private String fareBasisCode;
    @JsonProperty("fareClassCode")
    private String fareClassCode;
    @JsonProperty("priceNoTaxes")
    private Double priceNoTaxes;
    @JsonProperty("brandedFare")
    private String brandedFare;
    @JsonProperty("priceWithTaxes")
    private Double priceWithTaxes;
    @JsonProperty("flightId")
    private String flightId;
    @JsonProperty("paxType")
    private String paxType;
    @JsonProperty("isMyWow")
    private Boolean isMyWow;
    @JsonProperty("taxes")
    private List<Tax> taxes = null;
    @JsonProperty("includedServices")
    private List<IncludedService> includedServices = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("administrationFee")
    public Integer getAdministrationFee() {
        return administrationFee;
    }

    @JsonProperty("administrationFee")
    public void setAdministrationFee(Integer administrationFee) {
        this.administrationFee = administrationFee;
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

    @JsonProperty("brandedFare")
    public String getBrandedFare() {
        return brandedFare;
    }

    @JsonProperty("brandedFare")
    public void setBrandedFare(String brandedFare) {
        this.brandedFare = brandedFare;
    }

    @JsonProperty("priceWithTaxes")
    public Double getPriceWithTaxes() {
        return priceWithTaxes;
    }

    @JsonProperty("priceWithTaxes")
    public void setPriceWithTaxes(Double priceWithTaxes) {
        this.priceWithTaxes = priceWithTaxes;
    }

    @JsonProperty("flightId")
    public String getFlightId() {
        return flightId;
    }

    @JsonProperty("flightId")
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    @JsonProperty("paxType")
    public String getPaxType() {
        return paxType;
    }

    @JsonProperty("paxType")
    public void setPaxType(String paxType) {
        this.paxType = paxType;
    }

    @JsonProperty("isMyWow")
    public Boolean getIsMyWow() {
        return isMyWow;
    }

    @JsonProperty("isMyWow")
    public void setIsMyWow(Boolean isMyWow) {
        this.isMyWow = isMyWow;
    }

    @JsonProperty("taxes")
    public List<Tax> getTaxes() {
        return taxes;
    }

    @JsonProperty("taxes")
    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

    @JsonProperty("includedServices")
    public List<IncludedService> getIncludedServices() {
        return includedServices;
    }

    @JsonProperty("includedServices")
    public void setIncludedServices(List<IncludedService> includedServices) {
        this.includedServices = includedServices;
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
