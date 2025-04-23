package com.trabajofinal.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "ordenComprasDetalles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrdenCompraDetalle extends BaseEntity implements Serializable {


    @ManyToOne
    @JoinColumn(name = "ordenCompra_id")
    private OrdenCompra ordenCompra;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    private Number cantidad;
}
