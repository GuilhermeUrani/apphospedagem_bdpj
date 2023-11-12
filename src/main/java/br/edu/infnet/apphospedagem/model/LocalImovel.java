package br.edu.infnet.apphospedagem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_localimovel")
public class LocalImovel{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descLocalImovel;
	private String descEndereco;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
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

	public String getDescLocalImovel() {
		return descLocalImovel;
	}

	public void setDescLocalImovel(String descLocalImovel) {
		this.descLocalImovel = descLocalImovel;
	}

	public String getDescEndereco() {
		return descEndereco;
	}

	public void setDescEndereco(String descEndereco) {
		this.descEndereco = descEndereco;
	}

	public LocalImovel() {
	}

	public LocalImovel(Integer id, String descLocalImovel, String descEndereco) {
		super();
		this.id = id;
		this.descLocalImovel = descLocalImovel;
		this.descEndereco = descEndereco;
	}

	@Override
	public String toString() {
		return "LocalImovel [id=" + id + ", descLocalImovel=" + descLocalImovel + ", descEndereco=" + descEndereco
				+ "]";
	}

}
