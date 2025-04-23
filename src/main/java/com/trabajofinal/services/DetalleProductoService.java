package com.trabajofinal.services;

import com.trabajofinal.entities.DetalleProducto;
import com.trabajofinal.repositories.BaseRepository;
import com.trabajofinal.repositories.DescuentoRepository;
import com.trabajofinal.repositories.DetalleProductorRepository;

import java.util.UUID;

public class DetalleProductoService extends BaseService<DetalleProducto, UUID>{
    public DetalleProductoService(DetalleProductorRepository detalleProductorRepository) {
        super(detalleProductorRepository);
    }
}
