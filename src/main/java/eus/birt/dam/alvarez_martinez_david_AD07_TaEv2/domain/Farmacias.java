package eus.birt.dam.alvarez_martinez_david_AD07_TaEv2.domain;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"_id",
"id",
"type",
"geometry",
"properties"
})

@Data
@AllArgsConstructor
@Document(collection="farmacias")
public class Farmacias {
public Farmacias() {
		// TODO Auto-generated constructor stub
	}
@JsonProperty("_id")
private String id;
	
@JsonProperty("id")
private Integer farmaciaId;
@JsonProperty("type")
private String type;
@JsonProperty("geometry")
private Geometry geometry;
@JsonProperty("properties")
private Properties properties;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}