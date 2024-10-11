package br.edu.unisep.gerenciamento.model;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public String exibirDetalhes() {
        return "Moto: " + marca + " " + modelo + ", Ano: " + ano + ", Cilindrada: " + cilindrada + "cc";
    }
}