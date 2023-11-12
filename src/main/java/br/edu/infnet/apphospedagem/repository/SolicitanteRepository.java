package br.edu.infnet.apphospedagem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apphospedagem.model.Solicitante;

@Repository
public interface SolicitanteRepository extends JpaRepository<Solicitante, Integer>{

	@Query("from Solicitante s where s.usuario.id = :id")
	public List<Solicitante> obterLista(Integer id);

}
