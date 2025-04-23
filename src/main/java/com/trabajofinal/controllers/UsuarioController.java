package com.trabajofinal.controllers;

import com.trabajofinal.entities.Usuario;
import com.trabajofinal.services.BaseService;
import com.trabajofinal.services.UsuarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends BaseController<Usuario, UUID> {
    public UsuarioController(UsuarioService usuarioService) {
        super(usuarioService);
    }
}
