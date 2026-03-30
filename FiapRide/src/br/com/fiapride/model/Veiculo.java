package br.com.fiapride.model;

public class Veiculo {
	
	// Atributos:
	private String placa;
	private String modelo;
	
	// Construtor:
	public Veiculo(String placa, String modelo) {
		// Utilizando setters para validações no nascimento do objeto:
		this.setPlaca(placa);
		this.modelo = modelo;
		
		System.out.println("Registro inicial: Um"+ this.modelo +" nasceu com a placa "+ this.placa);
	}
	
	// Getters:
	public String getPlaca() {
		return this.placa;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	// Métodos:
	public void atualizarPlaca(String novaPlaca) {
		System.out.println("Solicitada atualização de placa no Dentran para o veículo "+ this.modelo + "...");
		this.setPlaca(novaPlaca);
	}
	
	// Setters:
	private void setPlaca(String novaPlaca) {
		// Regra de negócio: a placa não pode ser nula nem vazia:
		if (novaPlaca != null && !novaPlaca.trim().isEmpty()) {
			this.placa = novaPlaca;
			System.out.println("Sucesso: A placa agora é "+ this.placa);
		} else {
			System.out.println("Erro de validação: A placa informada é inválida!");
		}
	}
	
	// Como o modelo do carro é imutável, ele não precisa de um "setter" próprio.
}
