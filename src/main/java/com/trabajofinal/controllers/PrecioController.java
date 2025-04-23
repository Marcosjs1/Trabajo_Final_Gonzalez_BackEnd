package com.trabajofinal.controllers;

import com.trabajofinal.entities.Precio;
import com.trabajofinal.services.BaseService;
import com.trabajofinal.services.PrecioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
@RequestMapping("/precios")
public class PrecioController extends BaseController<Precio, UUID>{
    public PrecioController(PrecioService precioService) {
        super(precioService);
    }
}
