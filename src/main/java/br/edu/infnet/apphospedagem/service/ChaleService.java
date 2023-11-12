package br.edu.infnet.apphospedagem.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apphospedagem.model.Chale;
import br.edu.infnet.apphospedagem.model.Usuario;
import br.edu.infnet.apphospedagem.repository.ChaleRepository;

@Service
public class ChaleService {

	@Autowired
	private ChaleRepository chaleRepository;

	public Collection<Chale> obterLista(){
		
		return (Collection<Chale>) chaleRepository.findAll();
	}
	
	public Collection<Chale> obterLista(Usuario usuario){
		
		return (Collection<Chale>) chaleRepository.obterLista(usuario.getId());
	}

	public void incluir(Chale chale) {

		chaleRepository.save(chale);
	}
	
	public void excluir(Integer id) {

		chaleRepository.deleteById(id);
	}	
}
