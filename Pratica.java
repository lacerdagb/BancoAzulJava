import java.util.Locale;
import java.util.Scanner;

public class Pratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(new Lo());
        Locale.setDefault(new Locale("pt", "BR"));


        // System.out.println("Digite o seu nome: ");

        // String nome = scanner.nextLine();
        // System.out.println("O seu nome é: " + nome);

        // System.out.println("Digite sua idade: ");
        // int idade = scanner.nextInt();
        // System.out.println("Sua idade é" + idade);

        System.out.println("Digite a sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Sua altura é: " + altura);
        scanner.close();

    }
}
