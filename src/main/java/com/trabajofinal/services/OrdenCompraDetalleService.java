package com.trabajofinal.services;

import com.trabajofinal.entities.OrdenCompraDetalle;
import com.trabajofinal.repositories.BaseRepository;
import com.trabajofinal.repositories.OrdenCompraDetalleRepository;

import java.util.UUID;

public class OrdenCompraDetalleService extends BaseService<OrdenCompraDetalle, UUID>{
    public OrdenCompraDetalleService(OrdenCompraDetalleRepository ordenCompraDetalleRepository) {
        super(ordenCompraDetalleRepository);
    }
}
