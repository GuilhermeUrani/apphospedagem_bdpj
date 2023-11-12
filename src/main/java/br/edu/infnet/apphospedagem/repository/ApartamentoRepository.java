package br.edu.infnet.apphospedagem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apphospedagem.model.Apartamento;

@Repository
public interface ApartamentoRepository extends JpaRepository<Apartamento, Integer>{

	@Query("from Apartamento a where a.usuario.id = :id")
	public List<Apartamento> obterLista(Integer id);
}
