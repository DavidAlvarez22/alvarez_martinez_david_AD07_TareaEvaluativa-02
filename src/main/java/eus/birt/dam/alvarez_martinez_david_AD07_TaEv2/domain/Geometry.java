package eus.birt.dam.alvarez_martinez_david_AD07_TaEv2.domain;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"type",
"coordinates"
})
@Data
@NoArgsConstructor
public class Geometry {

@JsonProperty("type")
private String type;
@JsonProperty("coordinates")
private List<Double> coordinates;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}