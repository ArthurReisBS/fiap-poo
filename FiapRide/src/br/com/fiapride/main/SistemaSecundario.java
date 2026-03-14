package br.com.fiapride.main;

// Imporatando a classe:
import br.com.fiapride.model.Caderno;

public class SistemaSecundario {

	public static void main(String[] args) {
		// O comando "new" aloca memória para um novo Objeto no programa.
		
		// Criando alguns Objetos da classe Caderno:
		Caderno cadernoID01 = new Caderno("Uma Jornada no Escuro", 418, 543);
		Caderno cadernoID02 = new Caderno("Caderno de Estudos - Fiap", 19, 246);
		Caderno cadernoID03 = new Caderno("Caderno de Desenhos", 18, 342);
		Caderno cadernoID04 = new Caderno("Diario", 33, 295);
		
		// Printando esses objetos e suas características, e testando os novos métodos em cada um:
		System.out.println("---- Cadernos ----");
		System.out.println("Caderno: " + cadernoID01.tituloCapa + " | Marca página: " + cadernoID01.marcaPagina + " | Total de folhas: " + cadernoID01.totalFolhas);
		cadernoID01.arrancarFolhas(3400);
		System.out.println("Caderno: " + cadernoID02.tituloCapa + " | Marca página: " + cadernoID02.marcaPagina + " | Total de folhas: " + cadernoID02.totalFolhas);
		cadernoID02.mudarMarcaPagina(5400);
		System.out.println("Caderno: " + cadernoID03.tituloCapa + " | Marca página: " + cadernoID03.marcaPagina + " | Total de folhas: " + cadernoID03.totalFolhas);
		cadernoID03.arrancarFolhas(67);
		System.out.println("Caderno: " + cadernoID04.tituloCapa + " | Marca página: " + cadernoID04.marcaPagina + " | Total de folhas: " + cadernoID04.totalFolhas);
		cadernoID04.mudarMarcaPagina(123);
		
	}

}
