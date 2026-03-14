package br.com.fiapride.main;

// Imporatando a classe:
import br.com.fiapride.model.Caderno;

public class TesteCaderno {

	public static void main(String[] args) {
		// O comando "new" aloca memória para um novo Objeto no programa.
		
		// Criando alguns Objetos da classe Caderno:
		Caderno cadernoID01 = new Caderno("Uma Jornada no Escuro", 418, 543);
		Caderno cadernoID02 = new Caderno("Caderno de Estudos - Fiap", 19, 246);
		Caderno cadernoID03 = new Caderno("Caderno de Desenhos", 18, 342);
		Caderno cadernoID04 = new Caderno("Diario", 33, 295);
		
		// Tentando burlar as regras:
		//cadernoID01.totalFolhas = 10; (da erro)
		
		//cadernoID01.setTotalFolhas(20); (também da erro)
		
		// Printando esses objetos e suas características, e testando os novos métodos em cada um:
		System.out.println("---- Cadernos ----");
		System.out.println("Caderno: " + cadernoID01.getTituloCapa() + " | Marca página: " + cadernoID01.getMarcaPagina() + " | Total de folhas: " + cadernoID01.getTotalFolhas());
		cadernoID01.arrancarFolhas(3400);
		System.out.println("Caderno: " + cadernoID02.getTituloCapa() + " | Marca página: " + cadernoID02.getMarcaPagina() + " | Total de folhas: " + cadernoID02.getTotalFolhas());
		cadernoID02.mudarMarcaPagina(5400);
		System.out.println("Caderno: " + cadernoID03.getTituloCapa() + " | Marca página: " + cadernoID03.getMarcaPagina() + " | Total de folhas: " + cadernoID03.getTotalFolhas());
		cadernoID03.arrancarFolhas(67);
		System.out.println("Caderno: " + cadernoID04.getTituloCapa() + " | Marca página: " + cadernoID04.getMarcaPagina() + " | Total de folhas: " + cadernoID04.getTotalFolhas());
		cadernoID04.mudarMarcaPagina(123);
		
	}

}
