package com.example.openapi.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.openapi.model.Inmueble;
import com.example.openapi.model.Solicitud;
import com.example.openapi.model.SolicitudCompleta;

@Service
public class InmuebleService {
	@Autowired
	private InmuebleRepository inmuebleRepository;

//	public ResponseEntity<Solicitud> solicitudIdGet(Integer id) {
//		return ResponseEntity.ok().body(solicitudRepository.findById(Integer.valueOf(id)).get());
//	}

	
	/**
	 * POST de solicitudes, para guardar una solicitud
	 * 
	 * @param id: identificador de la solicitud
	 * @param inmuebles: listado de inmuebles
	 * @return
	 */
	public ResponseEntity<Void> inmueblePost(Integer id, @Valid List<Inmueble> inmuebles) {
		for (Inmueble inmueble : inmuebles) {
			inmueble.setIdSolicitud(id);
			inmuebleRepository.save(inmueble);
		}
		//SolicitudCompleta sol_completa = new SolicitudCompleta();
		return ResponseEntity.ok().build();
		//return ResponseEntity.ok().body(sol_completa);
	}

}
