package Project.Model.Correntista;

public class CorrentistaJuridico extends Correntista {
    private int cpf;

    public CorrentistaJuridico(int codigo, String nome, String telefone, boolean estaLogado, String senha, int cpf) {
        super(codigo, nome, telefone, estaLogado, senha);
        this.cpf = cpf;
    }
}
