package br.com.gcavalli.investoBro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gcavalli.investoBro.domain.Corretora;

@Repository
public interface CorretoraRepository extends JpaRepository<Corretora, Integer> {
	
}
