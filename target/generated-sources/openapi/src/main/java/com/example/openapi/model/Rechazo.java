package com.example.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Rechazo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-18T18:46:39.162798100-03:00[America/Buenos_Aires]")
@Entity
public class Rechazo   {
  @JsonProperty("id_solicitud")
  @Id
  private Integer idSolicitud;

  /**
   * Razón por la que no se puede asignar la ruta y folio para los nuevos servicios. Los valores pueden ser sujeto inspección (s), no coinciden datos (n) y faltan datos (f)
   */
  public enum CausaEnum {
    S("S"),
    
    N("N"),
    
    F("F");

    private String value;

    CausaEnum(String value) {
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
    public static CausaEnum fromValue(String value) {
      for (CausaEnum b : CausaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("causa")
  private CausaEnum causa;

  public Rechazo idSolicitud(Integer idSolicitud) {
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

  public Rechazo causa(CausaEnum causa) {
    this.causa = causa;
    return this;
  }

  /**
   * Razón por la que no se puede asignar la ruta y folio para los nuevos servicios. Los valores pueden ser sujeto inspección (s), no coinciden datos (n) y faltan datos (f)
   * @return causa
  */
  @ApiModelProperty(value = "Razón por la que no se puede asignar la ruta y folio para los nuevos servicios. Los valores pueden ser sujeto inspección (s), no coinciden datos (n) y faltan datos (f)")


  public CausaEnum getCausa() {
    return causa;
  }

  public void setCausa(CausaEnum causa) {
    this.causa = causa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rechazo rechazo = (Rechazo) o;
    return Objects.equals(this.idSolicitud, rechazo.idSolicitud) &&
        Objects.equals(this.causa, rechazo.causa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idSolicitud, causa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rechazo {\n");
    
    sb.append("    idSolicitud: ").append(toIndentedString(idSolicitud)).append("\n");
    sb.append("    causa: ").append(toIndentedString(causa)).append("\n");
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

