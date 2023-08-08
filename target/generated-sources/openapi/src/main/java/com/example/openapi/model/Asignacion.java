package com.example.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Asignacion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-18T18:46:39.162798100-03:00[America/Buenos_Aires]")
@Entity
public class Asignacion   {
  @JsonProperty("id_inmueble")
  @Id
  private Integer idInmueble;

  @JsonProperty("ruta")
  private Integer ruta;

  @JsonProperty("folio")
  private Integer folio;

  public Asignacion idInmueble(Integer idInmueble) {
    this.idInmueble = idInmueble;
    return this;
  }

  /**
   * Identificador del inmueble
   * @return idInmueble
  */
  @ApiModelProperty(value = "Identificador del inmueble")


  public Integer getIdInmueble() {
    return idInmueble;
  }

  public void setIdInmueble(Integer idInmueble) {
    this.idInmueble = idInmueble;
  }

  public Asignacion ruta(Integer ruta) {
    this.ruta = ruta;
    return this;
  }

  /**
   * Ruta que se asigna al servicio
   * minimum: 1
   * @return ruta
  */
  @ApiModelProperty(value = "Ruta que se asigna al servicio")

@Min(1)
  public Integer getRuta() {
    return ruta;
  }

  public void setRuta(Integer ruta) {
    this.ruta = ruta;
  }

  public Asignacion folio(Integer folio) {
    this.folio = folio;
    return this;
  }

  /**
   * Folio que se asigna al servicio
   * @return folio
  */
  @ApiModelProperty(value = "Folio que se asigna al servicio")


  public Integer getFolio() {
    return folio;
  }

  public void setFolio(Integer folio) {
    this.folio = folio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Asignacion asignacion = (Asignacion) o;
    return Objects.equals(this.idInmueble, asignacion.idInmueble) &&
        Objects.equals(this.ruta, asignacion.ruta) &&
        Objects.equals(this.folio, asignacion.folio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idInmueble, ruta, folio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asignacion {\n");
    
    sb.append("    idInmueble: ").append(toIndentedString(idInmueble)).append("\n");
    sb.append("    ruta: ").append(toIndentedString(ruta)).append("\n");
    sb.append("    folio: ").append(toIndentedString(folio)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

