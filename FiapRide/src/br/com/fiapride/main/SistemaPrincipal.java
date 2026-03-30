package br.com.fiapride.main;

// Imporatando a classe:
import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// Alocando a memória para os passagerios:
		Passageiro passageiroID01 = new Passageiro("Marie Curie", "123.456.789-01");
		Passageiro passageiroID02 = new Passageiro("Albert Einstein", "234.567.890-12");
		Passageiro passageiroID03 = new Passageiro("Ada Lovelace", "345.678.901-23");
		Passageiro passageiroID04 = new Passageiro("Isaac Newton", "456.789.012-34");
		
		// Alocando a memória para os veículos:
		Veiculo carroID01 = new Veiculo("ABC-1234", "Toyota Corolla");
		Veiculo carroID02 = new Veiculo("DEF-5678", "Fiat Uno");
		
		// Recargas:
		System.out.printf("\n--- Adicionando saldo a todos os passageiros: ---\n");
		passageiroID01.adicionarSaldo(1934.66);
		passageiroID02.adicionarSaldo(1955.76);
		passageiroID03.adicionarSaldo(1852.36);
		passageiroID04.adicionarSaldo(1727.84);
		
		// Informações dos passageiros:
		System.out.println("\n--- Sistema FiapRide ---");
		System.out.println("Passageiro: " + passageiroID01.getNome() + " | Saldo: R$ " + passageiroID01.getSaldo() + " | CPF: " + passageiroID01.getCpf());
		System.out.println("Passageiro: " + passageiroID02.getNome() + " | Saldo: R$ " + passageiroID02.getSaldo() + " | CPF: " + passageiroID02.getCpf());
		System.out.println("Passageiro: " + passageiroID03.getNome() + " | Saldo: R$ " + passageiroID03.getSaldo() + " | CPF: " + passageiroID03.getCpf());
		System.out.println("Passageiro: " + passageiroID04.getNome() + " | Saldo: R$ " + passageiroID04.getSaldo() + " | CPF: " + passageiroID04.getCpf());
	
		// Pagando as viagens:
		double passagem = 449.99;
		
		System.out.printf("\n--- Passageiros pagando suas respectivas viagens: ---\n");
		passageiroID01.pagarViagem(passagem);
		passageiroID02.pagarViagem(passagem);
		passageiroID03.pagarViagem(passagem);
		passageiroID04.pagarViagem(passagem);
		
		
	}
}
