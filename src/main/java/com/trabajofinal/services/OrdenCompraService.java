package com.trabajofinal.services;

import com.trabajofinal.entities.Direccion;
import com.trabajofinal.entities.OrdenCompra;
import com.trabajofinal.entities.Usuario;
import com.trabajofinal.repositories.BaseRepository;
import com.trabajofinal.repositories.OrdenCompraRepository;
import jakarta.transaction.TransactionScoped;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.UUID;
@Service
public class OrdenCompraService extends BaseService<OrdenCompra, UUID>{
    public OrdenCompraService(OrdenCompraRepository ordenCompraRepository) {
        super(ordenCompraRepository);
    }
    @Autowired
    private OrdenCompraRepository ordenCompraRepository;
    @Transactional
    public OrdenCompra agregarUsuario(UUID idOrdenCompra, Usuario usuario) throws Exception  {
        try {
            OrdenCompra ordenCompra = ordenCompraRepository.findById(idOrdenCompra).orElse(null);
            if (ordenCompra != null){
                ordenCompra.setUsuario(usuario);
                ordenCompraRepository.save(ordenCompra);
                return ordenCompra;
            }else {
                return null;
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public OrdenCompra agregarDireccion (UUID idOrdenCompra, Direccion direccion) throws Exception {
        try {
            OrdenCompra ordenCompra = ordenCompraRepository.findById(idOrdenCompra).orElse(null);
            if (ordenCompra != null){
                ordenCompra.setDireccionEnvio(direccion);
                ordenCompraRepository.save(ordenCompra);
                return ordenCompra;
                }else {
                return null;
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<OrdenCompra> listarPorUsuario (UUID idUsuario) throws Exception{
        try {
            return ordenCompraRepository.findAllByUsuarioId(idUsuario);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<OrdenCompra> listarPorDireccion(UUID idDireccion) throws Exception{
        try {
         return ordenCompraRepository.findAllByDireccionId(idDireccion);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
