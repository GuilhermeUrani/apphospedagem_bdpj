package br.edu.infnet.apphospedagem.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.edu.infnet.apphospedagem.enuns.TipoCodLocalEnum;

@Entity
@Table(name = "tb_tipologiaImovel")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class TipologiaImovel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idLocalImovel")
	private LocalImovel localImovel;
	private TipoCodLocalEnum codTipoLocal;
	@ManyToMany(mappedBy = "tipologiaImoveis")
	private List<Reserva> reservas;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipologiaImovel() {
	}

	public TipologiaImovel(Integer id, LocalImovel localImovel, TipoCodLocalEnum codTipoLocal) {
		super();
		this.id = id;
		this.localImovel = localImovel;
		this.codTipoLocal = codTipoLocal;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalImovel getLocalImovel() {
		return localImovel;
	}

	public void setLocalImovel(LocalImovel localImovel) {
		this.localImovel = localImovel;
	}
	
	public TipoCodLocalEnum getCodTipoLocal() {
		return codTipoLocal;
	}

	public void setCodTipoLocal(TipoCodLocalEnum codTipoLocal) {
		this.codTipoLocal = codTipoLocal;
	}

	@Override
	public String toString() {
		return "TipologiaImovel [id=" + id + ", LocalImovel=" + localImovel + ", codTipoLocal=" + codTipoLocal + "]";
	}
}
