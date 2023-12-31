/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.openapi.api;

import com.example.openapi.model.ResponderAsignar;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-18T18:46:39.162798100-03:00[America/Buenos_Aires]")
@Validated
@Api(value = "asignar", description = "the asignar API")
public interface AsignarApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /asignar : Asignación de Rutas y Folios
     * Asigna las rutas y folios de los servicios requeridos en la solicitud
     *
     * @param responderAsignar  (required)
     * @return Petición satisfactoria y como resultado se asignó las rutas y folios a los servicios de la nueva solicitud. (status code 201)
     */
    @ApiOperation(value = "Asignación de Rutas y Folios", nickname = "asignarPost", notes = "Asigna las rutas y folios de los servicios requeridos en la solicitud", tags={ "Asignación", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Petición satisfactoria y como resultado se asignó las rutas y folios a los servicios de la nueva solicitud.") })
    @PostMapping(
        value = "/asignar",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> asignarPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ResponderAsignar responderAsignar) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
