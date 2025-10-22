package org.example.asbtractFactory;

public class FabricaEconomica implements FabricaVeiculos{


    @Override
    public Veiculo criarCarro() {
        return new CarroEconomico();
    }

    @Override
    public Veiculo criarMoto() {
        return new MotoEconomica();
    }
}
