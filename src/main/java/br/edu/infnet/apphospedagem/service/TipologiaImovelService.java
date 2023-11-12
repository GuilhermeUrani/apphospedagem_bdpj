package br.edu.infnet.apphospedagem.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apphospedagem.model.TipologiaImovel;
import br.edu.infnet.apphospedagem.model.Usuario;
import br.edu.infnet.apphospedagem.repository.TipologiaImovelRepository;

@Service
public class TipologiaImovelService {

	@Autowired
	private TipologiaImovelRepository tipologiaImovelRepository;

	public Collection<TipologiaImovel> obterLista(){
		
		return (Collection<TipologiaImovel>) tipologiaImovelRepository.findAll();
	}
	
	public Collection<TipologiaImovel> obterLista(Usuario usuario){
		
		return (Collection<TipologiaImovel>) tipologiaImovelRepository.obterLista(usuario.getId());
	}
	

	public void incluir(TipologiaImovel tipologiaImovel) {

		tipologiaImovelRepository.save(tipologiaImovel);
	}
	
	public void excluir(Integer id) {

		tipologiaImovelRepository.deleteById(id);
	}
}
