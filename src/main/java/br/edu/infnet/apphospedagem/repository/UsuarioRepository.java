package br.edu.infnet.apphospedagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.infnet.apphospedagem.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	Usuario findByEmail(String email);

}
