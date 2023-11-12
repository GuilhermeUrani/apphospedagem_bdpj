package br.edu.infnet.apphospedagem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apphospedagem.model.LocalImovel;

@Repository
public interface LocalImovelRepository extends JpaRepository<LocalImovel, Integer>{

	@Query("from LocalImovel l where l.usuario.id = :id")
	public List<LocalImovel> obterLista(Integer id);

}
