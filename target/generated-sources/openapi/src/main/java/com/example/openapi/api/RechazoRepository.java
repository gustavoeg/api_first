package com.example.openapi.api;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.openapi.model.Rechazo;

public interface RechazoRepository extends JpaRepository<Rechazo, Integer> {

}
