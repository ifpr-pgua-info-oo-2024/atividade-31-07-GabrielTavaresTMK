import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {
    private String nome;
    private String genero;
    private Date nascimento;
    private double altura;
    private double peso;

    public Pessoa(String nome, String genero, Date nascimento, double altura, double peso) {
        this.nome = nome;
        this.genero = genero;
        this.nascimento = nascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
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

    public int calcularIdade() {
        Calendar hoje = Calendar.getInstance();
        Calendar nascimentoCal = Calendar.getInstance();
        nascimentoCal.setTime(nascimento);

        int idade = hoje.get(Calendar.YEAR) - nascimentoCal.get(Calendar.YEAR);

        if (hoje.get(Calendar.MONTH) < nascimentoCal.get(Calendar.MONTH) ||
            (hoje.get(Calendar.MONTH) == nascimentoCal.get(Calendar.MONTH) &&
             hoje.get(Calendar.DAY_OF_MONTH) < nascimentoCal.get(Calendar.DAY_OF_MONTH))) {
            idade--;
        }

        return idade;
    }

    public String convertNascimentoToString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(nascimento);
    }

    public static Date convertStringToDate(String nascimentoStr) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.parse(nascimentoStr);
    }
}