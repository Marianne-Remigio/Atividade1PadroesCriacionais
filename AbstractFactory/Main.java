package org.example.asbtractFactory;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Veiculo carroEconomico = loja.criarVeiculoEconomico("carro");
        Veiculo motoEconomica = loja.criarVeiculoEconomico("moto");
        Veiculo carroLuxo = loja.criarVeiculoLuxo("carro");
        Veiculo motoLuxo = loja.criarVeiculoLuxo("moto");

        carroEconomico.descrever();
        motoEconomica.descrever();
        carroLuxo.descrever();
        motoLuxo.descrever();
    }
}