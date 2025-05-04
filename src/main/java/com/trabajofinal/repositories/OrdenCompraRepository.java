package com.trabajofinal.repositories;

import com.trabajofinal.entities.OrdenCompra;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface OrdenCompraRepository extends BaseRepository<OrdenCompra, UUID>{
    List<OrdenCompra> findAllByUsuarioId(UUID idUsuario);
    List<OrdenCompra> findAllByDireccionId(UUID idDireccion);
}
