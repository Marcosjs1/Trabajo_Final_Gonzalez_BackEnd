package com.trabajofinal.services;

import com.trabajofinal.entities.Catalogo;

import com.trabajofinal.repositories.CatalogoRepository;


import java.util.UUID;

public class CatalogoService extends BaseService<Catalogo, UUID>{
    public CatalogoService(CatalogoRepository catalogoRepository) {
        super(catalogoRepository);
    }
}
