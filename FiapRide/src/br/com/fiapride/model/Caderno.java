package br.com.fiapride.model;

public class Caderno {
	// Características:
	public String tituloCapa;
	public int marcaPagina;
	public int totalFolhas;
	
	public int arrancarFolhas(int paginasArrancadas) {
		return this.totalFolhas = this.totalFolhas - paginasArrancadas;
	}
	
	public int mudarMarcaPagina(int novaPaginaMarcada) {
		return this.marcaPagina = novaPaginaMarcada;
	}
}
