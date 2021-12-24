package br.com.totvs.desafio.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.totvs.desafio.dtos.FazendaRequest;
import br.com.totvs.desafio.models.Fazenda;
import br.com.totvs.desafio.repositorys.FazendaRepository;

@Service
public class FazendaService {

	@Autowired
	private FazendaRepository fazendaRepository;
	
	public void cadastrarFazenda(FazendaRequest fazendaRequest) {
		fazendaRepository.save(retornaEntidade(fazendaRequest));
	}

	private Fazenda retornaEntidade(FazendaRequest fazendaRequest) {
		return new Fazenda(fazendaRequest);
	}

	public Fazenda buscarFazenda(Long id) {
		Optional<Fazenda> fazenda = fazendaRepository.findById(id);
		if(fazenda.isPresent()) {
			return fazenda.get();
		}
		return null;
	}
}
