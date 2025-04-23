package com.trabajofinal.services;

import com.trabajofinal.entities.Precio;
import com.trabajofinal.repositories.BaseRepository;
import com.trabajofinal.repositories.PrecioRepository;

import java.util.UUID;

public class PrecioService extends BaseService<Precio, UUID>{
    public PrecioService(PrecioRepository precioRepository) {
        super(precioRepository);
    }
}
