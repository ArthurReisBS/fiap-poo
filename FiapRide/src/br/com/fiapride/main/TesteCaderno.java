package br.com.fiapride.main;

// Imporatando a classe:
import br.com.fiapride.model.Caderno;
import br.com.fiapride.model.Autor;

public class TesteCaderno {

	public static void main(String[] args) {
		// Criando alguns Objetos da classe Autor e Caderno:
		Autor tioBob = new Autor("Robert Cecil Martin", "EUA", 1952);
		Caderno cleanCode = new Caderno("Código Limpo", 230, 440, tioBob);
		
		// Testando alguns métodos:
		
		
		// Resumo
		cleanCode.exibirResumo();
		
		// Adicionando o numero de cadernos escritos pelo Autor
		System.out.println("Número de cadernos publicados pelo autor "+ tioBob.getNome()+ ": "+ tioBob.getCadernosPublicados()); // Primeiro printando sem adicionar nada
		
		tioBob.adicionarAutoriaDeCadernos(1);
		System.out.println("Número de cadernos publicados pelo autor "+ tioBob.getNome()+ ": "+ tioBob.getCadernosPublicados());
		
	}

}
