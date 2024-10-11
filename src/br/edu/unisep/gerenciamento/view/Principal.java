package br.edu.unisep.gerenciamento.view;
import br.edu.unisep.gerenciamento.model.Caminhao;
import br.edu.unisep.gerenciamento.model.Carro;
import br.edu.unisep.gerenciamento.model.Frota;
import br.edu.unisep.gerenciamento.model.Moto;

public class Principal {
    public static void main(String[] args) {
        Frota frota = new Frota();

        frota.adicionarVeiculo(new Carro("Toyota", "Corolla", 2020, 4));
        frota.adicionarVeiculo(new Moto("Honda", "CB500", 2019, 500));
        frota.adicionarVeiculo(new Caminhao("Volvo", "FH", 2018, "Carga Pesada"));

        frota.exibirFrota();
    }
}
