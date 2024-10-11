package br.edu.unisep.gerenciamento.model;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String exibirDetalhes() {
        return "Veículo: " + marca + " " + modelo + ", Ano: " + ano;
    }
}
