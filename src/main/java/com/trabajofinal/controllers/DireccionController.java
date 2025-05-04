package com.trabajofinal.controllers;

import com.trabajofinal.entities.Direccion;
import com.trabajofinal.entities.Usuario;
import com.trabajofinal.services.BaseService;
import com.trabajofinal.services.DireccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@RestController
@RequestMapping("/direcciones")
public class DireccionController extends BaseController<Direccion, UUID>{
    public DireccionController(DireccionService direccionService) {
        super(direccionService);
    }
    @Autowired
    public DireccionService direccionService;
    @PostMapping ("/usuarios/{idDireccion}")
    public Optional<Direccion> agregarUsuarios(@RequestBody List<Usuario> usuarios, @PathVariable UUID idDireccion) throws Exception{
        Direccion direccion = direccionService.agregarUsuarios(idDireccion, usuarios);
        return Optional.ofNullable(direccion);
    }
    @GetMapping("/usuarios/{id}")
    public ResponseEntity<List<Direccion>> listarPorUsuario(@PathVariable UUID id) throws Exception{
        List<Direccion> listaDirecciones = direccionService.listarPorUsuario(id);
        return ResponseEntity.ok(listaDirecciones);
    }
}
