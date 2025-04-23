package com.trabajofinal.controllers;

import com.trabajofinal.entities.Imagen;
import com.trabajofinal.services.BaseService;
import com.trabajofinal.services.ImagenService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/imagenes")
public class ImagenController extends BaseController<Imagen, UUID>{
    public ImagenController(ImagenService imagenService) {
        super(imagenService);
    }
}
