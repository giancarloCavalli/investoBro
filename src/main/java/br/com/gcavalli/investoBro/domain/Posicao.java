package br.com.gcavalli.investoBro.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Posicao implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Double quantidade;
	private Double precoMedio;
	private boolean encerrada;
	
	@ManyToOne
	@JoinColumn(name = "id_carteira")
	private Carteira carteira;
//	private List<Lancamento> lancamentos = new ArrayList<>();
//	private Ativo ativo;
	
	public Posicao() {
	}

	public Posicao(Double quantidade, Double precoMedio, boolean encerrada, Carteira carteira) {
		this.quantidade = quantidade;
		this.precoMedio = precoMedio;
		this.encerrada = encerrada;
		this.carteira = carteira;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoMedio() {
		return precoMedio;
	}

	public void setPrecoMedio(Double precoMedio) {
		this.precoMedio = precoMedio;
	}

	public boolean isEncerrada() {
		return encerrada;
	}

	public void setEncerrada(boolean encerrada) {
		this.encerrada = encerrada;
	}
	
	public Carteira getCarteira() {
		return carteira;
	}

	public void setCarteira(Carteira carteira) {
		this.carteira = carteira;
	}

//	public List<Lancamento> getLancamentos() {
//		return lancamentos;
//	}
//
//	public void setLancamentos(List<Lancamento> lancamentos) {
//		this.lancamentos = lancamentos;
//	}
//	
//	public Ativo getAtivo() {
//		return ativo;
//	}
//
//	public void setAtivo(Ativo ativo) {
//		this.ativo = ativo;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicao other = (Posicao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
