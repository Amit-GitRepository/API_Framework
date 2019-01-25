
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
    "currency",
    "currencyDecimalCount",
    "administrationFeeRules",
    "offers",
    "flights",
    "redirectUrl"
})
public class OffersParent {

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("currencyDecimalCount")
    private Integer currencyDecimalCount;
    @JsonProperty("administrationFeeRules")
    private List<AdministrationFeeRule> administrationFeeRules = null;
    @JsonProperty("offers")
    private List<Offer> offers = null;
    @JsonProperty("flights")
    private List<Flight> flights = null;
    @JsonProperty("redirectUrl")
    private String redirectUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("currencyDecimalCount")
    public Integer getCurrencyDecimalCount() {
        return currencyDecimalCount;
    }

    @JsonProperty("currencyDecimalCount")
    public void setCurrencyDecimalCount(Integer currencyDecimalCount) {
        this.currencyDecimalCount = currencyDecimalCount;
    }

    @JsonProperty("administrationFeeRules")
    public List<AdministrationFeeRule> getAdministrationFeeRules() {
        return administrationFeeRules;
    }

    @JsonProperty("administrationFeeRules")
    public void setAdministrationFeeRules(List<AdministrationFeeRule> administrationFeeRules) {
        this.administrationFeeRules = administrationFeeRules;
    }

    @JsonProperty("offers")
    public List<Offer> getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    @JsonProperty("flights")
    public List<Flight> getFlights() {
        return flights;
    }

    @JsonProperty("flights")
    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    @JsonProperty("redirectUrl")
    public String getRedirectUrl() {
        return redirectUrl;
    }

    @JsonProperty("redirectUrl")
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
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
