package com.trabajofinal.controllers;

import com.trabajofinal.entities.Descuento;
import com.trabajofinal.services.BaseService;
import com.trabajofinal.services.DescuentoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/descuentos")
public class DescuentoController extends BaseController<Descuento, UUID>{
    public DescuentoController(DescuentoService descuentoService) {
        super(descuentoService);
    }
}
