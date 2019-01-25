
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
    "totalPriceWithDiscounts",
    "totalMyWowPriceWithDiscounts",
    "totalPrice",
    "totalMyWowPrice",
    "bundleDiscount",
    "promoDiscount"
})
public class AdultPrice {

    @JsonProperty("totalPriceWithDiscounts")
    private Double totalPriceWithDiscounts;
    @JsonProperty("totalMyWowPriceWithDiscounts")
    private Double totalMyWowPriceWithDiscounts;
    @JsonProperty("totalPrice")
    private Double totalPrice;
    @JsonProperty("totalMyWowPrice")
    private Double totalMyWowPrice;
    @JsonProperty("bundleDiscount")
    private Double bundleDiscount;
    @JsonProperty("promoDiscount")
    private Double promoDiscount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("totalPriceWithDiscounts")
    public Double getTotalPriceWithDiscounts() {
        return totalPriceWithDiscounts;
    }

    @JsonProperty("totalPriceWithDiscounts")
    public void setTotalPriceWithDiscounts(Double totalPriceWithDiscounts) {
        this.totalPriceWithDiscounts = totalPriceWithDiscounts;
    }

    @JsonProperty("totalMyWowPriceWithDiscounts")
    public Double getTotalMyWowPriceWithDiscounts() {
        return totalMyWowPriceWithDiscounts;
    }

    @JsonProperty("totalMyWowPriceWithDiscounts")
    public void setTotalMyWowPriceWithDiscounts(Double totalMyWowPriceWithDiscounts) {
        this.totalMyWowPriceWithDiscounts = totalMyWowPriceWithDiscounts;
    }

    @JsonProperty("totalPrice")
    public Double getTotalPrice() {
        return totalPrice;
    }

    @JsonProperty("totalPrice")
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @JsonProperty("totalMyWowPrice")
    public Double getTotalMyWowPrice() {
        return totalMyWowPrice;
    }

    @JsonProperty("totalMyWowPrice")
    public void setTotalMyWowPrice(Double totalMyWowPrice) {
        this.totalMyWowPrice = totalMyWowPrice;
    }

    @JsonProperty("bundleDiscount")
    public Double getBundleDiscount() {
        return bundleDiscount;
    }

    @JsonProperty("bundleDiscount")
    public void setBundleDiscount(Double bundleDiscount) {
        this.bundleDiscount = bundleDiscount;
    }

    @JsonProperty("promoDiscount")
    public Double getPromoDiscount() {
        return promoDiscount;
    }

    @JsonProperty("promoDiscount")
    public void setPromoDiscount(Double promoDiscount) {
        this.promoDiscount = promoDiscount;
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
