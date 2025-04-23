package com.trabajofinal.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "direcciones")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Direccion extends BaseEntity implements Serializable {

    private String localidad;
    private String pais;
    private String provincia;
    private String departamento;
    @ManyToMany(mappedBy = "usuarios")
    @Builder.Default
    private List<Usuario>usuarios = new ArrayList<>();
}
