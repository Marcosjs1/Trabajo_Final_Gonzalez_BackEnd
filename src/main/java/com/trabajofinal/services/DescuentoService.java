package com.trabajofinal.services;

import com.trabajofinal.entities.Descuento;
import com.trabajofinal.repositories.DescuentoRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class DescuentoService extends BaseService<Descuento, UUID>{
    public DescuentoService(DescuentoRepository descuentoRepository){
        super(descuentoRepository);
    }
}
