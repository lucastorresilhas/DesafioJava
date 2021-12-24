package br.com.totvs.desafio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.totvs.desafio.dtos.FazendaRequest;
import br.com.totvs.desafio.dtos.FazendaResponse;
import br.com.totvs.desafio.models.Fazenda;
import br.com.totvs.desafio.services.FazendaService;

@RestController
@RequestMapping("/fazenda")
public class FazendaController {
	
	@Autowired
	private FazendaService fazendaService;
	
	@GetMapping
	public List<FazendaResponse> buscarPaginado() {
		return null;
	}
	
	@GetMapping("/{id}")
	public Fazenda buscarFazenda(@PathVariable Long id) {
		return fazendaService.buscarFazenda(id);
	}
	
	@PostMapping
	public void criarFazenda(@RequestBody FazendaRequest fazendaRequest) {
		this.fazendaService.cadastrarFazenda(fazendaRequest);
	}
	
	@PutMapping("/{id}")
	public void atualizarNomeFazenda(@PathVariable Long id,@RequestBody FazendaRequest fazendaRequest) {

	}

	@DeleteMapping("/{id}")
	public void deletarFazenda(@PathVariable Long id) {

	}
}