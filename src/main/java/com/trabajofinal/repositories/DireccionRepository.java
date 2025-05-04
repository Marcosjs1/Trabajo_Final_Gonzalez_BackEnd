package com.trabajofinal.repositories;

import com.trabajofinal.entities.Direccion;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface DireccionRepository extends BaseRepository<Direccion, UUID>{
    List<Direccion> findAllByUsuarioId (UUID idUsuario);
}
