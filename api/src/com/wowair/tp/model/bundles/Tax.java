
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
    "amount",
    "code",
    "codeType",
    "description",
    "includedInFare",
    "taxId",
    "isPaid",
    "active"
})
public class Tax {

    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("code")
    private String code;
    @JsonProperty("codeType")
    private String codeType;
    @JsonProperty("description")
    private String description;
    @JsonProperty("includedInFare")
    private Boolean includedInFare;
    @JsonProperty("taxId")
    private Integer taxId;
    @JsonProperty("isPaid")
    private Boolean isPaid;
    @JsonProperty("active")
    private Boolean active;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("codeType")
    public String getCodeType() {
        return codeType;
    }

    @JsonProperty("codeType")
    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("includedInFare")
    public Boolean getIncludedInFare() {
        return includedInFare;
    }

    @JsonProperty("includedInFare")
    public void setIncludedInFare(Boolean includedInFare) {
        this.includedInFare = includedInFare;
    }

    @JsonProperty("taxId")
    public Integer getTaxId() {
        return taxId;
    }

    @JsonProperty("taxId")
    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
