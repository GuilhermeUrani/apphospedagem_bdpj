package br.edu.infnet.apphospedagem;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(7)
@Component
public class MapLoader implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {

//		Solicitante s1 = new Solicitante("maria", "111", "maira@");
//		Solicitante s2 = new Solicitante("jose", "222", "jose@");
//
//		Map<String, Solicitante> mapa = new HashMap<String, Solicitante>();
//		mapa.put("1", s1);
//		mapa.put("2", s2);
//
//		for (String k : mapa.keySet()) {
//			System.out.println("key: " + k);
//		}
//
//		for (Solicitante v : mapa.values()) {
//			System.out.println("value: " + v.getCpf());
//		}
//
//		System.out.println("keyset" + mapa.keySet());
//		System.out.println("values" + mapa.values());
//		System.out.println("get" + mapa.get("1"));
	}

}
