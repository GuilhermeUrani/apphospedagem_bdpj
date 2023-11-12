package br.edu.infnet.apphospedagem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apphospedagem.model.Solicitante;
import br.edu.infnet.apphospedagem.model.Usuario;
import br.edu.infnet.apphospedagem.repository.SolicitanteRepository;

@Service
public class SolicitanteService {

	@Autowired
	private SolicitanteRepository solicitanteRepository;

	public List<Solicitante> obterLista(){
		
		return (List<Solicitante>) solicitanteRepository.findAll();
	}
	
	public List<Solicitante> obterLista(Usuario usuario){
		
		return (List<Solicitante>) solicitanteRepository.obterLista(usuario.getId());
	}

	public void incluir(Solicitante solicitante) {

		solicitanteRepository.save(solicitante);
	}
	
	public void excluir(Integer id) {

		solicitanteRepository.deleteById(id);
	}

}
