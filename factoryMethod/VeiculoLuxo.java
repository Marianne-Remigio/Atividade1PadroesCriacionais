package org.example.factoryMethod;

public class VeiculoLuxo extends Loja{

    @Override
    Veiculo tipoVeiculo(String tipoVeiculo) {
        switch (tipoVeiculo) {
            case "moto":
                return new MotoLuxo();
            case "carro":
                return new CarroLuxo();
        }
        return null;
    }
}
