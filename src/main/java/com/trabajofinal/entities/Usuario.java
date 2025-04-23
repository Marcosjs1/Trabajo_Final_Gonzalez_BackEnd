package com.trabajofinal.entities;

import com.trabajofinal.entities.enums.TipoUsuario;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario extends BaseEntity implements Serializable {

    private String nombre;
    private String contraseña;
    private TipoUsuario rol;
    private String email;
    private String dni;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "usuario_direccion",
            joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "direccion_id")
    )
    @Builder.Default
    private List<Direccion> direcciones = new ArrayList<>();
}
