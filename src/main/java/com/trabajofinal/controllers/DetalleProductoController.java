package com.trabajofinal.controllers;

import com.trabajofinal.entities.DetalleProducto;
import com.trabajofinal.services.BaseService;
import com.trabajofinal.services.DetalleProductoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/detallesProductos")
public class DetalleProductoController extends BaseController<DetalleProducto, UUID> {
    public DetalleProductoController(DetalleProductoService detalleProductoService) {
        super(detalleProductoService);
    }
}
