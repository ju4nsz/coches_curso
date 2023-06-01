package com.project.coches.project_coches.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entidad de marca coche
 */
@Getter
@Setter
@Entity
@Table(name = "marca_coche")
public class MarcaCocheEntity {
    /**
     * Id de la marca
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * Descripción de la marca
     */
    @Column(name = "descripcion")
    private String description;
}
