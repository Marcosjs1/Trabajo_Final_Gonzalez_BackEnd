package com.trabajofinal.controllers;

import com.trabajofinal.entities.OrdenCompraDetalle;
import com.trabajofinal.services.OrdenCompraDetalleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RestController
@RequestMapping("/ordenComprasDetalles")
public class OrdenCompraDetalleController extends BaseController<OrdenCompraDetalle, UUID>{
    public OrdenCompraDetalleController(OrdenCompraDetalleService ordenCompraDetalleService) {
        super(ordenCompraDetalleService);
    }
}
