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
import br.edu.infnet.apphospedagem.model.Casa;
import br.edu.infnet.apphospedagem.model.LocalImovel;

@Order(1)
@Component
public class CasaLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Map<Integer, Casa> mapaCasa = new HashMap<Integer, Casa>();

		FileReader file = new FileReader("arquivos/casa.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();
		String[] campos = null;

		while (linha != null) {
			campos = linha.split(";");

			Casa casa = new Casa();
			casa.setId(Integer.valueOf(campos[0]));
			casa.setLocalImovel(new LocalImovel(Integer.valueOf(campos[1]), campos[2], campos[3]));
			casa.setCodTipoLocal(TipoCodLocalEnum.valueOf(campos[4]));
			casa.setQtdQuartos(Integer.valueOf(campos[5]));
			casa.setQtdBanheiros(Integer.valueOf(campos[6]));
			casa.setBolPossuiPiscina(Boolean.valueOf(campos[7]));
			casa.setRua(campos[8]);
			casa.setNumero(Integer.valueOf(campos[9]));
			casa.setAreaUtil(Integer.valueOf(campos[10]));
			casa.setValorDiaria(Double.valueOf(campos[11]));

			mapaCasa.put(casa.getId(), casa);

			linha = leitura.readLine();
		}

		for (Integer k : mapaCasa.keySet()) {
			System.out.println("[Casa] inclusão realizada com sucesso: " + mapaCasa.get(k));
		}

		leitura.close();

	}

}
