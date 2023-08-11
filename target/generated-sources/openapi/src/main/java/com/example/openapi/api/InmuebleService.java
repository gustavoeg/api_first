package com.example.openapi.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.openapi.model.Inmueble;

@Service
public class InmuebleService {
	@Autowired
	private InmuebleRepository inmuebleRepository;

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
		return ResponseEntity.ok().build();
	}

}
