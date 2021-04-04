package br.com.gcavalli.investoBro;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.gcavalli.investoBro.domain.Carteira;
import br.com.gcavalli.investoBro.domain.Corretora;
import br.com.gcavalli.investoBro.domain.Investidor;
import br.com.gcavalli.investoBro.domain.Posicao;
import br.com.gcavalli.investoBro.repositories.CarteiraRepository;
import br.com.gcavalli.investoBro.repositories.CorretoraRepository;
import br.com.gcavalli.investoBro.repositories.InvestidorRepository;
import br.com.gcavalli.investoBro.repositories.PosicaoRepository;

@SpringBootApplication
public class InvestoBroApplication implements CommandLineRunner {

	@Autowired
	private CorretoraRepository corretoraService;
	@Autowired
	private InvestidorRepository investidorRepository;
	@Autowired
	private CarteiraRepository carteiraRepository;
	@Autowired
	private PosicaoRepository posicaoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(InvestoBroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Corretora corr1 = new Corretora("XP Investimentos");
		
		Investidor inv1 = new Investidor("Giancarlo Cavalli", "65802508957", Date.valueOf(LocalDate.of(1997, 6, 3)), "gc.cursos@gmail.com", "123");
		
		Carteira car1 = new Carteira(corr1, inv1);
		
		Posicao pos1 = new Posicao(100.0, 15.57, false, car1);
		
		corretoraService.save(corr1);
		investidorRepository.save(inv1);
		carteiraRepository.save(car1);
		posicaoRepository.save(pos1);
	}

}
