package com.trabajofinal.controllers;

import com.trabajofinal.entities.DetalleProducto;
import com.trabajofinal.entities.Imagen;
import com.trabajofinal.services.BaseService;
import com.trabajofinal.services.ImagenService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/imagenes")
public class ImagenController extends BaseController<Imagen, UUID>{
    public ImagenController(ImagenService imagenService) {
        super(imagenService);
    }
    @Autowired
    private ImagenService imagenService;
    @PostMapping("/detallesProductos/{idImagen}")
    public Optional<Imagen> agregarDetalleProducto (@RequestBody DetalleProducto detalleProducto, @PathVariable UUID idImagen) throws Exception{
        Imagen imagen = imagenService.agregarDetalleProducto(idImagen,detalleProducto);
        return Optional.ofNullable(imagen);
    }
    @GetMapping("/detallesProductos/{id}")
    public ResponseEntity<List<Imagen>> listarPorDetalleProducto (@PathVariable UUID id) throws Exception{
        List<Imagen> listaImagenes = imagenService.listarPorDetalleProducto(id);
        return ResponseEntity.ok(listaImagenes);
    }
}
