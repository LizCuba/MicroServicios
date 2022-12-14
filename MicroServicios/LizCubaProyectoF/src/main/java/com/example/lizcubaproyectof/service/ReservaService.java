package com.example.lizcubaproyectof.service;

import com.example.lizcubaproyectof.dto.ReservaDTO;

import java.util.List;

public interface ReservaService {

    List<ReservaDTO>listar();
    ReservaDTO obtenerId(Integer id);
    void guardar(ReservaDTO reserva);
    void eliminar(Integer id);
    void actualizar(ReservaDTO reserva);
}
