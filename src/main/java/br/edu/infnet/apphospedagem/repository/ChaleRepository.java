package br.edu.infnet.apphospedagem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apphospedagem.model.Chale;

@Repository
public interface ChaleRepository extends JpaRepository<Chale, Integer>{

	@Query("from Chale c where c.usuario.id = :id")
	public List<Chale> obterLista(Integer id);
}
