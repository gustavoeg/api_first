package com.example.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Respuesta
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-18T18:46:39.162798100-03:00[America/Buenos_Aires]")
@Entity
@Table(name = "respuesta")
public class Respuesta   {
  @JsonProperty("id_solicitud")
  @Id
  private Integer idSolicitud;

  /**
   * Si a la solicitud se le asignó (A) o si fue rechazada (R)
   */
  public enum RespuestaEnum {
    A("A"),
    
    R("R");

    private String value;

    RespuestaEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RespuestaEnum fromValue(String value) {
      for (RespuestaEnum b : RespuestaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("respuesta")
  private RespuestaEnum respuesta;

  @JsonProperty("detalles")
  private String detalles;

  @JsonProperty("legajo_respuesta")
  private Integer legajoRespuesta;

  @JsonProperty("fecha_respuesta")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime fechaRespuesta;

  public Respuesta idSolicitud(Integer idSolicitud) {
    this.idSolicitud = idSolicitud;
    return this;
  }

  /**
   * Identificador de la solicitud
   * @return idSolicitud
  */
  @ApiModelProperty(value = "Identificador de la solicitud")


  public Integer getIdSolicitud() {
    return idSolicitud;
  }

  public void setIdSolicitud(Integer idSolicitud) {
    this.idSolicitud = idSolicitud;
  }

  public Respuesta respuesta(RespuestaEnum respuesta) {
    this.respuesta = respuesta;
    return this;
  }

  /**
   * Si a la solicitud se le asignó (A) o si fue rechazada (R)
   * @return respuesta
  */
  @ApiModelProperty(value = "Si a la solicitud se le asignó (A) o si fue rechazada (R)")


  public RespuestaEnum getRespuesta() {
    return respuesta;
  }

  public void setRespuesta(RespuestaEnum respuesta) {
    this.respuesta = respuesta;
  }

  public Respuesta detalles(String detalles) {
    this.detalles = detalles;
    return this;
  }

  /**
   * se incluyen observaciones relevantes en la respuesta
   * @return detalles
  */
  @ApiModelProperty(value = "se incluyen observaciones relevantes en la respuesta")


  public String getDetalles() {
    return detalles;
  }

  public void setDetalles(String detalles) {
    this.detalles = detalles;
  }

  public Respuesta legajoRespuesta(Integer legajoRespuesta) {
    this.legajoRespuesta = legajoRespuesta;
    return this;
  }

  /**
   * legajo del agente que reponde la solicitud
   * @return legajoRespuesta
  */
  @ApiModelProperty(value = "legajo del agente que reponde la solicitud")


  public Integer getLegajoRespuesta() {
    return legajoRespuesta;
  }

  public void setLegajoRespuesta(Integer legajoRespuesta) {
    this.legajoRespuesta = legajoRespuesta;
  }

  public Respuesta fechaRespuesta(OffsetDateTime fechaRespuesta) {
    this.fechaRespuesta = fechaRespuesta;
    return this;
  }

  /**
   * fecha y hora en la que se responde la solicitud.
   * @return fechaRespuesta
  */
  @ApiModelProperty(value = "fecha y hora en la que se responde la solicitud.")

  @Valid

  public OffsetDateTime getFechaRespuesta() {
    return fechaRespuesta;
  }

  public void setFechaRespuesta(OffsetDateTime fechaRespuesta) {
    this.fechaRespuesta = fechaRespuesta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Respuesta respuesta = (Respuesta) o;
    return Objects.equals(this.idSolicitud, respuesta.idSolicitud) &&
        Objects.equals(this.respuesta, respuesta.respuesta) &&
        Objects.equals(this.detalles, respuesta.detalles) &&
        Objects.equals(this.legajoRespuesta, respuesta.legajoRespuesta) &&
        Objects.equals(this.fechaRespuesta, respuesta.fechaRespuesta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idSolicitud, respuesta, detalles, legajoRespuesta, fechaRespuesta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");
    
    sb.append("    idSolicitud: ").append(toIndentedString(idSolicitud)).append("\n");
    sb.append("    respuesta: ").append(toIndentedString(respuesta)).append("\n");
    sb.append("    detalles: ").append(toIndentedString(detalles)).append("\n");
    sb.append("    legajoRespuesta: ").append(toIndentedString(legajoRespuesta)).append("\n");
    sb.append("    fechaRespuesta: ").append(toIndentedString(fechaRespuesta)).append("\n");
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

