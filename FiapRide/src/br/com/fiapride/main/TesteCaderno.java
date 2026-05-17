package br.com.fiapride.main;

// Imporatando a classe:
import br.com.fiapride.model.Autor;
import br.com.fiapride.model.HQ;
import br.com.fiapride.model.LivroContos;

public class TesteCaderno {

	public static void main(String[] args) {
		// Criando alguns Objetos da classe Autor, HQ e LivroContos:
		Autor McFarlane = new Autor("Todd McFarlane", "CA", 1961);
		HQ SpawnV1 = new HQ("Spawn Origens - Volume 1", 87, 176, McFarlane, true);

		Autor FranzKafka = new Autor("Franz Kafka", "AU", 1883);
		LivroContos ContosEscolhidos = new LivroContos("Contos Escolhidos", 47, 288, FranzKafka, 11);

		// Resumos
		SpawnV1.exibirResumo();
		ContosEscolhidos.exibirResumo();

		// Testando se a HQ é colorida:
		if(SpawnV1.isColorido()){
			System.out.println("A HQ "+ SpawnV1.getTituloCapa()+" é colorida!");
		} else{
			System.out.println("A HQ "+ SpawnV1.getTituloCapa()+" não é colorida!");
		}

		// Vendo a quantidade de contos:
		System.out.println("A quantidade de contos do livro "+ ContosEscolhidos.getTituloCapa()+ " é de "+ ContosEscolhidos.getQuantidadeDeContos()+" contos.");
	}

}
