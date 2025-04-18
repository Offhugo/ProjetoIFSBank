package Project.Model.Correntista;

public class Correntista {
    private int codigo;
    private String nome;
    private String telefone;
    private boolean estaLogado;
    private String senha;

    public Correntista(int codigo, String nome, String telefone, boolean estaLogado, String senha){
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.estaLogado = estaLogado;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Correntista{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", estaLogado=" + estaLogado +
                ", senha=" + senha +
                '}';
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isEstaLogado() {
        return estaLogado;
    }

    public void setEstaLogado(boolean estaLogado) {
        this.estaLogado = estaLogado;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
