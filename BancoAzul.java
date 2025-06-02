import java.util.Locale;
import java.util.Scanner;

public class BancoAzul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double saldo = 0;
        String extrato = "";
        int numeroSaques = 0;
        int limiteSaques = 3;
        double limiteValor = 500;

        while (true) {
            System.out.println("=====================");
            System.out.println("Selecione uma opção:");
            System.out.println("[d] - Depósito");
            System.out.println("[s] - Saque");
            System.out.println("[e] - Extrato");
            System.out.println("[q] - Sair");
            System.out.println("=====================");

            String menu = scanner.nextLine();

            if (menu.equals("d")) {
                System.out.printf("Informe o valor do depósito: R$ ");
                double valor = scanner.nextDouble();
                scanner.nextLine();
                if (valor > 0) {
                    saldo += valor;
                    extrato += "Depósito de R$" + valor + "realizado\n";
                    System.out.printf("Depósito de R$ %.2f realizado com sucesso \n", valor);
                } else {
                    System.out.println("@@@  Operação falhou! O valor informado é inválido!  @@@");
                }
            } else if (menu.equals("s")) {
                System.out.println("Informe o valor do saque R$: ");
                double valor = scanner.nextDouble();
                scanner.nextLine();
                boolean excedeuSaque = numeroSaques >= limiteSaques;
                boolean excedeuLimite = valor > limiteValor;
                boolean excedeuSaldo = valor > saldo;

                if (excedeuSaldo) {
                    System.out.println("@@@ Operação Falhou! Você não tem saldo suficiente! @@@");
                } else if (excedeuSaque) {
                    System.out.println("@@@ Operação Falhou! O número máximo de saques foi excedido! @@@");
                } else if (excedeuLimite) {
                    System.out.println("@@@ Operação Falhou! O valor do saque excede o limite! @@@");
                } else if (valor > 0) {
                    saldo -= valor;
                    extrato += "Saque de R$" + valor + " realizado" + "\n";
                    numeroSaques += 1;
                    System.out.printf("Saque de R$%.2f realizado com sucesso %n", valor);
                } else {
                    System.out.println("@@@  Operação falhou! O valor informado é inválido!  @@@");
                }
            } else if (menu.equals("e")) {
                if (extrato == "") {
                    System.out.println("Não foram realizadas movimentações");
                } else {
                    System.out.println("=========== E X T R A T O ============ \n");
                    System.out.println(extrato);
                    System.out.println("SALDO: " + saldo);
                    System.out.println("============================ \n \n");
                }
            } else if (menu.equals("q")) {
                System.out.println("Obrigado pela preferência !!!");
                break;
            } else {
                System.out.println("@@@Opção inválida, por favor selecione a opção correta!@@@");
            }
        }

        scanner.close();

    }
}
// Versão 2.0

// Deposito
// Deve aceitar apenas valores positivos
// Os depósitos devem aparecer no extrato

// Saque
// Permitir no máximo 3 saques diários.
// Cada saque pode ter o valor máximo de R$ 500,00.
// O sistema deve bloquear saques se o usuário não tiver saldo suficiente,
// exibindo mensagem: `Saldo insuficiente para saque.`
// Os saques devem ser armazenados e aparecer no extrato

// Extrato
// Listar todas as movimentações (depósitos e saques) feitas.
// No final da listagem, mostrar o saldo atual.
// Formatar os valores no padrão brasileiro: R$ 500.50
// Se não houver movimentações, mostrar: Não foram realizadas movimentações
