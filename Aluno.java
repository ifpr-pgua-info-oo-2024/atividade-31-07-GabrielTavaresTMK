import java.util.Date;

public class Aluno {

    private String nome;
    private String nivel;
    private Date nascimento;
    private String genero;
    private double altura;
    private double peso;

    public Aluno(String nome, String nivel, int nascimentoAluno, String genero, double altura, double peso) {
        this.nome = nome;
        this.nivel = nivel;
        this.nascimento = nascimentoAluno;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    public Aluno(String nome, String nivel, Date nascimento) {
        this(nome, nivel, nascimento, "", 0.0, 0.0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {

        String pattern;
        simpleDateFormat simpleDateFormat = new simpleDateFormat (pattern: "dd/MM/yyyy");

        return "Aluno(nome=" + nome + ", nivel=" + nivel + ", nascimento=" + simpleDateFormat.format(nascimento) 
        + ", genero=" + genero + ",altura=" + altura + ", peso=" + peso + ")";
    }
}

//só colocado para dar commit sem cagar tudo