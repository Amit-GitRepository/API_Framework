
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
    "serviceTypeId",
    "serviceTypeName",
    "serviceCategoryName",
    "serviceCategoryId",
    "serviceGroupName",
    "serviceGroupId",
    "description",
    "quantity",
    "available",
    "quantityAvailable",
    "physicalFlightId",
    "flightNumber",
    "itemOrder",
    "servicePriority",
    "price",
    "originalPrice"
})
public class ServicesIncluded {

    @JsonProperty("serviceTypeId")
    private Integer serviceTypeId;
    @JsonProperty("serviceTypeName")
    private String serviceTypeName;
    @JsonProperty("serviceCategoryName")
    private String serviceCategoryName;
    @JsonProperty("serviceCategoryId")
    private Integer serviceCategoryId;
    @JsonProperty("serviceGroupName")
    private String serviceGroupName;
    @JsonProperty("serviceGroupId")
    private Integer serviceGroupId;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("available")
    private Boolean available;
    @JsonProperty("quantityAvailable")
    private Integer quantityAvailable;
    @JsonProperty("physicalFlightId")
    private String physicalFlightId;
    @JsonProperty("flightNumber")
    private String flightNumber;
    @JsonProperty("itemOrder")
    private Integer itemOrder;
    @JsonProperty("servicePriority")
    private Integer servicePriority;
    @JsonProperty("price")
    private Double price;
    @JsonProperty("originalPrice")
    private Double originalPrice;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("serviceTypeId")
    public Integer getServiceTypeId() {
        return serviceTypeId;
    }

    @JsonProperty("serviceTypeId")
    public void setServiceTypeId(Integer serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    @JsonProperty("serviceTypeName")
    public String getServiceTypeName() {
        return serviceTypeName;
    }

    @JsonProperty("serviceTypeName")
    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    @JsonProperty("serviceCategoryName")
    public String getServiceCategoryName() {
        return serviceCategoryName;
    }

    @JsonProperty("serviceCategoryName")
    public void setServiceCategoryName(String serviceCategoryName) {
        this.serviceCategoryName = serviceCategoryName;
    }

    @JsonProperty("serviceCategoryId")
    public Integer getServiceCategoryId() {
        return serviceCategoryId;
    }

    @JsonProperty("serviceCategoryId")
    public void setServiceCategoryId(Integer serviceCategoryId) {
        this.serviceCategoryId = serviceCategoryId;
    }

    @JsonProperty("serviceGroupName")
    public String getServiceGroupName() {
        return serviceGroupName;
    }

    @JsonProperty("serviceGroupName")
    public void setServiceGroupName(String serviceGroupName) {
        this.serviceGroupName = serviceGroupName;
    }

    @JsonProperty("serviceGroupId")
    public Integer getServiceGroupId() {
        return serviceGroupId;
    }

    @JsonProperty("serviceGroupId")
    public void setServiceGroupId(Integer serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("available")
    public Boolean getAvailable() {
        return available;
    }

    @JsonProperty("available")
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @JsonProperty("quantityAvailable")
    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    @JsonProperty("quantityAvailable")
    public void setQuantityAvailable(Integer quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    @JsonProperty("physicalFlightId")
    public String getPhysicalFlightId() {
        return physicalFlightId;
    }

    @JsonProperty("physicalFlightId")
    public void setPhysicalFlightId(String physicalFlightId) {
        this.physicalFlightId = physicalFlightId;
    }

    @JsonProperty("flightNumber")
    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("itemOrder")
    public Integer getItemOrder() {
        return itemOrder;
    }

    @JsonProperty("itemOrder")
    public void setItemOrder(Integer itemOrder) {
        this.itemOrder = itemOrder;
    }

    @JsonProperty("servicePriority")
    public Integer getServicePriority() {
        return servicePriority;
    }

    @JsonProperty("servicePriority")
    public void setServicePriority(Integer servicePriority) {
        this.servicePriority = servicePriority;
    }

    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    @JsonProperty("originalPrice")
    public Double getOriginalPrice() {
        return originalPrice;
    }

    @JsonProperty("originalPrice")
    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
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
