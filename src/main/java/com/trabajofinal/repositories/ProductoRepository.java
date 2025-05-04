package com.trabajofinal.repositories;

import com.trabajofinal.entities.Precio;
import com.trabajofinal.entities.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface ProductoRepository extends BaseRepository<Producto, UUID>{
    List<Producto> findAllByCatalogoId(UUID idCatalogo);

}
