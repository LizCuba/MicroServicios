package com.example.lizcubaproyectof.service;

import com.example.lizcubaproyectof.dto.TuristaDTO;

import java.util.List;

public interface TuristaService {

    List<TuristaDTO>listar();
    TuristaDTO obtenerId(Integer id);
    void guardar(TuristaDTO turista);
    void eliminar(Integer id);
    void actualizar(TuristaDTO turista);
}
