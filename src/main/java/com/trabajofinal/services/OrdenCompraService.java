package com.trabajofinal.services;

import com.trabajofinal.entities.OrdenCompra;
import com.trabajofinal.repositories.BaseRepository;
import com.trabajofinal.repositories.OrdenCompraRepository;

import java.util.UUID;

public class OrdenCompraService extends BaseService<OrdenCompra, UUID>{
    public OrdenCompraService(OrdenCompraRepository ordenCompraRepository) {
        super(ordenCompraRepository);
    }
}
