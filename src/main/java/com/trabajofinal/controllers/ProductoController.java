package com.trabajofinal.controllers;

import com.trabajofinal.entities.Producto;
import com.trabajofinal.services.BaseService;
import com.trabajofinal.services.ProductoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/productos")
public class ProductoController extends BaseController<Producto, UUID> {
    public ProductoController(ProductoService productoService) {
        super(productoService);
    }
}
