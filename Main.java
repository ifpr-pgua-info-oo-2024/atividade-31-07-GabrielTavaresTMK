import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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


        cadastraralunos( academia1, 3);


        Academia academia2 = new Academia(nome2, endereco2, telefone2);

        System.out.println("\nDados da Academia 1:");
        academia1.imprimirDados();
        
        System.out.println("\nDados da Academia 2:");
        academia2.imprimirDados();

        cadastraralunos( academia2, 3);

        scanner.close();
    }



    private static void cadastraralunos( Academia academia, int quantidade) {
          Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < quantidade; i++) {
                System.out.println("\nDigite as informações do aluno " + (i + 1) + ":");
                System.out.print("Nome: ");
                String nomeAluno = scanner.nextLine();
                System.out.print("Graduação: ");
                String nivelAluno = scanner.nextLine();
                System.out.print("Nascimento: ");
                int nascimentoAluno = Integer.parseInt(scanner.nextLine());
                System.out.print("Gênero: ");
                String generoAluno = scanner.nextLine();
                System.out.print("Altura: ");
                double alturaAluno = Double.parseDouble(scanner.nextLine());
                System.out.print("Peso: ");
                double pesoAluno = Double.parseDouble(scanner.nextLine());

                Aluno aluno = new Aluno(nomeAluno, nivelAluno, nascimentoAluno, generoAluno, alturaAluno, pesoAluno);
                academia.adicionarAluno(aluno);
         }
     }
}
