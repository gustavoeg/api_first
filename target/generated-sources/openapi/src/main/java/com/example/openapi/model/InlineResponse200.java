package com.example.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-18T18:46:39.162798100-03:00[America/Buenos_Aires]")
public class InlineResponse200   {
  @JsonProperty("num_solicitudes_nuevas")
  private BigDecimal numSolicitudesNuevas;

  public InlineResponse200 numSolicitudesNuevas(BigDecimal numSolicitudesNuevas) {
    this.numSolicitudesNuevas = numSolicitudesNuevas;
    return this;
  }

  /**
   * cantidad de solicitudes nuevas (sin atender)
   * minimum: 0
   * @return numSolicitudesNuevas
  */
  @ApiModelProperty(example = "5", value = "cantidad de solicitudes nuevas (sin atender)")

  @Valid
@DecimalMin("0")
  public BigDecimal getNumSolicitudesNuevas() {
    return numSolicitudesNuevas;
  }

  public void setNumSolicitudesNuevas(BigDecimal numSolicitudesNuevas) {
    this.numSolicitudesNuevas = numSolicitudesNuevas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.numSolicitudesNuevas, inlineResponse200.numSolicitudesNuevas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numSolicitudesNuevas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    numSolicitudesNuevas: ").append(toIndentedString(numSolicitudesNuevas)).append("\n");
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

