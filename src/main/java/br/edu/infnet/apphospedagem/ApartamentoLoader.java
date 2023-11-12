package br.edu.infnet.apphospedagem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apphospedagem.enuns.TipoCodLocalEnum;
import br.edu.infnet.apphospedagem.model.Apartamento;
import br.edu.infnet.apphospedagem.model.LocalImovel;

@Order(2)
@Component
public class ApartamentoLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Map<Integer, Apartamento> mapaApartamento = new HashMap<Integer, Apartamento>();

		FileReader file = new FileReader("arquivos/apartamento.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();
		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");

			Apartamento apartamento = new Apartamento();
			apartamento.setId(Integer.valueOf(campos[0]));
			apartamento.setLocalImovel(new LocalImovel(Integer.valueOf(campos[1]), campos[2], campos[3]));
			apartamento.setCodTipoLocal(TipoCodLocalEnum.valueOf(campos[4]));
			apartamento.setQtdQuartos(Integer.valueOf(campos[5]));
			apartamento.setQtdBanheiros(Integer.valueOf(campos[6]));
			apartamento.setBloco(campos[7]);
			apartamento.setNumeroAndar(Integer.valueOf(campos[8]));
			apartamento.setAreaUtil(Integer.valueOf(campos[9]));
			apartamento.setValorDiaria(Double.valueOf(campos[10]));
			
			mapaApartamento.put(apartamento.getId(), apartamento);

			linha = leitura.readLine();
		}

		for (Integer k : mapaApartamento.keySet()) {
			System.out.println("[Apartamento] inclusão realizada com sucesso: " + mapaApartamento.get(k));
		}

		leitura.close();

	}

}
