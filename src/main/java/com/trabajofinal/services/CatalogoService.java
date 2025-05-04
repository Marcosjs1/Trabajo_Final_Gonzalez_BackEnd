package com.trabajofinal.services;

import com.trabajofinal.entities.Catalogo;

import com.trabajofinal.repositories.CatalogoRepository;
import org.springframework.stereotype.Service;


import java.util.UUID;
@Service
public class CatalogoService extends BaseService<Catalogo, UUID>{
    public CatalogoService(CatalogoRepository catalogoRepository) {
        super(catalogoRepository);
    }
}
