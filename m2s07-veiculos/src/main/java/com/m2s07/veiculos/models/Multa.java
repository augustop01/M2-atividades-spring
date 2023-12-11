package com.m2s07.veiculos.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "MULTAS")
@NoArgsConstructor
public class Multa {
    @Id
    @GeneratedValue
    private Integer id;

    private String local;

    private String motivo;

    private Float valor;

    @ManyToOne
    @JoinColumn(name = "PLACA", referencedColumnName = "PLACA")
    private Veiculo veiculo;

    public Multa(String local, String motivo, Float valor, Veiculo veiculo) {
        this.local = local;
        this.motivo = motivo;
        this.valor = valor;
        this.veiculo = veiculo;
    }
}
