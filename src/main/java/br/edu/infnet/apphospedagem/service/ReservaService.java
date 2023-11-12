package br.edu.infnet.apphospedagem.service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apphospedagem.model.Reserva;
import br.edu.infnet.apphospedagem.model.Usuario;
import br.edu.infnet.apphospedagem.repository.ReservaRepository;

@Service
public class ReservaService {

	@Autowired
	private ReservaRepository reservaRepository;

	public Collection<Reserva> obterLista(){
		
		return (Collection<Reserva>) reservaRepository.findAll();
	}
	
	public Collection<Reserva> obterLista(Usuario usuario){
		
		List<Reserva> lista = reservaRepository.obterLista(usuario.getId());
		
		if(lista.isEmpty()) {
			return Collections.emptyList();
		}
		
		return lista;
	}

	public void incluir(Reserva reserva) {

		reservaRepository.save(reserva);
	}
	
	public void excluir(Integer id) {

		reservaRepository.deleteById(id);
	}
}
