package br.com.totvs.desafio.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.totvs.desafio.models.Fazenda;

@Repository
public interface FazendaRepository extends JpaRepository<Fazenda, Long>{

}
