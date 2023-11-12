package br.edu.infnet.apphospedagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.apphospedagem.enuns.TipoCodLocalEnum;
import br.edu.infnet.apphospedagem.model.Casa;
import br.edu.infnet.apphospedagem.model.LocalImovel;
import br.edu.infnet.apphospedagem.model.Usuario;
import br.edu.infnet.apphospedagem.service.CasaService;
import br.edu.infnet.apphospedagem.service.LocalImovelService;

@Controller
public class CasaController {

	@Autowired
	private CasaService casaService;

	@Autowired
	private LocalImovelService localImovelService;

	@GetMapping(value = "/casa/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaCasa", casaService.obterLista(usuario));

		return "casa/lista";
	}

	@GetMapping(value = "/casa/cadastro")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaLocalImovel", localImovelService.obterLista(usuario));

		return "casa/cadastro";
	}

	@PostMapping(value = "/casa/incluir")
	public String incluir(Casa casa, LocalImovel localImovel, @SessionAttribute("user") Usuario usuario) {
		casa.setUsuario(usuario);
		casa.setLocalImovel(localImovel);
		casa.setCodTipoLocal(TipoCodLocalEnum.CASA);
		casaService.incluir(casa);
		return "redirect:/casa/lista";
	}

	@GetMapping(value = "/casa/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {

		casaService.excluir(id);

		return "redirect:/casa/lista";
	}
}
