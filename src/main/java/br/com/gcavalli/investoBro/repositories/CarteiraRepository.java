package br.com.gcavalli.investoBro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gcavalli.investoBro.domain.Carteira;

@Repository
public interface CarteiraRepository extends JpaRepository<Carteira, Integer> {
	
}
