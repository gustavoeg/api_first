package com.example.openapi.model;

import java.util.Objects;
import com.example.openapi.model.Asignacion;
import com.example.openapi.model.Inmueble;
import com.example.openapi.model.Rechazo;
import com.example.openapi.model.Respuesta;
import com.example.openapi.model.Solicitud;
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
 * SolicitudCompleta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-18T18:46:39.162798100-03:00[America/Buenos_Aires]")
public class SolicitudCompleta   {
  @JsonProperty("solicitud")
  private Solicitud solicitud;

  @JsonProperty("inmuebles")
  @Valid
  private List<Inmueble> inmuebles = null;

  @JsonProperty("asignaciones")
  @Valid
  private List<Asignacion> asignaciones = null;

  @JsonProperty("respuesta")
  private Respuesta respuesta;

  @JsonProperty("rechazo")
  private Rechazo rechazo;

  public SolicitudCompleta solicitud(Solicitud solicitud) {
    this.solicitud = solicitud;
    return this;
  }

  /**
   * Get solicitud
   * @return solicitud
  */
  @ApiModelProperty(value = "")

  @Valid

  public Solicitud getSolicitud() {
    return solicitud;
  }

  public void setSolicitud(Solicitud solicitud) {
    this.solicitud = solicitud;
  }

  public SolicitudCompleta inmuebles(List<Inmueble> inmuebles) {
    this.inmuebles = inmuebles;
    return this;
  }

  public SolicitudCompleta addInmueblesItem(Inmueble inmueblesItem) {
    if (this.inmuebles == null) {
      this.inmuebles = new ArrayList<>();
    }
    this.inmuebles.add(inmueblesItem);
    return this;
  }

  /**
   * Arreglo de objetos Inmueble
   * @return inmuebles
  */
  @ApiModelProperty(example = "[{\"id_inmueble\":1,\"tipo\":\"loc\",\"numero-letra\":\"1\",\"id_solicitud\":1},{\"id_inmueble\":2,\"tipo\":\"dpto\",\"numero-letra\":\"A\",\"id_solicitud\":2},{\"id_inmueble\":3,\"tipo\":\"sc\",\"numero-letra\":\"2\",\"id_solicitud\":3},{\"id_inmueble\":4,\"tipo\":\"ppal\",\"numero-letra\":\"3\",\"id_solicitud\":3}]", value = "Arreglo de objetos Inmueble")

  @Valid

  public List<Inmueble> getInmuebles() {
    return inmuebles;
  }

  public void setInmuebles(List<Inmueble> inmuebles) {
    this.inmuebles = inmuebles;
  }

  public SolicitudCompleta asignaciones(List<Asignacion> asignaciones) {
    this.asignaciones = asignaciones;
    return this;
  }

  public SolicitudCompleta addAsignacionesItem(Asignacion asignacionesItem) {
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

  public SolicitudCompleta respuesta(Respuesta respuesta) {
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

  public SolicitudCompleta rechazo(Rechazo rechazo) {
    this.rechazo = rechazo;
    return this;
  }

  /**
   * Get rechazo
   * @return rechazo
  */
  @ApiModelProperty(value = "")

  @Valid

  public Rechazo getRechazo() {
    return rechazo;
  }

  public void setRechazo(Rechazo rechazo) {
    this.rechazo = rechazo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SolicitudCompleta solicitudCompleta = (SolicitudCompleta) o;
    return Objects.equals(this.solicitud, solicitudCompleta.solicitud) &&
        Objects.equals(this.inmuebles, solicitudCompleta.inmuebles) &&
        Objects.equals(this.asignaciones, solicitudCompleta.asignaciones) &&
        Objects.equals(this.respuesta, solicitudCompleta.respuesta) &&
        Objects.equals(this.rechazo, solicitudCompleta.rechazo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solicitud, inmuebles, asignaciones, respuesta, rechazo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SolicitudCompleta {\n");
    
    sb.append("    solicitud: ").append(toIndentedString(solicitud)).append("\n");
    sb.append("    inmuebles: ").append(toIndentedString(inmuebles)).append("\n");
    sb.append("    asignaciones: ").append(toIndentedString(asignaciones)).append("\n");
    sb.append("    respuesta: ").append(toIndentedString(respuesta)).append("\n");
    sb.append("    rechazo: ").append(toIndentedString(rechazo)).append("\n");
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

