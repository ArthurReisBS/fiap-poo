package br.com.fiapride.main;

// Imporatando as classes:
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;
import br.com.fiapride.model.Viagem;

public class SistemaPrincipal {

	public static void main(String[] args) {
		System.out.println("---- FIAPRIDE: Inicializando Sistema ----");
		
		// Alocando a memória para os objetos utilizados na viagem:
		Passageiro passageiroID01 = new Passageiro("Marie Curie", "123.456.789-01");
		Veiculo carroID01 = new Veiculo("ABC-1234", "Toyota Corolla");
		
		// Criando a viagem:
		Viagem viagemID01 = new Viagem("Avenida Paulista, 1000", passageiroID01, carroID01);
		
		// Exibindo resumo da viagem:
		viagemID01.exibirResumo();
		
		// Testando se o saldo adicionado no meio da viagem é contabilizado pelo sistema:
		passageiroID01.adicionarSaldo(50);
		System.out.println("Saldo da Ana consultado ATRAVÉS da Viagem: R$ "+ viagemID01.getSolicitante().getSaldo());
	}
}
