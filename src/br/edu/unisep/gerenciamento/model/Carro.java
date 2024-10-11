package br.edu.unisep.gerenciamento.model;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String exibirDetalhes() {
        return "Carro: " + marca + " " + modelo + ", Ano: " + ano + ", Portas: " + numeroPortas;
    }
}
