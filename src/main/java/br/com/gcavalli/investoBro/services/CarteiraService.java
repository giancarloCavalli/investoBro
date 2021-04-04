package br.com.gcavalli.investoBro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gcavalli.investoBro.domain.Carteira;
import br.com.gcavalli.investoBro.repositories.CarteiraRepository;

@Service
public class CarteiraService {
	
	@Autowired
	private CarteiraRepository repo;
	
	public void insert(Carteira obj) {
		repo.save(obj);
	}
}
