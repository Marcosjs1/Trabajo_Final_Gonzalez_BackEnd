package com.trabajofinal.services;

import com.trabajofinal.entities.Talle;
import com.trabajofinal.repositories.BaseRepository;
import com.trabajofinal.repositories.TalleRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class TalleService extends BaseService<Talle, UUID>{
    public TalleService(TalleRepository talleRepository) {
        super(talleRepository);
    }
}
