package com.example.openapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.openapi.model.Respuesta;

@Service
public class RespuestaService {
	
	@Autowired
	private RespuestaRepository respuestaRepository;
	
//	public ResponseEntity<Respuesta> respuestaGet(Integer id_solicitud){
//		return ResponseEntity.ok().body(respuestaRepository.findById(id_solicitud).get());
//	}
	
	public Respuesta respuestaGet(Integer id_solicitud){
		return respuestaRepository.findById(id_solicitud).get();
	}

}
