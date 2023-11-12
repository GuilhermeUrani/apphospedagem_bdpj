package br.edu.infnet.apphospedagem.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.apphospedagem.enuns.TipoCodLocalEnum;

@Entity
@Table(name = "tb_casa")
public class Casa extends TipologiaImovel {

	private Integer qtdQuartos;
	private Integer qtdBanheiros;
	private Boolean bolPossuiPiscina;
	private String rua;
	private Integer numero;
	private Integer areaUtil;
	private Double valorDiaria;

	public Integer getQtdQuartos() {
		return qtdQuartos;
	}

	public void setQtdQuartos(Integer qtdQuartos) {
		this.qtdQuartos = qtdQuartos;
	}

	public Integer getQtdBanheiros() {
		return qtdBanheiros;
	}

	public void setQtdBanheiros(Integer qtdBanheiros) {
		this.qtdBanheiros = qtdBanheiros;
	}

	public Boolean getBolPossuiPiscina() {
		return bolPossuiPiscina;
	}

	public void setBolPossuiPiscina(Boolean bolPossuiPiscina) {
		this.bolPossuiPiscina = bolPossuiPiscina;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getAreaUtil() {
		return areaUtil;
	}

	public void setAreaUtil(Integer areaUtil) {
		this.areaUtil = areaUtil;
	}

	public Double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Casa() {
	}

	public Casa(Integer id, LocalImovel localImovel, TipoCodLocalEnum codTipoLocal, Integer qtdQuartos,
			Integer qtdBanheiros, Boolean bolPossuiPiscina, String rua, Integer numero, Integer areaUtil,
			Double valorDiaria) {
		super(id, localImovel, codTipoLocal);
		this.qtdQuartos = qtdQuartos;
		this.qtdBanheiros = qtdBanheiros;
		this.bolPossuiPiscina = bolPossuiPiscina;
		this.rua = rua;
		this.numero = numero;
		this.areaUtil = areaUtil;
		this.valorDiaria = valorDiaria;
	}

	@Override
	public String toString() {
		return super.toString() + " Casa [qtdQuartos=" + qtdQuartos + ", qtdBanheiros=" + qtdBanheiros
				+ ", bolPossuiPiscina=" + bolPossuiPiscina + ", rua=" + rua + ", numero=" + numero + ", areaUtil="
				+ areaUtil + ", valorDiaria=" + valorDiaria + "]";
	}

}
