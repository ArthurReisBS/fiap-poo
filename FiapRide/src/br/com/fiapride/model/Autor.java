package br.com.fiapride.model;

public class Autor {
	// Características:
	private String nome;
	private String nacionalidade;
	private int anoNascimento;
	private int cadernosPublicados = 0;
	
	public Autor(String nome, String nacionalidade, int anoNascimento){
		if (1 < anoNascimento && anoNascimento < 2027) {	
				this.anoNascimento = anoNascimento;
			} else {
				System.out.println("Erro: coloque um ano de nascimento válido (entre o ano 1 e 2027)!");
				return;
			}
		
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		
		System.out.println("Autor cadastrado com sucesso!");
	}
	// Métodos:
	
	public int adicionarAutoriaDeCadernos (int numeroDeNovosCadernos) {
		if (numeroDeNovosCadernos <= 0) {
			System.out.println("Erro: Número inválido de cadernos para adicionar às publicações do autor!");
			return this.cadernosPublicados;
		}cadernosPublicados += numeroDeNovosCadernos;
		return cadernosPublicados;
	}
	
	
	// Getters:
	
	public String getNome() {
		return this.nome;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public int getAnoNascimento() {
		return this.anoNascimento;
	}
	
	public int getCadernosPublicados() {
		return this.cadernosPublicados;
	}
}
