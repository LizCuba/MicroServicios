package com.example.lizcubaproyectof.repository;

import com.example.lizcubaproyectof.model.Hospedaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospedajeRepository extends JpaRepository<Hospedaje, Integer> {
}
