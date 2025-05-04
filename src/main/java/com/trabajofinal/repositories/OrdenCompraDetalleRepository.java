package com.trabajofinal.repositories;

import com.trabajofinal.entities.OrdenCompraDetalle;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface OrdenCompraDetalleRepository extends BaseRepository<OrdenCompraDetalle, UUID>{
    List<OrdenCompraDetalle> findAllByOrdenCompraId(UUID idOrdenCompra);
    List<OrdenCompraDetalle> findAllByProductoId(UUID idProducto);
}
