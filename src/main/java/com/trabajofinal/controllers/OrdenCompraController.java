package com.trabajofinal.controllers;

import com.trabajofinal.entities.OrdenCompra;
import com.trabajofinal.services.BaseService;
import com.trabajofinal.services.OrdenCompraService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
@RequestMapping("/ordenesDeCompra")
public class OrdenCompraController extends BaseController<OrdenCompra, UUID>{
    public OrdenCompraController(OrdenCompraService ordenCompraService) {
        super(ordenCompraService);
    }
}
