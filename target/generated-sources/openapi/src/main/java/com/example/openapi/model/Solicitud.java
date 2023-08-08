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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Solicitud
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-18T18:46:39.162798100-03:00[America/Buenos_Aires]")
@Entity
@Table(name = "solicitud")
public class Solicitud   {
  @JsonProperty("id_solicitud")
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idSolicitud;

  /**
   * parte de la identificación catastral, los posibles valores son manzana, fracción, quinta, chacra
   */
  public enum TipoMzaEnum {
    MANZANA("manzana"),
    
    FRACCION("fraccion"),
    
    QUINTA("quinta"),
    
    CHACRA("chacra");

    private String value;

    TipoMzaEnum(String value) {
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
    public static TipoMzaEnum fromValue(String value) {
      for (TipoMzaEnum b : TipoMzaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("tipo_mza")
  private TipoMzaEnum tipoMza;

  @JsonProperty("nro_mza")
  private String nroMza;

  /**
   * parte de la identificación catastral, los posibles valores son Lote y Parcela.
   */
  public enum TipoLoteEnum {
    LOTE("lote"),
    
    PARCELA("parcela");

    private String value;

    TipoLoteEnum(String value) {
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
    public static TipoLoteEnum fromValue(String value) {
      for (TipoLoteEnum b : TipoLoteEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("tipo_lote")
  private TipoLoteEnum tipoLote;

  @JsonProperty("nro_lote")
  private String nroLote;

  /**
   * parte de la identificación catastral
   */
  public enum SeccionEnum {
    A("A"),
    
    B("B"),
    
    C("C"),
    
    D("D"),
    
    E("E"),
    
    F("F"),
    
    G("G");

    private String value;

    SeccionEnum(String value) {
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
    public static SeccionEnum fromValue(String value) {
      for (SeccionEnum b : SeccionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("seccion")
  private SeccionEnum seccion;

  /**
   * parte de la identificación catastral
   */
  public enum CircunscripcionEnum {
    I("I"),
    
    II("II"),
    
    III("III"),
    
    IV("IV"),
    
    V("V"),
    
    VI("VI"),
    
    VII("VII");

    private String value;

    CircunscripcionEnum(String value) {
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
    public static CircunscripcionEnum fromValue(String value) {
      for (CircunscripcionEnum b : CircunscripcionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("circunscripcion")
  private CircunscripcionEnum circunscripcion;

  @JsonProperty("barrio")
  private String barrio;

  @JsonProperty("legajo_solicitud")
  private Integer legajoSolicitud;

  @JsonProperty("fecha_solicitud")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime fechaSolicitud;

  public Solicitud idSolicitud(Integer idSolicitud) {
    this.idSolicitud = idSolicitud;
    return this;
  }

  /**
   * identificador de solicitud.
   * @return idSolicitud
  */
  @ApiModelProperty(required = true, value = "identificador de solicitud.")
  @NotNull


  public Integer getIdSolicitud() {
    return idSolicitud;
  }

  public void setIdSolicitud(Integer idSolicitud) {
    this.idSolicitud = idSolicitud;
  }

  public Solicitud tipoMza(TipoMzaEnum tipoMza) {
    this.tipoMza = tipoMza;
    return this;
  }

  /**
   * parte de la identificación catastral, los posibles valores son manzana, fracción, quinta, chacra
   * @return tipoMza
  */
  @ApiModelProperty(required = true, value = "parte de la identificación catastral, los posibles valores son manzana, fracción, quinta, chacra")
  @NotNull


  public TipoMzaEnum getTipoMza() {
    return tipoMza;
  }

  public void setTipoMza(TipoMzaEnum tipoMza) {
    this.tipoMza = tipoMza;
  }

  public Solicitud nroMza(String nroMza) {
    this.nroMza = nroMza;
    return this;
  }

  /**
   * valor asociado al tipo_mza, ej '2431-1'
   * @return nroMza
  */
  @ApiModelProperty(required = true, value = "valor asociado al tipo_mza, ej '2431-1'")
  @NotNull


  public String getNroMza() {
    return nroMza;
  }

  public void setNroMza(String nroMza) {
    this.nroMza = nroMza;
  }

  public Solicitud tipoLote(TipoLoteEnum tipoLote) {
    this.tipoLote = tipoLote;
    return this;
  }

  /**
   * parte de la identificación catastral, los posibles valores son Lote y Parcela.
   * @return tipoLote
  */
  @ApiModelProperty(required = true, value = "parte de la identificación catastral, los posibles valores son Lote y Parcela.")
  @NotNull


  public TipoLoteEnum getTipoLote() {
    return tipoLote;
  }

  public void setTipoLote(TipoLoteEnum tipoLote) {
    this.tipoLote = tipoLote;
  }

  public Solicitud nroLote(String nroLote) {
    this.nroLote = nroLote;
    return this;
  }

  /**
   * valor asociado al tipo_lote, ej '31/A'
   * @return nroLote
  */
  @ApiModelProperty(required = true, value = "valor asociado al tipo_lote, ej '31/A'")
  @NotNull


  public String getNroLote() {
    return nroLote;
  }

  public void setNroLote(String nroLote) {
    this.nroLote = nroLote;
  }

  public Solicitud seccion(SeccionEnum seccion) {
    this.seccion = seccion;
    return this;
  }

  /**
   * parte de la identificación catastral
   * @return seccion
  */
  @ApiModelProperty(required = true, value = "parte de la identificación catastral")
  @NotNull


  public SeccionEnum getSeccion() {
    return seccion;
  }

  public void setSeccion(SeccionEnum seccion) {
    this.seccion = seccion;
  }

  public Solicitud circunscripcion(CircunscripcionEnum circunscripcion) {
    this.circunscripcion = circunscripcion;
    return this;
  }

  /**
   * parte de la identificación catastral
   * @return circunscripcion
  */
  @ApiModelProperty(required = true, value = "parte de la identificación catastral")
  @NotNull


  public CircunscripcionEnum getCircunscripcion() {
    return circunscripcion;
  }

  public void setCircunscripcion(CircunscripcionEnum circunscripcion) {
    this.circunscripcion = circunscripcion;
  }

  public Solicitud barrio(String barrio) {
    this.barrio = barrio;
    return this;
  }

  /**
   * Barrio donde está ubicado el inmueble
   * @return barrio
  */
  @ApiModelProperty(required = true, value = "Barrio donde está ubicado el inmueble")
  @NotNull


  public String getBarrio() {
    return barrio;
  }

  public void setBarrio(String barrio) {
    this.barrio = barrio;
  }

  public Solicitud legajoSolicitud(Integer legajoSolicitud) {
    this.legajoSolicitud = legajoSolicitud;
    return this;
  }

  /**
   * Legajo del agente de atención al público que realiza la solicitud
   * @return legajoSolicitud
  */
  @ApiModelProperty(required = true, value = "Legajo del agente de atención al público que realiza la solicitud")
  @NotNull


  public Integer getLegajoSolicitud() {
    return legajoSolicitud;
  }

  public void setLegajoSolicitud(Integer legajoSolicitud) {
    this.legajoSolicitud = legajoSolicitud;
  }

  public Solicitud fechaSolicitud(OffsetDateTime fechaSolicitud) {
    this.fechaSolicitud = fechaSolicitud;
    return this;
  }

  /**
   * fecha y hora en la que se realiza la solicitud.
   * @return fechaSolicitud
  */
  @ApiModelProperty(required = true, value = "fecha y hora en la que se realiza la solicitud.")
  @NotNull

  @Valid

  public OffsetDateTime getFechaSolicitud() {
    return fechaSolicitud;
  }

  public void setFechaSolicitud(OffsetDateTime fechaSolicitud) {
    this.fechaSolicitud = fechaSolicitud;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Solicitud solicitud = (Solicitud) o;
    return Objects.equals(this.idSolicitud, solicitud.idSolicitud) &&
        Objects.equals(this.tipoMza, solicitud.tipoMza) &&
        Objects.equals(this.nroMza, solicitud.nroMza) &&
        Objects.equals(this.tipoLote, solicitud.tipoLote) &&
        Objects.equals(this.nroLote, solicitud.nroLote) &&
        Objects.equals(this.seccion, solicitud.seccion) &&
        Objects.equals(this.circunscripcion, solicitud.circunscripcion) &&
        Objects.equals(this.barrio, solicitud.barrio) &&
        Objects.equals(this.legajoSolicitud, solicitud.legajoSolicitud) &&
        Objects.equals(this.fechaSolicitud, solicitud.fechaSolicitud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idSolicitud, tipoMza, nroMza, tipoLote, nroLote, seccion, circunscripcion, barrio, legajoSolicitud, fechaSolicitud);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Solicitud {\n");
    
    sb.append("    idSolicitud: ").append(toIndentedString(idSolicitud)).append("\n");
    sb.append("    tipoMza: ").append(toIndentedString(tipoMza)).append("\n");
    sb.append("    nroMza: ").append(toIndentedString(nroMza)).append("\n");
    sb.append("    tipoLote: ").append(toIndentedString(tipoLote)).append("\n");
    sb.append("    nroLote: ").append(toIndentedString(nroLote)).append("\n");
    sb.append("    seccion: ").append(toIndentedString(seccion)).append("\n");
    sb.append("    circunscripcion: ").append(toIndentedString(circunscripcion)).append("\n");
    sb.append("    barrio: ").append(toIndentedString(barrio)).append("\n");
    sb.append("    legajoSolicitud: ").append(toIndentedString(legajoSolicitud)).append("\n");
    sb.append("    fechaSolicitud: ").append(toIndentedString(fechaSolicitud)).append("\n");
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

