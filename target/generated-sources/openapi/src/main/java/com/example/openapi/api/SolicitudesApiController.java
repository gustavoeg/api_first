package com.example.openapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.example.openapi.model.InlineResponse200;
import com.example.openapi.model.Inmueble;
import com.example.openapi.model.Solicitud;
import com.example.openapi.model.SolicitudCompleta;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@RestController
@CrossOrigin(origins = "*")
public class SolicitudesApiController implements SolicitudesApi {
	@Autowired
	private SolicitudService solicitudService;
	
	@Autowired
	private InmuebleService inmuebleService;
	

	/**
	 * POST Solicitudes
	 */
    @Override
	public ResponseEntity<Solicitud> solicitudesPost(@Valid Solicitud solicitud) {
    	return solicitudService.solicitudesPost(solicitud);
		//return SolicitudesApi.super.solicitudesPost(solicitud);
	}
    
    
	/**
	 * GET Solicitudes Nuevas
	 */
    @Override
	public ResponseEntity<InlineResponse200> solicitudesNuevasGet() {
		// TODO Auto-generated method stub
    	return solicitudService.solicitudesNuevasGet();
		//return SolicitudesApi.super.solicitudesNuevasGet();
	}



	/**
     * POST de inmuebles para una solicitud
     */
	@Override
	public ResponseEntity<SolicitudCompleta> solicitudesIdInmueblesPost(Integer id, @Valid List<Inmueble> inmueble) {
		// TODO Auto-generated method stub
		//return SolicitudesApi.super.solicitudesIdInmueblesPost(id, inmueble);
		inmuebleService.inmueblePost(id,inmueble);
		return ResponseEntity.ok().body(solicitudService.solicitudesIdGet(id));
	}


	/**
	 * GET de una solicitud por id
	 */
	@Override
	public ResponseEntity<SolicitudCompleta> solicitudesIdGet(Integer id) {
		//return SolicitudesApi.super.solicitudesIdGet(id);
		return ResponseEntity.ok().body(solicitudService.solicitudesIdGet(id));
	}



	/**
	 * GET de las solicitudes rechazadas
	 */
	@Override
	public ResponseEntity<List<SolicitudCompleta>> solicitudesRechazadasGet(@Valid Integer legajoSolicitante) {
		// TODO Auto-generated method stub
		return solicitudService.solicitudesRechazadasGet(legajoSolicitante);
	}


	/**
	 * GET solicitud por legajo solicitante y/o respondida por un determinado agente (identificados por legajo)
	 */
	@Override
	public ResponseEntity<List<SolicitudCompleta>> solicitudesGet(@NotNull @Valid Integer legajoSolicitante,
			@Valid Integer legajoRespuesta) {
		// TODO Auto-generated method stub
		return solicitudService.solicitudesGet(legajoSolicitante, legajoRespuesta);
	}



	private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SolicitudesApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
