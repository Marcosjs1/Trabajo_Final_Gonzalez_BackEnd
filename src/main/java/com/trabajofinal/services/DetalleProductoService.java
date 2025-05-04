package com.trabajofinal.services;

import com.trabajofinal.entities.DetalleProducto;
import com.trabajofinal.entities.Producto;
import com.trabajofinal.entities.Talle;
import com.trabajofinal.repositories.DetalleProductoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class DetalleProductoService extends BaseService<DetalleProducto, UUID>{
    public DetalleProductoService(DetalleProductoRepository detalleProductoRepository) {
        super(detalleProductoRepository);
    }
    @Autowired
    private DetalleProductoRepository detalleProductoRepository;
    @Transactional
    public DetalleProducto agregarTalle(UUID idDetalleProducto, Talle talle) throws Exception{
        try {
            DetalleProducto detalleProducto = detalleProductoRepository.findById(idDetalleProducto).orElse(null);
            if (detalleProducto != null){
                detalleProducto.setTalle(talle);
                detalleProductoRepository.save(detalleProducto);
                return detalleProducto;
            } else {
                return null;
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public DetalleProducto agregarProducto(UUID idDetalleProducto, Producto producto) throws Exception{
        try {
            DetalleProducto detalleProducto = detalleProductoRepository.findById(idDetalleProducto).orElse(null);
            if (detalleProducto != null){
                detalleProducto.setProducto(producto);
                detalleProductoRepository.save(detalleProducto);
                return detalleProducto;
            }else {
                return null;
            }
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<DetalleProducto> listarPorTalle(UUID idTalle) throws Exception{
        try {
         return detalleProductoRepository.findAllByTalleId(idTalle);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public  List<DetalleProducto> listarPorProducto(UUID idProducto) throws Exception{
        try {
         return detalleProductoRepository.findAllByProductoId(idProducto);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }
    }


}
