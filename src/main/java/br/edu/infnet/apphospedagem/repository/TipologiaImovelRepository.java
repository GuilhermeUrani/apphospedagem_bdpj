package br.edu.infnet.apphospedagem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apphospedagem.model.TipologiaImovel;

@Repository
public interface TipologiaImovelRepository extends JpaRepository<TipologiaImovel, Integer>{

	@Query("from TipologiaImovel t where t.usuario.id = :id")
	public List<TipologiaImovel> obterLista(Integer id);
	
}
