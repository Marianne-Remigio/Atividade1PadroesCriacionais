package org.example.factoryMethod;

public class MainTeste {
    public static void main(String[] args) {

        Loja veiculoEconomico = new VeiculoEconomico();
        Veiculo moto = veiculoEconomico.tipoVeiculo("moto");
        moto.descrever();
        Loja veiculoLuxo = new VeiculoLuxo();
        Veiculo carro = veiculoLuxo.tipoVeiculo("carro");
        carro.descrever();
    }
}
