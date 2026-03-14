package br.com.fiapride.model;

public class Caderno {
	
	// Características:
	private String tituloCapa;
	private int marcaPagina;
	private int totalFolhas;
	
	// Inicialização dos Cadernos:
	public Caderno(String tituloCapa, int marcaPagina, int totalFolhas) {
		this.setTituloCapa(tituloCapa);
		this.setMarcaPagina(marcaPagina);
		this.setTotalFolhas(totalFolhas);
	}
	
	// Setters:
	private void setTituloCapa(String titulo) {
		this.tituloCapa = titulo;
	}
	
	private void setMarcaPagina(int paginaMarcada) {
		if (paginaMarcada <= 0) {
			System.out.println("Erro: A página deve ser marcada em um número maior que 0!");
			return;
		}
		
		this.marcaPagina = paginaMarcada;
	}
	
	private void setTotalFolhas(int folhas) {
		if (folhas <= 0) {
			System.out.println("Erro: A quantidade de folhas deve ser maior que 0!");
			return;
		}
		
		this.totalFolhas = folhas;
	}
	
	// Getter:
	public String getTituloCapa() {
		return this.tituloCapa;
	}
	
	public int getMarcaPagina() {
		return this.marcaPagina;
	}
	
	public int getTotalFolhas() {
		return this.totalFolhas;
	}
	
	// Métodos:
	public void arrancarFolhas(int paginasArrancadas) {
		if(totalFolhas < paginasArrancadas) {
			System.out.println("Erro: Não tem folhas o suficiente para arrancar.");
		
			return;
		}
		this.totalFolhas = this.totalFolhas - paginasArrancadas;
		
		System.out.println("Você arrancou o total de " + this.totalFolhas + " Folhas deste caderno");
	}
	
	public void mudarMarcaPagina(int novaPaginaMarcada) {
		if(totalFolhas < novaPaginaMarcada) {
			System.out.println("Erro: Essa página não existe.");
		
			return;
		}
		
		System.out.println("Você botou o marca-página na folha " + novaPaginaMarcada);
	}

}

