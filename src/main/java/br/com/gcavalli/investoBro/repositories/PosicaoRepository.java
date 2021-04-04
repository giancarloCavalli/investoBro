package br.com.gcavalli.investoBro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gcavalli.investoBro.domain.Posicao;

public interface PosicaoRepository extends JpaRepository<Posicao, Integer> {

}
