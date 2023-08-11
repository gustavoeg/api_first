package com.example.openapi.api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.openapi.model.Inmueble;
import com.example.openapi.model.Solicitud;

public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {

	@Query("SELECT s FROM Solicitud s LEFT JOIN Respuesta r ON r.idSolicitud= s.idSolicitud WHERE s.legajoSolicitud = ?1")
	List<Solicitud> findByLegajoSolicitud(int legajo_solicitante);
	
	@Query("SELECT s FROM Solicitud s LEFT JOIN Respuesta r ON r.idSolicitud= s.idSolicitud WHERE s.legajoSolicitud = ?1 AND r.legajoRespuesta = ?2")
	List<Solicitud> findByLegajoRespuesta(int legajo_solicitante, int legajo_respuesta);
	
	@Query("SELECT COUNT(s.idSolicitud) AS cantidad FROM Solicitud s LEFT JOIN Respuesta r ON s.idSolicitud = r.idSolicitud WHERE r.respuesta IS null")
	Long getNumNuevas();
	
	@Query("SELECT s FROM Solicitud s LEFT JOIN Respuesta r ON r.idSolicitud = s.idSolicitud WHERE r.respuesta = 1")
	List<Solicitud> getSolicitudesRechazadas();
	
	@Query("SELECT s FROM Solicitud s LEFT JOIN Respuesta r ON r.idSolicitud = s.idSolicitud WHERE r.respuesta = 1 AND s.legajoSolicitud = ?1")
	List<Solicitud> getSolicitudesRechazadasByLegajo(int legajo_solicitante);

}
