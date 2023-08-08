package com.example.openapi.model;

import java.util.Objects;
import com.example.openapi.model.Asignacion;
import com.example.openapi.model.Respuesta;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponderAsignar
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-18T18:46:39.162798100-03:00[America/Buenos_Aires]")
public class ResponderAsignar   {
  @JsonProperty("asignaciones")
  @Valid
  private List<Asignacion> asignaciones = null;

  @JsonProperty("respuesta")
  private Respuesta respuesta;

  public ResponderAsignar asignaciones(List<Asignacion> asignaciones) {
    this.asignaciones = asignaciones;
    return this;
  }

  public ResponderAsignar addAsignacionesItem(Asignacion asignacionesItem) {
    if (this.asignaciones == null) {
      this.asignaciones = new ArrayList<>();
    }
    this.asignaciones.add(asignacionesItem);
    return this;
  }

  /**
   * Arreglo de objetos Asignacion
   * @return asignaciones
  */
  @ApiModelProperty(example = "[{\"id_inmueble\":1,\"ruta\":100,\"folio\":2030},{\"id_inmueble\":2,\"ruta\":100,\"folio\":2032},{\"id_inmueble\":3,\"ruta\":100,\"folio\":2034}]", value = "Arreglo de objetos Asignacion")

  @Valid

  public List<Asignacion> getAsignaciones() {
    return asignaciones;
  }

  public void setAsignaciones(List<Asignacion> asignaciones) {
    this.asignaciones = asignaciones;
  }

  public ResponderAsignar respuesta(Respuesta respuesta) {
    this.respuesta = respuesta;
    return this;
  }

  /**
   * Get respuesta
   * @return respuesta
  */
  @ApiModelProperty(value = "")

  @Valid

  public Respuesta getRespuesta() {
    return respuesta;
  }

  public void setRespuesta(Respuesta respuesta) {
    this.respuesta = respuesta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponderAsignar responderAsignar = (ResponderAsignar) o;
    return Objects.equals(this.asignaciones, responderAsignar.asignaciones) &&
        Objects.equals(this.respuesta, responderAsignar.respuesta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asignaciones, respuesta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponderAsignar {\n");
    
    sb.append("    asignaciones: ").append(toIndentedString(asignaciones)).append("\n");
    sb.append("    respuesta: ").append(toIndentedString(respuesta)).append("\n");
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

