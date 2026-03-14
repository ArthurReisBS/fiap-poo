package br.com.fiapride.model;

public class Passageiro {

	// Atributos do passageiro:
	private String nome;
	private String cpf;
	private double saldo;
	
	// Inicialização dos Passageiros:
	public Passageiro(String nome, String cpf) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setSaldo(0);
	}
	
	// Setters:
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	private void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	private void setSaldo(double valor) {
		if (valor < 0) {
			System.out.println("Erro: não é possível alterar o saldo para um valor negativo!");
			return;
		} 
		
		this.saldo = valor;
	}
	
	// Getters:
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSaldo() {
		return this.saldo;
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
