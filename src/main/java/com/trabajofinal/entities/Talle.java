package com.trabajofinal.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "talles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Talle extends BaseEntity implements Serializable {


    private Number id;
    private String talle;

}
