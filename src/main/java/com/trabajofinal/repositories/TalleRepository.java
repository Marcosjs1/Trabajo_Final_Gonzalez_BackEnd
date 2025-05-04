package com.trabajofinal.repositories;

import com.trabajofinal.entities.Talle;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface TalleRepository extends BaseRepository<Talle, UUID>{
}
