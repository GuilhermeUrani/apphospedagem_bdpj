package br.edu.infnet.apphospedagem.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apphospedagem.model.Casa;
import br.edu.infnet.apphospedagem.model.Usuario;
import br.edu.infnet.apphospedagem.repository.CasaRepository;

@Service
public class CasaService {

	@Autowired
	private CasaRepository casaRepository;

	public Collection<Casa> obterLista(){
		
		return (Collection<Casa>) casaRepository.findAll();
	}
	
	public Collection<Casa> obterLista(Usuario usuario){
		
		return (Collection<Casa>) casaRepository.obterLista(usuario.getId());
	}

	public void incluir(Casa casa) {

		casaRepository.save(casa);
	}
	
	public void excluir(Integer id) {

		casaRepository.deleteById(id);
	}	
}
