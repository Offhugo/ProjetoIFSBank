package Project.Model.Correntista;

public class CorrentistaFisico extends Correntista {
    private int cnpj;

    public CorrentistaFisico(int codigo, String nome, String telefone, boolean estaLogado, String senha, int cnpj) {
        super(codigo, nome, telefone, estaLogado, senha);
        this.cnpj = cnpj;
    }
}
