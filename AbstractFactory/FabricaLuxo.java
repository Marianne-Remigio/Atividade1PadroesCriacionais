package org.example.asbtractFactory;

public class FabricaLuxo implements FabricaVeiculos{


    @Override
    public Veiculo criarCarro() {
        return new CarroLuxo();
    }

    @Override
    public Veiculo criarMoto() {
        return new MotoLuxo();
    }
}
