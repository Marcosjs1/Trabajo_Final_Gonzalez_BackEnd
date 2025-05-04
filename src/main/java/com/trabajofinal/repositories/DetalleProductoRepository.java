package com.trabajofinal.repositories;

import com.trabajofinal.entities.DetalleProducto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface DetalleProductoRepository extends BaseRepository<DetalleProducto, UUID>{
    List<DetalleProducto> findAllByTalleId(UUID idTalle);
    List<DetalleProducto> findAllByProductoId(UUID idProducto);
}
