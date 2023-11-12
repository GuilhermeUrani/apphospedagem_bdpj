package br.edu.infnet.apphospedagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.apphospedagem.enuns.TipoCodLocalEnum;
import br.edu.infnet.apphospedagem.model.Chale;
import br.edu.infnet.apphospedagem.model.LocalImovel;
import br.edu.infnet.apphospedagem.model.Usuario;
import br.edu.infnet.apphospedagem.service.ChaleService;
import br.edu.infnet.apphospedagem.service.LocalImovelService;

@Controller
public class ChaleController {

	@Autowired
	private ChaleService chaleService;

	@Autowired
	private LocalImovelService localImovelService;

	@GetMapping(value = "/chale/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaChale", chaleService.obterLista(usuario));

		return "chale/lista";
	}

	@GetMapping(value = "/chale/cadastro")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaLocalImovel", localImovelService.obterLista(usuario));

		return "chale/cadastro";
	}

	@PostMapping(value = "/chale/incluir")
	public String incluir(Chale chale, LocalImovel localImovel, @SessionAttribute("user") Usuario usuario) {
		chale.setUsuario(usuario);
		chale.setLocalImovel(localImovel);
		chale.setCodTipoLocal(TipoCodLocalEnum.CHALE);
		chaleService.incluir(chale);
		return "redirect:/chale/lista";
	}

	@GetMapping(value = "/chale/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		chaleService.excluir(id);

		return "redirect:/chale/lista";
	}
}
