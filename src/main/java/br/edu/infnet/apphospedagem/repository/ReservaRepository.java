package br.edu.infnet.apphospedagem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apphospedagem.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

	@Query("from Reserva r where r.usuario.id = :id")
	public List<Reserva> obterLista(Integer id);
}
