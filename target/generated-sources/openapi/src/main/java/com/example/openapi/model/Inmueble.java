package com.example.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Inmueble
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-18T18:46:39.162798100-03:00[America/Buenos_Aires]")
@Entity
public class Inmueble   {
  @JsonProperty("id_inmueble")
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idInmueble;

  /**
   * Si se trata de un local (loc), departamento (dpto) o servicio comunitario (sc)
   */
  public enum TipoEnum {
    PPAL("ppal"),
    
    LOC("loc"),
    
    DPTO("dpto"),
    
    SC("sc");

    private String value;

    TipoEnum(String value) {
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
    public static TipoEnum fromValue(String value) {
      for (TipoEnum b : TipoEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("tipo")
  private TipoEnum tipo;

  @JsonProperty("numero-letra")
  private String numeroLetra;

  @JsonProperty("id_solicitud")
  private Integer idSolicitud;

  public Inmueble idInmueble(Integer idInmueble) {
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

  public Inmueble tipo(TipoEnum tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Si se trata de un local (loc), departamento (dpto) o servicio comunitario (sc)
   * @return tipo
  */
  @ApiModelProperty(value = "Si se trata de un local (loc), departamento (dpto) o servicio comunitario (sc)")


  public TipoEnum getTipo() {
    return tipo;
  }

  public void setTipo(TipoEnum tipo) {
    this.tipo = tipo;
  }

  public Inmueble numeroLetra(String numeroLetra) {
    this.numeroLetra = numeroLetra;
    return this;
  }

  /**
   * Número o letra para local o dpto
   * @return numeroLetra
  */
  @ApiModelProperty(value = "Número o letra para local o dpto")


  public String getNumeroLetra() {
    return numeroLetra;
  }

  public void setNumeroLetra(String numeroLetra) {
    this.numeroLetra = numeroLetra;
  }

  public Inmueble idSolicitud(Integer idSolicitud) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Inmueble inmueble = (Inmueble) o;
    return Objects.equals(this.idInmueble, inmueble.idInmueble) &&
        Objects.equals(this.tipo, inmueble.tipo) &&
        Objects.equals(this.numeroLetra, inmueble.numeroLetra) &&
        Objects.equals(this.idSolicitud, inmueble.idSolicitud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idInmueble, tipo, numeroLetra, idSolicitud);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Inmueble {\n");
    
    sb.append("    idInmueble: ").append(toIndentedString(idInmueble)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    numeroLetra: ").append(toIndentedString(numeroLetra)).append("\n");
    sb.append("    idSolicitud: ").append(toIndentedString(idSolicitud)).append("\n");
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

