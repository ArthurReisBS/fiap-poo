package br.com.fiapride.main;

// Imporatando a classe:
import br.com.fiapride.model.Caderno;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// O comando "new" aloca memória para um novo Objeto no programa.
		
		// Criando alguns Objetos da classe Caderno:
		Caderno caderno1 = new Caderno();
		caderno1.tituloCapa = "Uma Jornada no Escuro";
		caderno1.marcaPagina = 418;
		caderno1.totalFolhas = 543;
		
		Caderno caderno2 = new Caderno();
		caderno2.tituloCapa = "Caderno de Estudos - Fiap";
		caderno2.marcaPagina = 19;
		caderno2.totalFolhas = 246;
		
		Caderno caderno3 = new Caderno();
		caderno3.tituloCapa = "Caderno de Desenhos";
		caderno3.marcaPagina = 18;
		caderno3.totalFolhas = 342;
		
		Caderno caderno4 = new Caderno();
		caderno4.tituloCapa = "Diario";
		caderno4.marcaPagina = 33;
		caderno4.totalFolhas = 295;
		
		// Printando esses objetos e suas características:
		System.out.println("---- Cadernos ----");
		System.out.println("Caderno: " + caderno1.tituloCapa + " | Marca página: " + caderno1.marcaPagina + " | Total de folhas: " + caderno1.totalFolhas);
		System.out.println("Caderno: " + caderno2.tituloCapa + " | Marca página: " + caderno2.marcaPagina + " | Total de folhas: " + caderno2.totalFolhas);
		System.out.println("Caderno: " + caderno3.tituloCapa + " | Marca página: " + caderno3.marcaPagina + " | Total de folhas: " + caderno3.totalFolhas);
		System.out.println("Caderno: " + caderno4.tituloCapa + " | Marca página: " + caderno4.marcaPagina + " | Total de folhas: " + caderno4.totalFolhas);
		
		// Testando as funções:
		caderno1.arrancarFolhas(34);
		caderno3.arrancarFolhas(67);
		
		caderno2.mudarMarcaPagina(54);
		caderno4.mudarMarcaPagina(123);
		
		System.out.println("---- Modificações ----");
		System.out.println("Caderno: " + caderno1.tituloCapa + " | Marca página: " + caderno1.marcaPagina + " | Total de folhas: " + caderno1.totalFolhas);
		System.out.println("Caderno: " + caderno2.tituloCapa + " | Marca página: " + caderno2.marcaPagina + " | Total de folhas: " + caderno2.totalFolhas);
		System.out.println("Caderno: " + caderno3.tituloCapa + " | Marca página: " + caderno3.marcaPagina + " | Total de folhas: " + caderno3.totalFolhas);
		System.out.println("Caderno: " + caderno4.tituloCapa + " | Marca página: " + caderno4.marcaPagina + " | Total de folhas: " + caderno4.totalFolhas);

	}

}
