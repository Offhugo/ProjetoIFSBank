package Project.Front;

import Project.Services.CriarAcessos.CriarCorrentistas.CorrentistaService;
import Project.Services.CriarAcessos.CriarCorrentistas.CorrentistaInputView;


import java.util.Scanner;

public class Menu {


    public Menu() {

    }

    // ESBOÇO

    public void ativarMenu() {
        Scanner sc = new Scanner(System.in);

        int count = 1;
        while (count == 1) {
            System.out.println("Bem-vindo! \n" +
                    " Selecione as seguintes opções: \n" +
                    " 1 - Cadastrar Correntista \n" +
                    " 2 - Efetuar Login \n" +
                    " 3 - Cadastrar Conta \n" +
                    " 4 - Debitar conta \n" +
                    " 5 - Creditar conta \n" +
                    " 6 - Exibir Saldo das Contas \n" +
                    " 7 - Sair \n" +
                    "Procurar: ");
            int selct = sc.nextInt();

            if (selct == 1) {

            } else if (selct == 2) {
                // chamar metodo de acesso a conta
            } else if (selct == 3) {
                // chamar metodo para cadastrar conta
            } else if (selct == 4) {
                // chamar metodo que debita (remove valor da conta)
            } else if (selct == 5) {
                // chamar metodo que credita o valor da conta (adiciona valor)
            } else if (selct == 6) {
                // Exibir valor da conta em questão
            } else if (selct == 7) {
                count = 0;
                System.out.println("Fim do programa");
            } else {
                System.out.println("Selecione uma opção valida!");
            }
        }

        /* DETALHES
        *  É PRECISO ESTAR LOGADO PARA ACESSAR A MAIORIA DAS OPÇÕES
        *
        * */
    }
}
