package com.trabajofinal.entities;

import com.trabajofinal.entities.enums.Sexo;
import com.trabajofinal.entities.enums.TipoProducto;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "productos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Producto extends BaseEntity implements Serializable {

    private String nombre;
    private TipoProducto tipoProducto;
    private Sexo sexo;

    @ManyToOne
    @JoinColumn(name = "catalogo_id")
    private Catalogo catalogo;

}
