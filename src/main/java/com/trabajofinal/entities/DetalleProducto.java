package com.trabajofinal.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "detallesProductos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetalleProducto extends BaseEntity implements Serializable {

    @ManyToOne
    @JoinColumn(name = "talle_id")
    private Talle talle;

    private Number stock;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    private String color;
    private Boolean estado;



}
