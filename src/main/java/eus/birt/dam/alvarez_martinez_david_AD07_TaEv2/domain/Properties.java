package eus.birt.dam.alvarez_martinez_david_AD07_TaEv2.domain;

import java.util.LinkedHashMap;
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
"titularra1",
"titularra2",
"idif",
"idp_nora",
"helbidea",
"udalerria",
"cp",
"probintzia",
"telefonoa"
})

@Data
@NoArgsConstructor
public class Properties {

@JsonProperty("titularra1")
private String titularra1;
@JsonProperty("titularra2")
private String titularra2;
@JsonProperty("idif")
private String idif;
@JsonProperty("idp_nora")
private String idpNora;
@JsonProperty("helbidea")
private String helbidea;
@JsonProperty("udalerria")
private String udalerria;
@JsonProperty("cp")
private String cp;
@JsonProperty("probintzia")
private String probintzia;
@JsonProperty("telefonoa")
private String telefonoa;
@JsonIgnore
private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

}