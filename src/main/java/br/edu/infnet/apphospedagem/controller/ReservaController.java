package br.edu.infnet.apphospedagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.apphospedagem.model.Reserva;
import br.edu.infnet.apphospedagem.model.TipologiaImovel;
import br.edu.infnet.apphospedagem.model.Usuario;
import br.edu.infnet.apphospedagem.service.ReservaService;
import br.edu.infnet.apphospedagem.service.SolicitanteService;
import br.edu.infnet.apphospedagem.service.TipologiaImovelService;

@Controller
public class ReservaController {

	@Autowired
	private ReservaService reservaService;
	@Autowired
	private SolicitanteService solicitanteService;
	
	@Autowired
	private TipologiaImovelService tipologiaImovelService;

	@GetMapping(value = "/reserva")
	public String telaCadastro(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("solicitantes", solicitanteService.obterLista(usuario));

		model.addAttribute("tipologiaImoveis", tipologiaImovelService.obterLista(usuario));
		
		return "reserva/cadastro";
	}
	
	@GetMapping(value = "/reserva/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {
		model.addAttribute("listagem", reservaService.obterLista(usuario));
		
		model.addAttribute("tipologiaImoveis", reservaService.obterLista(usuario));
		return "reserva/lista";
	}
	
	@PostMapping(value = "/reserva/incluir")
	public String incluir(Reserva reserva, @SessionAttribute("user") Usuario usuario ) {
		
		
		reserva.setUsuario(usuario);
		reservaService.incluir(reserva);
		
		return "redirect:/reserva/lista";
	}

	@GetMapping(value = "/reserva/{id}/excluir")
	public String excluir(@PathVariable Integer id) {

		reservaService.excluir(id);
		
		return "redirect:/reserva/lista";
	}
	
	public void calcularValorTotal() {
		
	}
}
