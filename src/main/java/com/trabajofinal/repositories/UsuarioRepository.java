package com.trabajofinal.repositories;

import com.trabajofinal.entities.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, UUID>{
    List<Usuario> findAllByDireccionId (UUID idDireccion);
}
