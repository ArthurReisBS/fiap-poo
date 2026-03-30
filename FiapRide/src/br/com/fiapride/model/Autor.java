package br.com.fiapride.model;

public class Autor {
	// Características:
	private String nome;
	private String nacionalidade;
	private int anoNascimento;
	private int cadernosPublicados;
	
	Autor(String nome, String nacionalidade, int anoNascimento){
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setAnoNascimento(anoNascimento);
	}
	// Métodos:
	
	
	
	// Getters e Setters:
	
	public String getNome() {
		return this.nome;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public int getAnoNascimento() {
		return this.anoNascimento;
	}
	
	public int setCadernosPublicados() {
		return this.cadernosPublicados;
	}
	
	private void setNome(String nome) {
			this.nome = nome;
	}
	
	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	private void setAnoNascimento(int anoNascimento) {
		if (1 < anoNascimento && anoNascimento < 2027) {	
			this.anoNascimento = anoNascimento;
			return;
		}
		System.out.println("Erro: coloque um ano de nascimento válido (entre o ano 1 e 2027)!");
	}
}
