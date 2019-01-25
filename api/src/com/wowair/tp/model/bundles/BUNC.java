
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
    "bundleName",
    "bundleId",
    "ssrCode",
    "available",
    "serviceIncludedForPassengerType",
    "adultPrice",
    "infantPrice",
    "childPrice",
    "fares",
    "myWowFares",
    "servicesIncluded"
})
public class BUNC {

    @JsonProperty("bundleName")
    private String bundleName;
    @JsonProperty("bundleId")
    private Integer bundleId;
    @JsonProperty("ssrCode")
    private String ssrCode;
    @JsonProperty("available")
    private Boolean available;
    @JsonProperty("serviceIncludedForPassengerType")
    private List<Integer> serviceIncludedForPassengerType = null;
    @JsonProperty("adultPrice")
    private AdultPrice adultPrice;
    @JsonProperty("infantPrice")
    private Object infantPrice;
    @JsonProperty("childPrice")
    private Object childPrice;
    @JsonProperty("fares")
    private List<Fare> fares = null;
    @JsonProperty("myWowFares")
    private List<Object> myWowFares = null;
    @JsonProperty("servicesIncluded")
    private List<ServicesIncluded> servicesIncluded = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("bundleName")
    public String getBundleName() {
        return bundleName;
    }

    @JsonProperty("bundleName")
    public void setBundleName(String bundleName) {
        this.bundleName = bundleName;
    }

    @JsonProperty("bundleId")
    public Integer getBundleId() {
        return bundleId;
    }

    @JsonProperty("bundleId")
    public void setBundleId(Integer bundleId) {
        this.bundleId = bundleId;
    }

    @JsonProperty("ssrCode")
    public String getSsrCode() {
        return ssrCode;
    }

    @JsonProperty("ssrCode")
    public void setSsrCode(String ssrCode) {
        this.ssrCode = ssrCode;
    }

    @JsonProperty("available")
    public Boolean getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @JsonProperty("serviceIncludedForPassengerType")
    public List<Integer> getServiceIncludedForPassengerType() {
        return serviceIncludedForPassengerType;
    }

    @JsonProperty("serviceIncludedForPassengerType")
    public void setServiceIncludedForPassengerType(List<Integer> serviceIncludedForPassengerType) {
        this.serviceIncludedForPassengerType = serviceIncludedForPassengerType;
    }

    @JsonProperty("adultPrice")
    public AdultPrice getAdultPrice() {
        return adultPrice;
    }

    @JsonProperty("adultPrice")
    public void setAdultPrice(AdultPrice adultPrice) {
        this.adultPrice = adultPrice;
    }

    @JsonProperty("infantPrice")
    public Object getInfantPrice() {
        return infantPrice;
    }

    @JsonProperty("infantPrice")
    public void setInfantPrice(Object infantPrice) {
        this.infantPrice = infantPrice;
    }

    @JsonProperty("childPrice")
    public Object getChildPrice() {
        return childPrice;
    }

    @JsonProperty("childPrice")
    public void setChildPrice(Object childPrice) {
        this.childPrice = childPrice;
    }

    @JsonProperty("fares")
    public List<Fare> getFares() {
        return fares;
    }

    @JsonProperty("fares")
    public void setFares(List<Fare> fares) {
        this.fares = fares;
    }

    @JsonProperty("myWowFares")
    public List<Object> getMyWowFares() {
        return myWowFares;
    }

    @JsonProperty("myWowFares")
    public void setMyWowFares(List<Object> myWowFares) {
        this.myWowFares = myWowFares;
    }

    @JsonProperty("servicesIncluded")
    public List<ServicesIncluded> getServicesIncluded() {
        return servicesIncluded;
    }

    @JsonProperty("servicesIncluded")
    public void setServicesIncluded(List<ServicesIncluded> servicesIncluded) {
        this.servicesIncluded = servicesIncluded;
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
