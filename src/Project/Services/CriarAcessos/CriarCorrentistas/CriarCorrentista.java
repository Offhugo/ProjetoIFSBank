package Project.Services.CriarAcessos.CriarCorrentistas;

import Project.Model.Correntista.Correntista;
import Project.Model.Correntista.GerarValorAleatorioCodigo;

import java.util.ArrayList;
import java.util.List;

public class CriarCorrentista {
    static List<Correntista> listaCorrentistas = new ArrayList<>();
    static GerarValorAleatorioCodigo gerarValorAleatorioCodigo = new GerarValorAleatorioCodigo();

    public static Correntista criandoCorrentista(int codigo, String nome, int telefone, boolean estaLogado, String senha){
        // TRATAR COM QUE OS CODIGOS GERADOS SEJAM UNICOS

        // Trata de o objeto criado receber um valor aleatorio em sua criação
        int novoValor = gerarValorAleatorioCodigo.retornarValorAleatorio();
        codigo = novoValor;

        Correntista novoCorrentista = new Correntista(codigo, nome, telefone, estaLogado, senha);
        listaCorrentistas.add(novoCorrentista);

        return novoCorrentista;
    }

    public static void validarCorrentista(int codigo){
        if (listaCorrentistas.contains(codigo) == true){
            System.out.println("O pais está no rank");
        } else {
            System.out.println("O pais não está no rank");
        }
    }
}
