package br.com.gcavalli.investoBro.domain.enums;

public enum TipoLancamento {
	
	COMPRA(1, "COMPRA"),
	VENDA(2, "VENDA");
	
	private Integer codigo;
	private String descricao;
	
	private TipoLancamento(Integer cod, String descricao) {
		this.codigo = cod;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static TipoLancamento TipoLancamentoToEnum(Integer codigo) {
		if (codigo == null)
			return null;
		
		for(TipoLancamento tl : TipoLancamento.values()) {
			if (tl.getCodigo().equals(codigo))
				return tl;
		}
		
		throw new IllegalArgumentException("TipoLancamento com o código "+codigo+" não existe");
	}

}
