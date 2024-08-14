public class Aluno {
    private String nivel;
    private Pessoa pessoa;

    public Aluno(String nivel, Pessoa pessoa) {
        this.nivel = nivel;
        this.pessoa = pessoa;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Aluno(nivel=" + nivel + ", nome=" + pessoa.getNome() +
               ", dataNascimento=" + pessoa.convertNascimentoToString() + 
               ", idade=" + pessoa.calcularIdade() + 
               ", genero=" + pessoa.getGenero() + ")";
    }
}

//só colocando pq ficou todo ferrado o commit