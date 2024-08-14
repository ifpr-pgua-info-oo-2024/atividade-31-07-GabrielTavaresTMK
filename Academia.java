import java.util.ArrayList;
import java.util.List;

public class Academia {
    private String nome;
    private String endereco;
    private String telefone;
    private List<Aluno> alunos;

    public Academia(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void imprimirAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }
}