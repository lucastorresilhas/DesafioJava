package br.com.totvs.desafio.dtos;

public class FazendaRequest {

	private String nome;
	private String cnpj;
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
	
	@Override
	public String toString() {
		return "A fazenda " + nome + " tem o CNPJ: " + cnpj;
	}
}
