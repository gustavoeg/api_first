package com.example.openapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.openapi.model.Asignacion;

@Service
public class AsignacionService {
	
	@Autowired
	private AsignacionRepository asignacionRepository;
	
	public Asignacion asignacionGet(Integer id_inmueble){
		//ResponseEntity.ok().body(asignacionRepository.findById(id_inmueble).get());
		return asignacionRepository.findById(id_inmueble).get();
	}

}
