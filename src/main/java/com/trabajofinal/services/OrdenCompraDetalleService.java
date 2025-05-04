package com.trabajofinal.services;

import com.trabajofinal.entities.OrdenCompra;
import com.trabajofinal.entities.OrdenCompraDetalle;
import com.trabajofinal.entities.Producto;
import com.trabajofinal.repositories.BaseRepository;
import com.trabajofinal.repositories.OrdenCompraDetalleRepository;
import com.trabajofinal.repositories.OrdenCompraRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class OrdenCompraDetalleService extends BaseService<OrdenCompraDetalle, UUID>{
    public OrdenCompraDetalleService(OrdenCompraDetalleRepository ordenCompraDetalleRepository) {
        super(ordenCompraDetalleRepository);
    }
    @Autowired
    private OrdenCompraDetalleRepository ordenCompraDetalleRepository;
    @Autowired
    private OrdenCompraRepository ordenCompraRepository;
    @Transactional
    public OrdenCompraDetalle agregarOrdenCompra (UUID idOrdenCompraDetalle, OrdenCompra ordenCompra) throws Exception{
        try {
            OrdenCompraDetalle ordenCompraDetalle = ordenCompraDetalleRepository.findById(idOrdenCompraDetalle).orElse(null);
            if (ordenCompraDetalle != null){
                ordenCompraDetalle.setOrdenCompra(ordenCompra);
                ordenCompra.setTotal(ordenCompra.getTotal()+ordenCompraDetalle.getSubtotal());
                ordenCompraRepository.save(ordenCompra);
                ordenCompraDetalleRepository.save(ordenCompraDetalle);
                return ordenCompraDetalle;
            } else {
                return null;
            }
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public OrdenCompraDetalle agregarProducto (UUID idOrdenCompraDetalle, Producto producto) throws Exception{
        try{
            OrdenCompraDetalle ordenCompraDetalle = ordenCompraDetalleRepository.findById(idOrdenCompraDetalle).orElse(null);
        if (ordenCompraDetalle != null){
            ordenCompraDetalle.setProducto(producto);
            ordenCompraDetalleRepository.save(ordenCompraDetalle);
            return ordenCompraDetalle;
        }else {
            return null;
        }
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<OrdenCompraDetalle> listarPorOrdenCompra( UUID idOrdenCompra) throws Exception{
        try {
            return ordenCompraDetalleRepository.findAllByOrdenCompraId(idOrdenCompra);
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<OrdenCompraDetalle> listarPorProducto( UUID idProducto) throws Exception{
        try {
            return ordenCompraDetalleRepository.findAllByProductoId(idProducto);
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
