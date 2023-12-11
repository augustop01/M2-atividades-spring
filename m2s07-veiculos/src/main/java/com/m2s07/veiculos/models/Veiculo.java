package com.m2s07.veiculos.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "VEICULOS")
public class Veiculo {
    @Id
    private String placa;

    @Enumerated(EnumType.STRING)
    private TipoVeiculo tipoVeiculo;

    private String nome;

    private Integer anoFabricacao;

    private String cor;

    @OneToMany
    private List<Multa> multas;

    public Veiculo(){

    }

    public Veiculo(String placa, TipoVeiculo tipoVeiculo, String nome, Integer anoFabricacao, String cor) {
        this.placa = placa;
        this.tipoVeiculo = tipoVeiculo;
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }
}
