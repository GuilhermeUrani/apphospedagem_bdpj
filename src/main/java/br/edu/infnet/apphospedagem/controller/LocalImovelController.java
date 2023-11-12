package br.edu.infnet.apphospedagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.edu.infnet.apphospedagem.model.LocalImovel;
import br.edu.infnet.apphospedagem.model.Usuario;
import br.edu.infnet.apphospedagem.repository.LocalImovelRepository;
import br.edu.infnet.apphospedagem.service.LocalImovelService;

@SessionAttributes("username")
@Controller
public class LocalImovelController {

	@Autowired
	private LocalImovelService localImovelService;
	
	@Autowired
	private LocalImovelRepository localImovelRepository;
	
	
	@GetMapping(value = "/localImovel/lista")
	public String telaLista(Model model, @SessionAttribute("user") Usuario usuario) {

		model.addAttribute("listaLocalImovel", localImovelService.obterLista(usuario));
		
		return "localImovel/lista";
	}

	@GetMapping(value = "/localImovel/cadastro")
	public String telaCadastro() {

		return "localImovel/cadastro";
	}

	@PostMapping(value = "/localImovel/incluir")
	public String incluir(LocalImovel localImovel, @SessionAttribute("user") Usuario usuario) {
		
		localImovel.setUsuario(usuario);
		
		localImovelService.incluir(localImovel);
		
		return "redirect:/localImovel/lista";
	}
	
	@GetMapping(value = "/localImovel/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		
		localImovelService.excluir(id);

		return "redirect:/localImovel/lista";
	}
	
	@GetMapping(value = "/localImovel/{id}/obterPorId")
	public String obterPorId() {
	
		return "localImovel/alterar";
	}
	
	@PostMapping(value = "/localImovel/{id}/alterar")
	public String alterar(@PathVariable Integer id, @RequestBody LocalImovel localImovel) {
		
		localImovelRepository.findById(id);
		localImovel.setDescEndereco(localImovel.getDescEndereco());
		localImovel.setDescLocalImovel(localImovel.getDescLocalImovel());
		localImovelService.alterar(localImovel);

		return "redirect:/localImovel/lista";
	}
}
