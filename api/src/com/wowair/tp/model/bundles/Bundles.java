
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
    "BUND",
    "BUNZ",
    "BUNC",
    "BUNB"
})
public class Bundles {

    @JsonProperty("BUND")
    private BUND bUND;
    @JsonProperty("BUNZ")
    private BUNZ bUNZ;
    @JsonProperty("BUNC")
    private BUNC bUNC;
    @JsonProperty("BUNB")
    private BUNB bUNB;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("BUND")
    public BUND getBUND() {
        return bUND;
    }

    @JsonProperty("BUND")
    public void setBUND(BUND bUND) {
        this.bUND = bUND;
    }

    @JsonProperty("BUNZ")
    public BUNZ getBUNZ() {
        return bUNZ;
    }

    @JsonProperty("BUNZ")
    public void setBUNZ(BUNZ bUNZ) {
        this.bUNZ = bUNZ;
    }

    @JsonProperty("BUNC")
    public BUNC getBUNC() {
        return bUNC;
    }

    @JsonProperty("BUNC")
    public void setBUNC(BUNC bUNC) {
        this.bUNC = bUNC;
    }

    @JsonProperty("BUNB")
    public BUNB getBUNB() {
        return bUNB;
    }

    @JsonProperty("BUNB")
    public void setBUNB(BUNB bUNB) {
        this.bUNB = bUNB;
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
