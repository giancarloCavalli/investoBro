package br.com.gcavalli.investoBro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gcavalli.investoBro.domain.Investidor;
import br.com.gcavalli.investoBro.repositories.InvestidorRepository;

@Service
public class InvestidorService {
	
	@Autowired
	private InvestidorRepository repo;
	
	public void insert(Investidor obj) {
		repo.save(obj);
	}
}
