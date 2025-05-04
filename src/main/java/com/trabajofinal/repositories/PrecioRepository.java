package com.trabajofinal.repositories;

import com.trabajofinal.entities.Precio;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface PrecioRepository extends BaseRepository<Precio, UUID>{
    List<Precio> findAllByDetalleProductoId (UUID idDetalleProducto);
    List<Precio> findAllByDescuentoId (UUID idDescuento);
}
