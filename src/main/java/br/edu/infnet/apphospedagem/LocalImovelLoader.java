package br.edu.infnet.apphospedagem;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apphospedagem.model.LocalImovel;

@Order(5)
@Component
public class LocalImovelLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		LocalImovel localImovel = new LocalImovel(1, "teste", "teste");

		System.out.println("[LocalImovel] inclusão realizada com sucesso: " + localImovel);
	}
}
