package br.edu.infnet.apphospedagem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.infnet.apphospedagem.model.Casa;

public interface CasaRepository extends JpaRepository<Casa, Integer>{

	@Query("from Casa c where c.usuario.id = :id")
	public List<Casa> obterLista(Integer id);

}
