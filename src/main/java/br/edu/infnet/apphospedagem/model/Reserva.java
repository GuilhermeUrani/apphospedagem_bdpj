package br.edu.infnet.apphospedagem.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_reserva")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne(cascade = CascadeType.DETACH) 
	@JoinColumn(name = "idSolicitante")
	private Solicitante solicitante;
	@ManyToMany(cascade = CascadeType.DETACH)
	private List<TipologiaImovel> tipologiaImoveis;
	private Integer qtdPessoas;
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private LocalDate dataInicio;
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private LocalDate dataFim;
	private Double valor;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	
	public Reserva() {
		id = 1;
		qtdPessoas = 10;
		dataInicio = LocalDate.of(2023, 10, 5);
		dataFim = LocalDate.of(2023, 10, 12);
		valor = 1400.00;
	}

	public Reserva(Integer id,Solicitante solicitante, List<TipologiaImovel> tipologiaImoveis) {
		super();
		this.id = id;
		this.solicitante = solicitante;
		this.tipologiaImoveis = tipologiaImoveis;
	}

	public List<TipologiaImovel> getTipologiaImoveis() {
		return tipologiaImoveis;
	}

	public void setTipologiaImoveis(List<TipologiaImovel> tipologiaImoveis) {
		this.tipologiaImoveis = tipologiaImoveis;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public List<TipologiaImovel> getTipologiaImovel() {
		return tipologiaImoveis;
	}

	public void setTipologiaImovel(List<TipologiaImovel> tipologiaImoveis) {
		this.tipologiaImoveis = tipologiaImoveis;
	}

	public Integer getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(Integer qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Reserva id=" + id + ", solicitante=" + solicitante + ", tipologiaImovel=" + tipologiaImoveis
				+ ", qtdPessoas=" + qtdPessoas + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", valor="
				+ valor + ", tipologiaImovel= " + tipologiaImoveis.size();
	}

}
