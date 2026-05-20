package exercicios03_classes_encapsulamento;

import java.util.Scanner;

public class Exercicio01 {

    static double saldo;
    static double chequeEspecial;
    static double chequeUsado = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do depósito inicial: R$ ");
        double deposito = scanner.nextDouble();

        saldo = deposito;
        chequeEspecial = deposito <= 500 ? 50 : deposito * 0.5;

        System.out.println("Conta criada! Cheque especial: R$ " + chequeEspecial);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar se está usando cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;

                case 2:
                    System.out.printf("Limite do cheque especial: R$ %.2f%n", chequeEspecial);
                    break;

                case 3:
                    System.out.print("Valor do depósito: R$ ");
                    double depositar = scanner.nextDouble();
                    if (chequeUsado > 0) {
                        double taxa = chequeUsado * 0.2;
                        System.out.printf("Taxa de 20%% sobre cheque especial usado (R$ %.2f): R$ %.2f%n", chequeUsado, taxa);
                        depositar -= taxa;
                        chequeUsado = 0;
                    }
                    saldo += depositar;
                    System.out.printf("Depósito realizado! Saldo: R$ %.2f%n", saldo);
                    break;

                case 4:
                    System.out.print("Valor do saque: R$ ");
                    double sacar = scanner.nextDouble();
                    realizarDebito(sacar, "Saque");
                    break;

                case 5:
                    System.out.print("Valor do boleto: R$ ");
                    double boleto = scanner.nextDouble();
                    realizarDebito(boleto, "Pagamento");
                    break;

                case 6:
                    if (chequeUsado > 0) {
                        System.out.printf("Sim! Usando R$ %.2f do cheque especial.%n", chequeUsado);
                    } else {
                        System.out.println("Não está usando o cheque especial.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    static void realizarDebito(double valor, String tipo) {
        double limite = saldo + chequeEspecial - chequeUsado;
        if (valor > limite) {
            System.out.println("Saldo insuficiente mesmo com cheque especial!");
        } else if (valor > saldo) {
            double diferenca = valor - saldo;
            chequeUsado += diferenca;
            saldo = 0;
            System.out.printf("%s realizado! Usando R$ %.2f do cheque especial.%n", tipo, chequeUsado);
        } else {
            saldo -= valor;
            System.out.printf("%s realizado! Saldo: R$ %.2f%n", tipo, saldo);
        }
    }
}
