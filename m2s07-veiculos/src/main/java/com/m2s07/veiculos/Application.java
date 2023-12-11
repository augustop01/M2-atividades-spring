package com.m2s07.veiculos;

import com.m2s07.veiculos.models.Multa;
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

        Multa multa1 = new Multa("Farol apagado", "Gothan City", 250F, veiculo1);
        Multa multa2 = new Multa("Insulfilm", "Gothan City", 100F, veiculo1);
        Multa multa3 = new Multa("Excesso de velocidade", "Hiper-espaço", 400F, veiculo2);
        multaRepository.save(multa1);
        multaRepository.save(multa2);
        multaRepository.save(multa3);

        multa3.setValor(380F);
        multaRepository.save(multa3);
    }
}
