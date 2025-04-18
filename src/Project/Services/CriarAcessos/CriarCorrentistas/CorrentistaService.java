package Project.Services.CriarAcessos.CriarCorrentistas;

import Project.Model.Correntista.Correntista;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class CorrentistaService {
    private final List<Correntista> correntistas;
    private final Random random;

    // Injeção de depêndecia para melhorar testes e "simplicidade do código"
    public CorrentistaService() {
        this.correntistas = new ArrayList<>();
        this.random = ThreadLocalRandom.current();
    }


    public Correntista criarCorrentista(String nome, String telefone, String senha) {
        validarTelefoneUnico(telefone);

        Correntista novoCorrentista = new Correntista(
                gerarCodigoUnico(),
                nome,
                telefone,
                false, // Sempre inicia como não logado
                senha
        );

        correntistas.add(novoCorrentista);
        return novoCorrentista;
    }

    private int gerarCodigoUnico() {
        int codigo;
        do {
            codigo = random.nextInt(9000) + 1000; // Gera códigos de 1000 a 9999
        } while (codigoExistente(codigo));
        return codigo;
    }

    private boolean codigoExistente(int codigo) {
        return correntistas.stream().anyMatch(c -> c.getCodigo() == codigo);
    }

    private void validarTelefoneUnico(String telefone) {
        if (correntistas.stream().anyMatch(c -> c.getTelefone().equals(telefone))) {
            throw new IllegalArgumentException("Telefone já cadastrado");
        }
    }

    // Método auxiliar para testes
    public List<Correntista> getCorrentistas() {
        return new ArrayList<>(correntistas);
    }
}