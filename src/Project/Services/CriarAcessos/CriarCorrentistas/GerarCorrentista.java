package Project.Services.CriarAcessos.CriarCorrentistas;

import Project.Model.Correntista.Correntista;

import java.util.Scanner;

public class GerarCorrentista {
    CriarCorrentista criarCorrentista = new CriarCorrentista();
    Scanner sc = new Scanner(System.in);

    public Correntista gerandoCorrentista() {
        System.out.println("Digite um nome: ");
        String nome = sc.next();

        System.out.println("Digite um telefone: ");
        int telefone = sc.nextInt();;

        System.out.println("Digite uma senha: ");
        String senha = sc.next();

        System.out.println("Digite um valor de 1 a 5: ");
        int codigo = sc.nextInt();

        boolean estaLogado = true;

        return criarCorrentista.criandoCorrentista(codigo, nome, telefone, estaLogado, senha);
    }
}
