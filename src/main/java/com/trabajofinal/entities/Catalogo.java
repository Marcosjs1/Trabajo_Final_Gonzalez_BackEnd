package com.trabajofinal.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "catalogos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Catalogo extends BaseEntity implements Serializable {

    private String nombre;


}
