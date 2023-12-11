package com.m2s07.veiculos;

import com.m2s07.veiculos.models.Multa;
import com.m2s07.veiculos.models.TipoVeiculo;
import com.m2s07.veiculos.models.Veiculo;
import com.m2s07.veiculos.repository.MultaRepository;
import com.m2s07.veiculos.repository.VeiculoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VeiculosApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeiculosApplication.class, args);
	}
	@Bean
	CommandLineRunner run(VeiculoRepository veiculoRepo, MultaRepository multaRepo) {
		return args -> {

			Veiculo veiculo1 = new Veiculo("ABC-1234", TipoVeiculo.AUTOMOVEL,
					"Bat-Movel", 2022, "preto");
			Veiculo veiculo2 = new Veiculo("BCA-4321", TipoVeiculo.ONIBUS,
					"Enterprise", 1960, "prata");
			veiculoRepo.save(veiculo1);
			veiculoRepo.save(veiculo2);

			Multa multa1 = new Multa("Gothan City", "Farol apagado", 250F, veiculo1);
			Multa multa2 = new Multa("Gothan City", "Insulfilm", 100F, veiculo1);
			Multa multa3 = new Multa("Hiper-espaço", "Excesso velocidade", 400F, veiculo2);
			multaRepo.save(multa1);
			multaRepo.save(multa2);
			multaRepo.save(multa3);

			multa3.setValor(380F);
			multaRepo.save(multa3);

			System.out.println("-----------------------------------");
			List<Veiculo> veiculos = veiculoRepo.findAll();
			for(Veiculo veiculo : veiculos) {
				System.out.println(veiculo);
			}
			System.out.println("-----------------------------------");
		};
	}
}