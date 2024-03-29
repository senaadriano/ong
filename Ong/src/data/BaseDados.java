package data;

import java.util.ArrayList;
import java.util.List;

import entities.Ave;
import entities.Cachorro;
import entities.Gato;

public class BaseDados {

	public List <Cachorro> cachorros(){
		List <Cachorro> cachorros = new ArrayList<>();

		try {
			Cachorro cachorro;

			cachorro = new Cachorro();
			cachorro.setId(1);
			cachorro.setNome("Totó");
			cachorro.setIdade(2.1);
			cachorro.setPeso(3.4);
			cachorro.setGenero("Macho");
			cachorro.setRaca("Poodle");
			cachorro.setCor("Branco");
			cachorro.setVacinado(true);
			cachorro.setCastrado(true);
			cachorros.add(cachorro);

			cachorro = new Cachorro();
			cachorro.setId(2);
			cachorro.setNome("Luna");
			cachorro.setIdade(3.0);
			cachorro.setPeso(2.5);
			cachorro.setGenero("Fêmea");
			cachorro.setRaca("Pinscher");
			cachorro.setCor("Preto com marrom");
			cachorro.setVacinado(true);
			cachorro.setCastrado(true);
			cachorros.add(cachorro);

			cachorro = new Cachorro();
			cachorro.setId(3);
			cachorro.setNome("Duck");
			cachorro.setIdade(0.5);
			cachorro.setPeso(1.0);
			cachorro.setGenero("Macho");
			cachorro.setRaca("Pitbull");
			cachorro.setCor("Cinzento");
			cachorro.setVacinado(true);
			cachorro.setCastrado(true);
			cachorros.add(cachorro);
		}catch(Exception e) {
			System.out.println("Erro ao adicionar cachorro: " + e.getMessage());
		}

		return cachorros;
	}
	public List <Gato> gatos(){
		List <Gato> gatos = new ArrayList<>();

		try {
			Gato gato;

			gato = new Gato();
			gato.setId(0);
			gato.setNome("Thor");
			gato.setIdade(1.2);
			gato.setPeso(2.3);
			gato.setGenero("Macho");
			gato.setCor("Marrom");
			gato.setVacinado(true);
			gato.setCastrado(false);
			gato.setHabilidade("Caçar ratos");
			gatos.add(gato);

			gato = new Gato();
			gato.setId(1);
			gato.setNome("Bela");
			gato.setIdade(0.3);
			gato.setPeso(0.9);
			gato.setGenero("Fêmea");
			gato.setCor("Branco");
			gato.setVacinado(true);
			gato.setCastrado(true);
			gato.setHabilidade("Brincar");
			gatos.add(gato);

			gato = new Gato();
			gato.setId(2);
			gato.setNome("Lily");
			gato.setIdade(0.6);
			gato.setPeso(1.2);
			gato.setGenero("Fêmea");
			gato.setCor("Preto e Branco");
			gato.setVacinado(true);
			gato.setCastrado(true);
			gato.setHabilidade("Dormir");
			gatos.add(gato);
		}catch(Exception e) {
			System.out.println("Erro ao adicionar gato: " + e.getMessage());
		}

		return gatos;
	}
	public List<Ave> aves(){
		List <Ave> aves = new ArrayList<>();

		try {
			Ave ave;

			ave = new Ave();
			ave.setId(0);
			ave.setNome("Jack");
			ave.setIdade(0.6);
			ave.setPeso(0.4);
			ave.setGenero("Macho");
			ave.setRaca("Papagaio");
			ave.setTamanho("Grande");
			ave.setPlumagem("Verde e amarelo");
			ave.setAlimentacao("Girassol");
			aves.add(ave);

			ave = new Ave();
			ave.setId(1);
			ave.setNome("Daisy");
			ave.setIdade(2.0);
			ave.setPeso(0.8);
			ave.setGenero("Fêmea");
			ave.setRaca("Arara");
			ave.setTamanho("Grande");
			ave.setPlumagem("Azul");
			ave.setAlimentacao("Ração de grãos");
			aves.add(ave);

			ave = new Ave();
			ave.setId(2);
			ave.setNome("Leo");
			ave.setIdade(1.0);
			ave.setPeso(0.200);
			ave.setGenero("Macho");
			ave.setRaca("Canário");
			ave.setTamanho("Médio");
			ave.setPlumagem("Amarelo");
			ave.setAlimentacao("Alpiste");
			aves.add(ave);

		}catch(Exception e) {
			System.out.println("Erro ao adicionar gato: " + e.getMessage());
		}

		return aves;
	}
}
