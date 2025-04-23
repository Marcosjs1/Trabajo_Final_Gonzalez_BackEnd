package com.trabajofinal.services;

import com.trabajofinal.entities.Direccion;
import com.trabajofinal.repositories.BaseRepository;
import com.trabajofinal.repositories.DireccionRepository;

import java.util.UUID;

public class DireccionService extends BaseService<Direccion, UUID>{
    public DireccionService(DireccionRepository direccionRepository) {
        super(direccionRepository);
    }
}
