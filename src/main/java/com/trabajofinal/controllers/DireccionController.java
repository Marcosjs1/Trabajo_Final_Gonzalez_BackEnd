package com.trabajofinal.controllers;

import com.trabajofinal.entities.Direccion;
import com.trabajofinal.services.BaseService;
import com.trabajofinal.services.DireccionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
@RequestMapping("/direcciones")
public class DireccionController extends BaseController<Direccion, UUID>{
    public DireccionController(DireccionService direccionService) {
        super(direccionService);
    }
}
