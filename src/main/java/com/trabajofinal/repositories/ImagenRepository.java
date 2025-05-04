package com.trabajofinal.repositories;

import com.trabajofinal.entities.Imagen;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface ImagenRepository extends BaseRepository<Imagen, UUID>{

    List<Imagen> findAllByDetalleProductoId(UUID idDetalleProducto);
}
