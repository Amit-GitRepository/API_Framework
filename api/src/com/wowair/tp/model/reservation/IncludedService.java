
package com.wowair.tp.model.reservation;

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
    "quantity",
    "serviceType",
    "flightSegmentId",
    "isFlightSegmentService"
})
public class IncludedService {

    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("serviceType")
    private String serviceType;
    @JsonProperty("flightSegmentId")
    private String flightSegmentId;
    @JsonProperty("isFlightSegmentService")
    private Boolean isFlightSegmentService;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("serviceType")
    public String getServiceType() {
        return serviceType;
    }

    @JsonProperty("serviceType")
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @JsonProperty("flightSegmentId")
    public String getFlightSegmentId() {
        return flightSegmentId;
    }

    @JsonProperty("flightSegmentId")
    public void setFlightSegmentId(String flightSegmentId) {
        this.flightSegmentId = flightSegmentId;
    }

    @JsonProperty("isFlightSegmentService")
    public Boolean getIsFlightSegmentService() {
        return isFlightSegmentService;
    }

    @JsonProperty("isFlightSegmentService")
    public void setIsFlightSegmentService(Boolean isFlightSegmentService) {
        this.isFlightSegmentService = isFlightSegmentService;
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
