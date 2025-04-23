package com.trabajofinal.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "imagenes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Imagen extends BaseEntity implements Serializable {

    private String url;
    @ManyToOne
    @JoinColumn(name = "detalleProducto_id")
    private DetalleProducto detalleProducto;

}
