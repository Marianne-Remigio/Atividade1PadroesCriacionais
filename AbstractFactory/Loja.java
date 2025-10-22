package org.example.asbtractFactory;

public class Loja {

    public Veiculo criarVeiculoLuxo(String tipoVeiculo){
        FabricaVeiculos fabrica = new FabricaLuxo();
        switch (tipoVeiculo){
            case "moto":
                return fabrica.criarMoto();
            case "carro":
                return fabrica.criarCarro();
        }
        return null;
    }

    public Veiculo criarVeiculoEconomico(String tipoVeiculo){
        FabricaVeiculos fabrica = new FabricaEconomica();
        switch (tipoVeiculo){
            case "moto":
                return fabrica.criarMoto();
            case "carro":
                return fabrica.criarCarro();
        }
        return null;
    }
}