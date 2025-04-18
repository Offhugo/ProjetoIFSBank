package Project.Services.Util;

import java.util.Random;

public class GerarValorAleatorioCodigo {
    private int valorAleatorio;

    public GerarValorAleatorioCodigo(){
        Random random = new Random();
        this.valorAleatorio = random.nextInt(1001);
    }

    public int retornarValorAleatorio(){
        return valorAleatorio;
    }
}
