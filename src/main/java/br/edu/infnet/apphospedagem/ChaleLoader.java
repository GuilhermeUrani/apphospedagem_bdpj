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
import br.edu.infnet.apphospedagem.model.Chale;
import br.edu.infnet.apphospedagem.model.LocalImovel;

@Order(3)
@Component
public class ChaleLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Map<Integer, Chale> mapaChale = new HashMap<Integer, Chale>();

		FileReader file = new FileReader("arquivos/chale.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();
		String[] campos = null;


		while (linha != null) {
			campos = linha.split(";");

			Chale chale = new Chale();
			chale.setId(Integer.valueOf(campos[0]));
			chale.setLocalImovel(new LocalImovel(Integer.valueOf(campos[1]), campos[2], campos[3]));
			chale.setCodTipoLocal(TipoCodLocalEnum.valueOf(campos[4]));
			chale.setQtdQuartos(Integer.valueOf(campos[5]));
			chale.setQtdBanheiros(Integer.valueOf(campos[6]));
			chale.setRua(campos[7]);
			chale.setNumero(Integer.valueOf(campos[8]));
			chale.setAreaUtil(Integer.valueOf(campos[9]));
			chale.setValorDiaria(Double.valueOf(campos[10]));

			
			
			mapaChale.put(chale.getId(), chale);

			linha = leitura.readLine();
		}

		for (Integer k : mapaChale.keySet()) {
			System.out.println("[Chale] inclusão realizada com sucesso: " + mapaChale.get(k));
		}

		leitura.close();

	}
}
