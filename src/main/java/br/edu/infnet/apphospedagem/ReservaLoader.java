package br.edu.infnet.apphospedagem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.apphospedagem.enuns.TipoCodLocalEnum;
import br.edu.infnet.apphospedagem.model.Apartamento;
import br.edu.infnet.apphospedagem.model.Casa;
import br.edu.infnet.apphospedagem.model.Chale;
import br.edu.infnet.apphospedagem.model.LocalImovel;
import br.edu.infnet.apphospedagem.model.Reserva;
import br.edu.infnet.apphospedagem.model.Solicitante;
import br.edu.infnet.apphospedagem.model.TipologiaImovel;

@Order(6)
@Component
public class ReservaLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Map<Integer, Reserva> mapaReserva = new HashMap<Integer, Reserva>();

		FileReader file = new FileReader("arquivos/reserva.txt");
		BufferedReader leitura = new BufferedReader(file);

		String linha = leitura.readLine();

		String[] campos = null;

		Reserva reserva = null;

		while (linha != null) {
			campos = linha.split(";");

			switch (campos[0]) {
			case "R":

				reserva = new Reserva(Integer.valueOf(campos[1]), new Solicitante(campos[2], campos[3], campos[4]),
						new ArrayList<TipologiaImovel>());

				mapaReserva.put(reserva.getId(), reserva);

				break;

			case "CA":
				Casa casa = new Casa();
				casa.setId(Integer.valueOf(campos[1]));
				casa.setLocalImovel(new LocalImovel(Integer.valueOf(campos[2]), campos[3], campos[4]));
				casa.setCodTipoLocal(TipoCodLocalEnum.valueOf(campos[5]));
				casa.setQtdQuartos(Integer.valueOf(campos[6]));
				casa.setQtdBanheiros(Integer.valueOf(campos[7]));
				casa.setBolPossuiPiscina(Boolean.valueOf(campos[8]));
				casa.setRua(campos[9]);
				casa.setNumero(Integer.valueOf(campos[10]));
				casa.setAreaUtil(Integer.valueOf(campos[11]));
				casa.setValorDiaria(Double.valueOf(campos[12]));

				reserva.getTipologiaImovel().add(casa);

				break;

			case "CH":

				Chale chale = new Chale();
				chale.setId(Integer.valueOf(campos[1]));
				chale.setLocalImovel(new LocalImovel(Integer.valueOf(campos[2]), campos[3], campos[4]));
				chale.setCodTipoLocal(TipoCodLocalEnum.valueOf(campos[5]));
				chale.setQtdQuartos(Integer.valueOf(campos[6]));
				chale.setQtdBanheiros(Integer.valueOf(campos[7]));
				chale.setRua(campos[8]);
				chale.setNumero(Integer.valueOf(campos[9]));
				chale.setAreaUtil(Integer.valueOf(campos[10]));
				chale.setValorDiaria(Double.valueOf(campos[11]));

				reserva.getTipologiaImovel().add(chale);

				break;

			case "AP":

				Apartamento apartamento = new Apartamento();
				apartamento.setId(Integer.valueOf(campos[1]));
				apartamento.setLocalImovel(new LocalImovel(Integer.valueOf(campos[2]), campos[4], campos[5]));
				apartamento.setCodTipoLocal(TipoCodLocalEnum.valueOf(campos[5]));
				apartamento.setQtdQuartos(Integer.valueOf(campos[6]));
				apartamento.setQtdBanheiros(Integer.valueOf(campos[7]));
				apartamento.setBloco(campos[8]);
				apartamento.setNumeroAndar(Integer.valueOf(campos[9]));
				apartamento.setAreaUtil(Integer.valueOf(campos[10]));
				apartamento.setValorDiaria(Double.valueOf(campos[11]));

				reserva.getTipologiaImovel().add(apartamento);

				break;

			default:
				break;
			}

			linha = leitura.readLine();
		}

		for (Reserva r : mapaReserva.values()) {
			System.out.println("[Reserva] Inclusão realizada com sucesso: " + r);
		}

		leitura.close();
	}

}
