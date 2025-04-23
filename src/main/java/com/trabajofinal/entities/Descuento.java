package com.trabajofinal.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "descuentos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Descuento extends BaseEntity implements Serializable {

    private String fechaInicio;
    private String fechaCierra;
    private Number descuento;
}
