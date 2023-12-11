package com.m2s07.veiculos.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MULTAS")
@NoArgsConstructor
@AllArgsConstructor
public class Multa {
    @Id
    @GeneratedValue
    private Integer id;

    private String local;

    private String motivo;

    private Float valor;

    @ManyToOne
    private Veiculo veiculo;
}
