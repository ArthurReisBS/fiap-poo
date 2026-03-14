package br.com.fiapride.model;

public class Passageiro {

	// Atributos do passageiro:
	public String nome;
	public String cpf;
	public double saldo;
	
	// Inicialização dos Passageiros:
	public Passageiro(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = 0.0;
	}
		// Métodos do passageiro:
		public void adicionarSaldo(double valorCreditado) {
			if (valorCreditado <= 0) {
				System.out.println("Erro: O saldo adicionado deve ser maior que 0!");
				return;
			}
			
			saldo += valorCreditado;
			System.out.printf("Novo saldo de %s: R$ %.2f\n", nome, saldo);
		}
		
		public void pagarViagem(double custoViagem) {
			if (custoViagem <= 0) {
				System.out.println("Erro: O valor da viagem deve ser maior que 0!");
				return;
			} else if (custoViagem > saldo) {
				System.out.println("Erro: Saldo insuficiente! Seru saldo: R$ "+ saldo);
				return;
			}
			
			saldo -= custoViagem;
			System.out.printf("Viagem paga com sucesso! novo saldo de %s: R$ %.2f\n", nome, saldo);
		}	
}
