package br.edu.infnet.apphospedagem.enuns;

public enum TipoCodLocalEnum {

	CASA(1, "Casa"), 
	APARTAMENTO(2, "Apartamento"), 
	CHALE(3, "Chale");

	private Integer id;
	private String descTipoLocal;

	TipoCodLocalEnum(Integer id, String descTipoLocal) {
		this.id = id;
		this.descTipoLocal = descTipoLocal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescTipoLocal() {
		return descTipoLocal;
	}

	public void setDescTipoLocal(String descTipoLocal) {
		this.descTipoLocal = descTipoLocal;
	}
}
