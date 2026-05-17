package br.com.fiapride.model;

public class Carro extends Veiculo{
    
    private int capacidadePassageiros;

    public Carro(String placa, String modelo, int capacidadePassageiros){
        super(placa, modelo);

        this.setCapacidadePassageiros(capacidadePassageiros);
    }

    // Getters e Setters:
    public int getCapacidadePassageiros(){
        return this.capacidadePassageiros;
    }

    private void setCapacidadePassageiros(int capacidadePassageiros){
        this.capacidadePassageiros = capacidadePassageiros;
    }
}
