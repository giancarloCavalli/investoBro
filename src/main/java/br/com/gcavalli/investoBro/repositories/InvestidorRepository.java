package br.com.gcavalli.investoBro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gcavalli.investoBro.domain.Investidor;

public interface InvestidorRepository extends JpaRepository<Investidor, Integer> {

}
