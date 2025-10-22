package org.example.factoryMethod;

public class VeiculoEconomico extends Loja{

    @Override
    Veiculo tipoVeiculo(String tipoVeiculo) {
        switch (tipoVeiculo){
            case "moto":
                return new MotoEconomica();
            case "carro":
                return new CarroEconomico();
        }
        return null;
    }
}
