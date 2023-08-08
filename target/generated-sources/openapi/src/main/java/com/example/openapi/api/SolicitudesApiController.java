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
		return solicitudService.solicitudesIdGet(id);
	}


	/**
	 * GET de una solicitud por id
	 */
	@Override
	public ResponseEntity<SolicitudCompleta> solicitudesIdGet(Integer id) {
		//return SolicitudesApi.super.solicitudesIdGet(id);
		return solicitudService.solicitudesIdGet(id);
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
