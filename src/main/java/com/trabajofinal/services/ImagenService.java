package com.trabajofinal.services;

import com.trabajofinal.entities.DetalleProducto;
import com.trabajofinal.entities.Imagen;
import com.trabajofinal.repositories.BaseRepository;
import com.trabajofinal.repositories.ImagenRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.UUID;
@Service
public class ImagenService extends BaseService<Imagen, UUID>{
    public ImagenService(ImagenRepository imagenRepository) {
        super(imagenRepository);
    }
    @Autowired
    private ImagenRepository imagenRepository;
    @Transactional
    public Imagen agregarDetalleProducto(UUID idImagen, DetalleProducto detalleProducto) throws Exception{
        try {
            Imagen imagen = imagenRepository.findById(idImagen).orElse(null);
            if (imagen != null){
                imagen.setDetalleProducto(detalleProducto);
                imagenRepository.save(imagen);
                return imagen;
            } else {
                return null;
            }
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<Imagen> listarPorDetalleProducto(UUID idDetalleProducto) throws Exception{
        try {
            return imagenRepository.findAllByDetalleProductoId(idDetalleProducto);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
