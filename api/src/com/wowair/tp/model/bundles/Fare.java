
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
    "fareId",
    "paxType",
    "fareWithTaxes",
    "fareWithoutTaxes",
    "currency",
    "fareBasisCode",
    "description",
    "fareClassCode",
    "fareTypeId",
    "fareTypeName",
    "seatsAvailable",
    "promotionAmount",
    "promotionId",
    "isPaid",
    "active",
    "taxes",
    "fareTypeKey"
})
public class Fare {

    @JsonProperty("fareId")
    private Integer fareId;
    @JsonProperty("paxType")
    private Integer paxType;
    @JsonProperty("fareWithTaxes")
    private Double fareWithTaxes;
    @JsonProperty("fareWithoutTaxes")
    private Double fareWithoutTaxes;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("fareBasisCode")
    private String fareBasisCode;
    @JsonProperty("description")
    private String description;
    @JsonProperty("fareClassCode")
    private String fareClassCode;
    @JsonProperty("fareTypeId")
    private Integer fareTypeId;
    @JsonProperty("fareTypeName")
    private Integer fareTypeName;
    @JsonProperty("seatsAvailable")
    private Integer seatsAvailable;
    @JsonProperty("promotionAmount")
    private Double promotionAmount;
    @JsonProperty("promotionId")
    private Integer promotionId;
    @JsonProperty("isPaid")
    private Boolean isPaid;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("taxes")
    private List<Tax> taxes = null;
    @JsonProperty("fareTypeKey")
    private Object fareTypeKey;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fareId")
    public Integer getFareId() {
        return fareId;
    }

    @JsonProperty("fareId")
    public void setFareId(Integer fareId) {
        this.fareId = fareId;
    }

    @JsonProperty("paxType")
    public Integer getPaxType() {
        return paxType;
    }

    @JsonProperty("paxType")
    public void setPaxType(Integer paxType) {
        this.paxType = paxType;
    }

    @JsonProperty("fareWithTaxes")
    public Double getFareWithTaxes() {
        return fareWithTaxes;
    }

    @JsonProperty("fareWithTaxes")
    public void setFareWithTaxes(Double fareWithTaxes) {
        this.fareWithTaxes = fareWithTaxes;
    }

    @JsonProperty("fareWithoutTaxes")
    public Double getFareWithoutTaxes() {
        return fareWithoutTaxes;
    }

    @JsonProperty("fareWithoutTaxes")
    public void setFareWithoutTaxes(Double fareWithoutTaxes) {
        this.fareWithoutTaxes = fareWithoutTaxes;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("fareBasisCode")
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    @JsonProperty("fareBasisCode")
    public void setFareBasisCode(String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("fareClassCode")
    public String getFareClassCode() {
        return fareClassCode;
    }

    @JsonProperty("fareClassCode")
    public void setFareClassCode(String fareClassCode) {
        this.fareClassCode = fareClassCode;
    }

    @JsonProperty("fareTypeId")
    public Integer getFareTypeId() {
        return fareTypeId;
    }

    @JsonProperty("fareTypeId")
    public void setFareTypeId(Integer fareTypeId) {
        this.fareTypeId = fareTypeId;
    }

    @JsonProperty("fareTypeName")
    public Integer getFareTypeName() {
        return fareTypeName;
    }

    @JsonProperty("fareTypeName")
    public void setFareTypeName(Integer fareTypeName) {
        this.fareTypeName = fareTypeName;
    }

    @JsonProperty("seatsAvailable")
    public Integer getSeatsAvailable() {
        return seatsAvailable;
    }

    @JsonProperty("seatsAvailable")
    public void setSeatsAvailable(Integer seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    @JsonProperty("promotionAmount")
    public Double getPromotionAmount() {
        return promotionAmount;
    }

    @JsonProperty("promotionAmount")
    public void setPromotionAmount(Double promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    @JsonProperty("promotionId")
    public Integer getPromotionId() {
        return promotionId;
    }

    @JsonProperty("promotionId")
    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    @JsonProperty("isPaid")
    public Boolean getIsPaid() {
        return isPaid;
    }

    @JsonProperty("isPaid")
    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("taxes")
    public List<Tax> getTaxes() {
        return taxes;
    }

    @JsonProperty("taxes")
    public void setTaxes(List<Tax> taxes) {
        this.taxes = taxes;
    }

    @JsonProperty("fareTypeKey")
    public Object getFareTypeKey() {
        return fareTypeKey;
    }

    @JsonProperty("fareTypeKey")
    public void setFareTypeKey(Object fareTypeKey) {
        this.fareTypeKey = fareTypeKey;
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
