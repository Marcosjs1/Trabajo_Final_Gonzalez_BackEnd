package com.trabajofinal.services;

import com.trabajofinal.entities.Producto;
import com.trabajofinal.repositories.BaseRepository;
import com.trabajofinal.repositories.ProductoRepository;

import java.util.UUID;

public class ProductoService extends BaseService<Producto, UUID>{
    public ProductoService(ProductoRepository productoRepository) {
        super(productoRepository);
    }
}
