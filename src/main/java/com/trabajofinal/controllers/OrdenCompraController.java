package com.trabajofinal.controllers;

import com.trabajofinal.entities.Direccion;
import com.trabajofinal.entities.OrdenCompra;
import com.trabajofinal.entities.Usuario;
import com.trabajofinal.services.BaseService;
import com.trabajofinal.services.OrdenCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@RestController
@RequestMapping("/ordenesDeCompra")
public class OrdenCompraController extends BaseController<OrdenCompra, UUID>{
    public OrdenCompraController(OrdenCompraService ordenCompraService) {
        super(ordenCompraService);
    }
    @Autowired
    private OrdenCompraService ordenCompraService;
    @PostMapping("/usuarios/{idOrdenCompra}")
    public Optional<OrdenCompra> agregarUsuario(@RequestBody Usuario usuario, @PathVariable UUID idOrdenCompra) throws Exception{
        OrdenCompra ordenCompra = ordenCompraService.agregarUsuario(idOrdenCompra,usuario);
        return Optional.ofNullable(ordenCompra);
    }
    @PostMapping("/direcciones/{idOrdenCompra}")
    public Optional<OrdenCompra> agregarDireccion(@RequestBody Direccion direccion, @PathVariable UUID idOrdenCompra) throws Exception{
        OrdenCompra ordenCompra = ordenCompraService.agregarDireccion(idOrdenCompra, direccion);
        return Optional.ofNullable(ordenCompra);
    }
    @GetMapping("/usuarios/{id}")
    public ResponseEntity<List<OrdenCompra>> listarPorUsuario (@PathVariable UUID id ) throws Exception{
        List<OrdenCompra> listaOrdenCompra = ordenCompraService.listarPorUsuario(id);
        return ResponseEntity.ok(listaOrdenCompra);
    }
    @GetMapping("/direcciones/{id}")
    public ResponseEntity<List<OrdenCompra>> listarPorDireccion (@PathVariable UUID id) throws Exception{
        List<OrdenCompra> listaOrdenCompra = ordenCompraService.listarPorDireccion(id);
        return ResponseEntity.ok((listaOrdenCompra));
    }

}
