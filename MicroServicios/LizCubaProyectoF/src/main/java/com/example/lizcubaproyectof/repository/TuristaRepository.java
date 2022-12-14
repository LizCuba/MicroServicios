package com.example.lizcubaproyectof.repository;

import com.example.lizcubaproyectof.model.Turista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer> {
}
