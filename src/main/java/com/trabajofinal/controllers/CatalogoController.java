package com.trabajofinal.controllers;

import com.trabajofinal.entities.Catalogo;
import com.trabajofinal.repositories.CatalogoRepository;
import com.trabajofinal.services.BaseService;
import com.trabajofinal.services.CatalogoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
@RequestMapping("/catalogos")
public class CatalogoController extends BaseController<Catalogo, UUID>{
    public CatalogoController(CatalogoService catalogoService) {
        super(catalogoService);
    }
}
