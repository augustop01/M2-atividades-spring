package com.m2s07.veiculos;

import com.m2s07.veiculos.models.TipoVeiculo;
import com.m2s07.veiculos.models.Veiculo;
import com.m2s07.veiculos.repository.MultaRepository;
import com.m2s07.veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Application {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @Autowired
    private MultaRepository multaRepository;

    public void application() {
        Veiculo veiculo1 = new Veiculo("ABC-1234", TipoVeiculo.AUTOMOVEL, "Bat-Movel", 2022, "preto");
        Veiculo veiculo2 = new Veiculo("BCA-4321", TipoVeiculo.ONIBUS, "Enterprise", 1960, "prata");
        veiculoRepository.save(veiculo1);
        veiculoRepository.save(veiculo2);
    }
}
