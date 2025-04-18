package Project.Services.CriarAcessos.CriarCorrentistas;

import Project.Model.Correntista.Correntista;

import java.util.Scanner;

public class CorrentistaInputView {
    private final CorrentistaService correntistaService;
    private final Scanner sc;

    // Injeção de dependência para melhor testabilidade
    public CorrentistaInputView(CorrentistaService correntistaService, Scanner sc) {
        this.correntistaService = correntistaService;
        this.sc = sc;
    }

    // Método principal simplificado
    public Correntista gerarNovoCorrentista() {
        return correntistaService.criarCorrentista(
                solicitarNome(),
                solicitarTelefone(),
                solicitarSenha()
        );
    }

    // Método que captura o nome digitado
    private String solicitarNome() {
        System.out.print("Digite o nome: ");
        return sc.nextLine();
    }

    // Método que captura o telefone solicitado
    private String solicitarTelefone() {
        String telefone;
        do {
            System.out.print("Digite o telefone (11 dígitos, ex: 11987654321): ");
            telefone = sc.next();
            if (!telefone.matches("\\d{11}")) {
                System.out.println("Erro: O telefone deve conter exatamente 11 dígitos numéricos.");
            }
        } while (!telefone.matches("\\d{11}"));

        sc.nextLine(); // Limpa buffer
        return telefone;
    }

    // Método que captura a senha solicitada
    private String solicitarSenha() {
        System.out.print("Digite a senha: ");
        return sc.next();
    }
}