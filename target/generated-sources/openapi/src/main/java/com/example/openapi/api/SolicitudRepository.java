package com.example.openapi.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.openapi.model.Solicitud;

public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {

	@Query("SELECT COUNT(s.idSolicitud) AS cantidad FROM Solicitud s LEFT JOIN Respuesta r ON s.idSolicitud = r.idSolicitud WHERE r.respuesta IS null")
	Long getNumNuevas();
}
