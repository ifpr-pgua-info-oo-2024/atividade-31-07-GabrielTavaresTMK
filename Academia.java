import java.util.Scanner;

public class Academia {
    private String nome;
    private String endereco;
    private String telefone;

    public Academia(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
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

        Academia academia2 = new Academia(nome2, endereco2, telefone2);

        System.out.println("\nDados da Academia 1:");
        academia1.imprimirDados();
        
        System.out.println("\nDados da Academia 2:");
        academia2.imprimirDados();

        scanner.close();
    }
}
