import java.util.Scanner;

public class BancoAzul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deposito = 0;
        double saldo = 0;
        String extrato = "";
        int numeroSaques = 0;
        int limiteSaques = 3;
        double limiteValor = 500;
        
        while(true) {
            System.out.println("=====================");
            System.out.println("Selecione uma opção:");
            System.out.println("[d] - Depósito");
            System.out.println("[s] - Saldo");
            System.out.println("[e] - Extrato");
            System.out.println("[q] - Sair");
            System.out.println("=====================");

            String menu = scanner.nextLine();

            if(menu == "d") {
                System.out.println("Informe o valor do depósito: R$ ");
                double valor = scanner.nextDouble();
                if(valor > 0) {
                    saldo += valor;
                    extrato += "Depósito de R$" + valor + "realizado\n";
                    System.out.printf("Depósito de R$ %.2f realizado com sucesso \n" , valor);
                } else {
                    System.out.println("@@@  Operação falhou! O valor informado é inválido!  @@@");
                }
            }
        }
         scanner.close();
    }
}

// Deposito
// Deve aceitar apenas valores positivos
// Os depósitos devem aparecer no extrato

// Saque
// Permitir no máximo 3 saques diários.
// Cada saque pode ter o valor máximo de R$ 500,00.
// O sistema deve bloquear saques se o usuário não tiver saldo suficiente, exibindo mensagem: `Saldo insuficiente para saque.`
// Os saques devem ser armazenados e aparecer no extrato

// Extrato
// Listar todas as movimentações (depósitos e saques) feitas.
// No final da listagem, mostrar o saldo atual.
// Formatar os valores no padrão brasileiro: R$ 500.50
// Se não houver movimentações, mostrar: Não foram realizadas movimentações
