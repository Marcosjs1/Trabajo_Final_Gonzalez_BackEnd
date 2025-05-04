package com.trabajofinal.controllers;

import com.trabajofinal.entities.Direccion;
import com.trabajofinal.entities.Usuario;
import com.trabajofinal.services.BaseService;
import com.trabajofinal.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends BaseController<Usuario, UUID> {
    public UsuarioController(UsuarioService usuarioService) {
        super(usuarioService);
    }
    @Autowired
    private UsuarioService usuarioService;
    @PostMapping("/direcciones/{idUsuario}")
    public Optional<Usuario> agregarDireccion (@RequestBody List<Direccion> direcciones, @PathVariable UUID idUsuario) throws Exception {
        Usuario usuario = usuarioService.agregarDirecciones(idUsuario, direcciones);
        return Optional.ofNullable(usuario);
    }
    @GetMapping ("/direcciones/{id}")
    public ResponseEntity<List<Usuario>> listarPorDireccion (@PathVariable UUID id) throws Exception{
        List<Usuario> listaUsuarios = usuarioService.listarPorDireccion(id);
        return ResponseEntity.ok(listaUsuarios);
    }
}
