package com.trabajofinal.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "ordenesDeCompra")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrdenCompra extends BaseEntity implements Serializable {

    private Long total;
    private Number descuento;
    private String fechaCompra;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "direccion_id")
    private Direccion direccionEnvio;
}
