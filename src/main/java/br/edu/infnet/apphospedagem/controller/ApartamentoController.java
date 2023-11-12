package br.edu.infnet.apphospedagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.apphospedagem.enuns.TipoCodLocalEnum;
import br.edu.infnet.apphospedagem.model.Apartamento;
import br.edu.infnet.apphospedagem.model.LocalImovel;
import br.edu.infnet.apphospedagem.model.Usuario;
import br.edu.infnet.apphospedagem.service.ApartamentoService;
import br.edu.infnet.apphospedagem.service.LocalImovelService;

@Controller
public class ApartamentoController {
	
	@Autowired
	private ApartamentoService apartamentoService;

	@Autowired
	private LocalImovelService localImovelService;

	@GetMapping(value = "/apartamento/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaApartamento", apartamentoService.obterLista(usuario));

		return "apartamento/lista";
	}

	@GetMapping(value = "/apartamento/cadastro")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaLocalImovel", localImovelService.obterLista(usuario));

		return "apartamento/cadastro";
	}

	@PostMapping(value = "/apartamento/incluir")
	public String incluir(Apartamento apartamento, LocalImovel localImovel, @SessionAttribute("user") Usuario usuario) {
		apartamento.setUsuario(usuario);
		apartamento.setLocalImovel(localImovel);
		apartamento.setCodTipoLocal(TipoCodLocalEnum.APARTAMENTO);
		apartamentoService.incluir(apartamento);
		return "redirect:/apartamento/lista";
	}

	@GetMapping(value = "/apartamento/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		apartamentoService.excluir(id);

		return "redirect:/apartamento/lista";
	}
}
