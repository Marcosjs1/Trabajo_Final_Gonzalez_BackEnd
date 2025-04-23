package com.trabajofinal.services;

import com.trabajofinal.entities.Descuento;
import com.trabajofinal.repositories.DescuentoRepository;

import java.util.UUID;

public class DescuentoService extends BaseService<Descuento, UUID>{
    public DescuentoService(DescuentoRepository descuentoRepository){
        super(descuentoRepository);
    }
}
