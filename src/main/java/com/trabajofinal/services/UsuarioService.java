package com.trabajofinal.services;

import com.trabajofinal.entities.Usuario;
import com.trabajofinal.repositories.BaseRepository;
import com.trabajofinal.repositories.UsuarioRepository;

import java.util.UUID;

public class UsuarioService extends BaseService<Usuario, UUID>{
    public UsuarioService(UsuarioRepository usuarioRepository) {
        super(usuarioRepository);
    }
}
