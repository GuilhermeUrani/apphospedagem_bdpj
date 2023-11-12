package br.edu.infnet.apphospedagem.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apphospedagem.model.Apartamento;
import br.edu.infnet.apphospedagem.model.Usuario;
import br.edu.infnet.apphospedagem.repository.ApartamentoRepository;

@Service
public class ApartamentoService {

	@Autowired
	private ApartamentoRepository apartamentoRepository;

	public Collection<Apartamento> obterLista(){
		
		return (Collection<Apartamento>) apartamentoRepository.findAll();
	}
	
	public Collection<Apartamento> obterLista(Usuario usuario){
		
		return (Collection<Apartamento>) apartamentoRepository.obterLista(usuario.getId());
	}

	public void incluir(Apartamento apartamento) {

		apartamentoRepository.save(apartamento);
	}
	
	public void excluir(Integer id) {

		apartamentoRepository.deleteById(id);
	}	
}
