package br.com.fiapride.model;

public class Caderno {
	
	// Características:
	private String tituloCapa;
	private int marcaPagina;
	private int totalFolhas;
	
	// Atributos de associação:
	private Autor escritor;
	
	// Inicialização dos Cadernos:
	public Caderno(String tituloCapa, int marcaPagina, int totalFolhas, Autor escritor) {
		this.setTituloCapa(tituloCapa);
		this.setMarcaPagina(marcaPagina);
		this.setTotalFolhas(totalFolhas);
		
		this.escritor = escritor;
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
	
	public void exibirResumo() {
		System.out.println("\n --- RESUMO DO CADERNO ---");
		System.out.println("Caderno: "+ this.tituloCapa);
		System.out.println("Folhas: "+ this.totalFolhas);
		
		// Navegando entre objetos:
		System.out.println("Nome do escritor: "+ this.escritor.getNome());
		System.out.println("Nacionalidade do escritor: "+ this.escritor.getNacionalidade());
		System.out.println("Ano de nascimento do escritor: "+ this.escritor.getAnoNascimento());
		System.out.println("-----------------------\n");
	}

}

