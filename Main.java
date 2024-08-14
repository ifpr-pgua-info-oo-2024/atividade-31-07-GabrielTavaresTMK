import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite as informações da primeira academia:");
        System.out.print("Nome: ");
        String nome1 = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco1 = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone1 = scanner.nextLine();

        Academia academia1 = new Academia(nome1, endereco1, telefone1);

        System.out.println("\nDigite as informações da segunda academia:");
        System.out.print("Nome: ");
        String nome2 = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco2 = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone2 = scanner.nextLine();

        Academia academia2 = new Academia(nome2, endereco2, telefone2);

        System.out.println("\nCadastro de alunos na primeira academia:");
        cadastrarAlunos(academia1, scanner, dateFormat);

        System.out.println("\nCadastro de alunos na segunda academia:");
        cadastrarAlunos(academia2, scanner, dateFormat);

        System.out.println("\nDados da Academia 1:");
        academia1.imprimirDados();
        academia1.imprimirAlunos();

        System.out.println("\nDados da Academia 2:");
        academia2.imprimirDados();
        academia2.imprimirAlunos();

        scanner.close();
    }

    private static void cadastrarAlunos(Academia academia, Scanner scanner, SimpleDateFormat dateFormat) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        Date dataLimite = calendar.getTime();

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("\nDigite as informações do aluno " + (i + 1) + ":");
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Gênero: ");
                String genero = scanner.nextLine();
                
                Date nascimento = null;
                while (nascimento == null) {
                    System.out.print("Data de Nascimento (dd/MM/yyyy): ");
                    String nascimentoStr = scanner.nextLine();
                    try {
                        nascimento = dateFormat.parse(nascimentoStr);
                        if (nascimento.after(dataLimite)) {
                            System.out.println("Data de nascimento inválida.");
                            nascimento = null;
                        }
                    } catch (ParseException e) {
                        System.out.println("Data de nascimento inválida use o formato dd/MM/yyyy.");
                    }
                }

                double altura;
                while (true) {
                    System.out.print("Altura: ");
                    String alturaStr = scanner.nextLine();
                    try {
                        altura = Double.parseDouble(alturaStr);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("insira um número válido.");
                    }
                }

                double peso;
                while (true) {
                    System.out.print("Peso: ");
                    String pesoStr = scanner.nextLine();
                    try {
                        peso = Double.parseDouble(pesoStr);
                        break; 
                    } catch (NumberFormatException e) {
                        System.out.println("insira um número válido.");
                    }
                }

                System.out.print("Nível: ");
                String nivel = scanner.nextLine();

                Pessoa pessoa = new Pessoa(nome, genero, nascimento, altura, peso);
                Aluno aluno = new Aluno(nivel, pessoa);
                academia.adicionarAluno(aluno);
            } catch (NumberFormatException e) {
                System.out.println("insira números válidos.");
            }
        }
    }
}

//só colocando pq ficou todo ferrado o commit