package br.com.gcavalli.investoBro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gcavalli.investoBro.domain.Corretora;
import br.com.gcavalli.investoBro.repositories.CorretoraRepository;

@Service
public class CorretoraService {

	@Autowired
	public CorretoraRepository repo;

	public void insert(Corretora obj) {
		repo.save(obj);
	}
}
