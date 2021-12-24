package br.com.totvs.desafio.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import br.com.totvs.desafio.dtos.FazendaRequest;

@Entity
public class Fazenda {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String cnpj;
	@OneToOne(fetch = FetchType.EAGER)
	private Endereco endereco;
	
	public Fazenda() {
	}
	
	public Fazenda(FazendaRequest fazendaRequest) {
		this.nome = fazendaRequest.getNome();
		this.cnpj = fazendaRequest.getCnpj();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
