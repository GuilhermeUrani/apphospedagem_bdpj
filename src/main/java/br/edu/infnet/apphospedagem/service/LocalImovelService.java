package br.edu.infnet.apphospedagem.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apphospedagem.model.LocalImovel;
import br.edu.infnet.apphospedagem.model.Usuario;
import br.edu.infnet.apphospedagem.repository.LocalImovelRepository;

@Service
public class LocalImovelService {

	@Autowired
	private LocalImovelRepository localImovelRepository;

	public Collection<LocalImovel> obterLista() {

		return (Collection<LocalImovel>) localImovelRepository.findAll();
	}

	public Collection<LocalImovel> obterLista(Usuario usuario) {

		return (Collection<LocalImovel>) localImovelRepository.obterLista(usuario.getId());
	}

	public void incluir(LocalImovel localImovel) {

		localImovelRepository.save(localImovel);
	}

	public void excluir(Integer id) {

		localImovelRepository.deleteById(id);
	}

	public void alterar(LocalImovel localImovel) {
		localImovelRepository.save(localImovel);
	}
}
