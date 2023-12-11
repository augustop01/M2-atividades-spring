package com.m2s07.veiculos.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "MULTAS")
@NoArgsConstructor
public class Multa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String local;

    private String motivo;

    private Float valor;

    @ManyToOne
    @JoinColumn(name = "PLACA", referencedColumnName = "PLACA")
    private Veiculo veiculo;

    @Override
    public String toString() {
        return "Multa{" +
                "id=" + id +
                ", local='" + local + '\'' +
                ", motivo='" + motivo + '\'' +
                ", valor=" + valor +
                '}';
    }

    public Multa(String local, String motivo, Float valor, Veiculo veiculo) {
        this.local = local;
        this.motivo = motivo;
        this.valor = valor;
        this.veiculo = veiculo;
    }
}
