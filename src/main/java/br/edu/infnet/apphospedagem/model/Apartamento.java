package br.edu.infnet.apphospedagem.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.edu.infnet.apphospedagem.enuns.TipoCodLocalEnum;

@Entity
@Table(name = "tb_apartamento")
public class Apartamento extends TipologiaImovel {

	private Integer qtdQuartos;
	private Integer qtdBanheiros;
	private String bloco;
	private Integer numeroAndar;
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

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}

	public Integer getNumeroAndar() {
		return numeroAndar;
	}

	public void setNumeroAndar(Integer numeroAndar) {
		this.numeroAndar = numeroAndar;
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

	public Apartamento() {

	}

	public Apartamento(Integer id, LocalImovel localImovel, TipoCodLocalEnum codTipoLocal, Integer qtdQuartos,
			Integer qtdBanheiros, String bloco, Integer numeroAndar, Integer areaUtil, Double vlorDiaria) {
		super(id, localImovel, codTipoLocal);
		this.qtdQuartos = qtdQuartos;
		this.qtdBanheiros = qtdBanheiros;
		this.bloco = bloco;
		this.numeroAndar = numeroAndar;
		this.areaUtil = areaUtil;
		this.valorDiaria = vlorDiaria;
	}

	@Override
	public String toString() {
		return super.toString() + "Apartamento [qtdQuartos=" + qtdQuartos + ", QtdBanheiros=" + qtdBanheiros + ", bloco=" + bloco
				+ ", numeroAndar=" + numeroAndar + ", areaUtil=" + areaUtil + ", valorDiaria=" + valorDiaria + "]";
	}
}
