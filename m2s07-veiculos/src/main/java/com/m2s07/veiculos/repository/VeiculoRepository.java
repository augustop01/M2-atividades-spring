package com.m2s07.veiculos.repository;

import com.m2s07.veiculos.models.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeiculoRepository extends JpaRepository<Veiculo, String> {
}
