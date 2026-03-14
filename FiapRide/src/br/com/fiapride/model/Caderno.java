package br.com.fiapride.model;

public class Caderno {
	// Características:
	public String tituloCapa;
	public int marcaPagina;
	public int totalFolhas;
	
	// Inicialização dos Cadernos:
	public Caderno(String tituloCapa, int marcaPagina, int totalFolhas) {
		this.tituloCapa = tituloCapa;
		this.marcaPagina = marcaPagina;
		this.totalFolhas = totalFolhas;
	}
	
	// Métodos:
	public void arrancarFolhas(int paginasArrancadas) {
		if(totalFolhas < paginasArrancadas) {
			System.out.println("Não tem folhas o suficiente para arrancar.");
		
			return;
		}
		this.totalFolhas = this.totalFolhas - paginasArrancadas;
		
		System.out.println("Você arrancou o total de " + this.totalFolhas + " Folhas deste caderno");
	}
	
	public void mudarMarcaPagina(int novaPaginaMarcada) {
		if(totalFolhas < novaPaginaMarcada) {
			System.out.println("Essa página não existe.");
		
			return;
		}
		
		System.out.println("Você botou o marca-página na folha " + novaPaginaMarcada);
	}
}

