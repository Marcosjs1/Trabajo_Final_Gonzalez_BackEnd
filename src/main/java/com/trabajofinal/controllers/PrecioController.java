package com.trabajofinal.controllers;

import com.trabajofinal.entities.Descuento;
import com.trabajofinal.entities.DetalleProducto;
import com.trabajofinal.entities.Precio;
import com.trabajofinal.services.BaseService;
import com.trabajofinal.services.PrecioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@RestController
@RequestMapping("/precios")
public class PrecioController extends BaseController<Precio, UUID>{
    public PrecioController(PrecioService precioService) {
        super(precioService);
    }
    @Autowired
    private PrecioService precioService;
    @PostMapping("/detallesProductos/{idPrecio}")
    public Optional<Precio> agregarDetalleProducto (@RequestBody DetalleProducto detalleProducto, @PathVariable UUID idPrecio) throws Exception {
        Precio precio = precioService.agregarDetalleProducto(idPrecio, detalleProducto);
        return Optional.ofNullable(precio);
    }
    @PostMapping("/descuentos/{idPrecio}")
    public Optional<Precio> agregarDescuento (@RequestBody Descuento descuento, @PathVariable UUID idPrecio) throws Exception {
        Precio precio = precioService.agregarDescuento(idPrecio,descuento);
        return Optional.ofNullable(precio);
    }
    @GetMapping("/detallesProductos/{id}")
    public ResponseEntity<List<Precio>> listarPorDetalleProductos(@PathVariable UUID id) throws Exception{
        List<Precio> listaDetallesProductos = precioService.listarPorDetalleProducto(id);
        return ResponseEntity.ok(listaDetallesProductos);
    }
    @GetMapping("/descuentos/{id}")
    public ResponseEntity<List<Precio>> listarPorDescuento(@PathVariable UUID id) throws Exception{
        List<Precio> listaDescuentos = precioService.listarPorDescuento(id);
        return ResponseEntity.ok(listaDescuentos);
    }
}
