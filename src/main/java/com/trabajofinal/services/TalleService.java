package com.trabajofinal.services;

import com.trabajofinal.entities.Talle;
import com.trabajofinal.repositories.BaseRepository;
import com.trabajofinal.repositories.TalleRepository;

import java.util.UUID;

public class TalleService extends BaseService<Talle, UUID>{
    public TalleService(TalleRepository talleRepository) {
        super(talleRepository);
    }
}
