package com.trabajofinal.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "precios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Precio extends BaseEntity implements Serializable {

    private Float precioCompra;
    private Float precioVenta;

    @ManyToOne
    @JoinColumn(name = "detalleProducto_id")
    private DetalleProducto detalleProducto;

    @ManyToOne
    @JoinColumn(name = "descuento_id")
    private Descuento descuento;


}
