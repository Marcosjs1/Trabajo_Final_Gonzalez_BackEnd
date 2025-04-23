package com.trabajofinal.services;

import com.trabajofinal.entities.Imagen;
import com.trabajofinal.repositories.BaseRepository;
import com.trabajofinal.repositories.ImagenRepository;

import java.util.UUID;

public class ImagenService extends BaseService<Imagen, UUID>{
    public ImagenService(ImagenRepository imagenRepository) {
        super(imagenRepository);
    }
}
