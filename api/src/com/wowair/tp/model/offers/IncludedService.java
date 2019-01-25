
package com.wowair.tp.model.offers;

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
    "description",
    "serviceType",
    "serviceCategory",
    "serviceGroup",
    "quantityIncluded",
    "isFlightSegmentService",
    "flightSegmentId"
})
public class IncludedService {

    @JsonProperty("description")
    private String description;
    @JsonProperty("serviceType")
    private String serviceType;
    @JsonProperty("serviceCategory")
    private String serviceCategory;
    @JsonProperty("serviceGroup")
    private String serviceGroup;
    @JsonProperty("quantityIncluded")
    private Integer quantityIncluded;
    @JsonProperty("isFlightSegmentService")
    private Boolean isFlightSegmentService;
    @JsonProperty("flightSegmentId")
    private Object flightSegmentId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("serviceType")
    public String getServiceType() {
        return serviceType;
    }

    @JsonProperty("serviceType")
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @JsonProperty("serviceCategory")
    public String getServiceCategory() {
        return serviceCategory;
    }

    @JsonProperty("serviceCategory")
    public void setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    @JsonProperty("serviceGroup")
    public String getServiceGroup() {
        return serviceGroup;
    }

    @JsonProperty("serviceGroup")
    public void setServiceGroup(String serviceGroup) {
        this.serviceGroup = serviceGroup;
    }

    @JsonProperty("quantityIncluded")
    public Integer getQuantityIncluded() {
        return quantityIncluded;
    }

    @JsonProperty("quantityIncluded")
    public void setQuantityIncluded(Integer quantityIncluded) {
        this.quantityIncluded = quantityIncluded;
    }

    @JsonProperty("isFlightSegmentService")
    public Boolean getIsFlightSegmentService() {
        return isFlightSegmentService;
    }

    @JsonProperty("isFlightSegmentService")
    public void setIsFlightSegmentService(Boolean isFlightSegmentService) {
        this.isFlightSegmentService = isFlightSegmentService;
    }

    @JsonProperty("flightSegmentId")
    public Object getFlightSegmentId() {
        return flightSegmentId;
    }

    @JsonProperty("flightSegmentId")
    public void setFlightSegmentId(Object flightSegmentId) {
        this.flightSegmentId = flightSegmentId;
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
