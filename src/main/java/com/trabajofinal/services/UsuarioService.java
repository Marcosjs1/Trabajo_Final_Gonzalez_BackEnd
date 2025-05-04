package com.trabajofinal.services;

import com.trabajofinal.entities.Direccion;
import com.trabajofinal.entities.Usuario;
import com.trabajofinal.repositories.BaseRepository;
import com.trabajofinal.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class UsuarioService extends BaseService<Usuario, UUID>{
    public UsuarioService(UsuarioRepository usuarioRepository) {
        super(usuarioRepository);
    }
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Transactional
    public Usuario agregarDirecciones(UUID idUsuario, List<Direccion> direcciones) throws Exception{
        try {
         Usuario usuario = usuarioRepository.findById(idUsuario).orElse(null);
         if (usuario != null){
             usuario.setDirecciones(direcciones);
             usuarioRepository.save(usuario);
             return usuario;
         } else {
             return null;
         }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<Usuario> listarPorDireccion (UUID idDireccion) throws Exception {
        try {
            return usuarioRepository.findAllByDireccionId(idDireccion);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
