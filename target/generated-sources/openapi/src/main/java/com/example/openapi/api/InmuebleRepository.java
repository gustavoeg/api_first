package com.example.openapi.api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.openapi.model.Inmueble;

public interface InmuebleRepository extends JpaRepository<Inmueble, Integer> {
	
	@Query("SELECT i FROM Inmueble i WHERE i.idSolicitud = ?1")
	List<Inmueble> findByIdSolicitud(int idSolicitud);

}
