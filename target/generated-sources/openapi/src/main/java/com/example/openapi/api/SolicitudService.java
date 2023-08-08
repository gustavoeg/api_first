package com.example.openapi.api;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.openapi.model.Asignacion;
import com.example.openapi.model.InlineResponse200;
import com.example.openapi.model.Inmueble;
import com.example.openapi.model.Rechazo;
import com.example.openapi.model.Respuesta;
import com.example.openapi.model.Solicitud;
import com.example.openapi.model.SolicitudCompleta;

@Service
public class SolicitudService {
	@Autowired
	private SolicitudRepository solicitudRepository;
	
	@Autowired
	private InmuebleRepository inmuebleRepository;
	
	@Autowired
	private RespuestaRepository respuestaRepository;
	
	@Autowired
	private RechazoRepository rechazoRepository;	
	
	@Autowired
	private AsignacionRepository asignacionRepository;

//	public ResponseEntity<Solicitud> solicitudIdGet(Integer id) {
//		return ResponseEntity.ok().body(solicitudRepository.findById(Integer.valueOf(id)).get());
//	}

	//POST de solicitudes, para guardar una solicitud
	public ResponseEntity<Solicitud> solicitudesPost(Solicitud solicitud) {
//		solicitudRepository.save(solicitud);
		return ResponseEntity.ok().body(solicitudRepository.save(solicitud));
//		return ResponseEntity.ok().build();
	}
	
	/**
	 * GET de una solicitud
	 * @param id
	 * @return
	 */
	public ResponseEntity<SolicitudCompleta> solicitudesIdGet(Integer id) {
		// TODO Auto-generated method stub
		//obtencion de la solicitud
		Solicitud solicitud = solicitudRepository.findById(id).get();
		List<Inmueble> inmuebles = inmuebleRepository.findByIdSolicitud(solicitud.getIdSolicitud().intValue());
		//verifico que la respuesta no sea nula
		Respuesta respuesta;
		Optional<Respuesta> respuestaOptional = respuestaRepository.findById(solicitud.getIdSolicitud());
		List<Asignacion> listado_asignacion = null;
		Rechazo rechazo = null;
		if (respuestaOptional.isPresent()) {
			respuesta =  respuestaOptional.get();
		    // processing with foo ...
			//consulto si la respuesta fue aceptada o rechazada
			if(respuesta.getRespuesta() == Respuesta.RespuestaEnum.fromValue("A")) {
				//consulto por las asignaciones
				Asignacion asignacion;
				listado_asignacion = new ArrayList<Asignacion>();
				for (Inmueble inmueble : inmuebles) {
					listado_asignacion.add(asignacionRepository.findById(inmueble.getIdInmueble()).get()) ;
				}
			}else {
				//se trata de un rechazo
				rechazo = rechazoRepository.findById(solicitud.getIdSolicitud()).get();
				listado_asignacion = null;
			}
			System.out.print("respuyesta:" + respuesta.getRespuesta());
		} else {
		    // alternative processing....
			respuesta = null;
		}
		
		//verifico que el rechazo no sea nulo
		//Rechazo rechazo = rechazoRepository.findById(solicitud.getIdSolicitud()).get();
		SolicitudCompleta sol_completa = new SolicitudCompleta();
		sol_completa.solicitud(solicitud);
		sol_completa.setInmuebles(inmuebles);
		sol_completa.setRespuesta(respuesta);
		sol_completa.setRechazo(rechazo);
		//sol_completa.setRechazo(null);
		sol_completa.setAsignaciones(listado_asignacion);
		//return SolicitudesApi.super.solicitudesIdGet(id);
		return ResponseEntity.ok().body(sol_completa);
	}

	/**
	 * GET de Nuevas solicitudes
	 */
	public ResponseEntity<InlineResponse200> solicitudesNuevasGet(){
		BigDecimal numNuevas = BigDecimal.valueOf(solicitudRepository.getNumNuevas());
		InlineResponse200 respuesta = new InlineResponse200();
		respuesta.setNumSolicitudesNuevas(numNuevas);
		return ResponseEntity.ok().body(respuesta);
	}
}
