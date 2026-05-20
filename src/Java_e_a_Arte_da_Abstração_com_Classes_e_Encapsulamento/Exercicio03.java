package exercicios03_classes_encapsulamento;

import java.util.Scanner;

public class Exercicio03 {

    static double agua = 0;
    static double shampoo = 0;
    static String petNaMaquina = null;
    static boolean petLimpo = false;
    static boolean maquinaSuja = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n===== MENU PETSHOP =====");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer água (+2L)");
            System.out.println("3 - Abastecer shampoo (+2L)");
            System.out.println("4 - Verificar nível de água");
            System.out.println("5 - Verificar nível de shampoo");
            System.out.println("6 - Verificar se tem pet na máquina");
            System.out.println("7 - Colocar pet na máquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (petNaMaquina == null) {
                        System.out.println("Nenhum pet na máquina!");
                    } else if (agua < 10) {
                        System.out.println("Água insuficiente! Necessário 10L.");
                    } else if (shampoo < 2) {
                        System.out.println("Shampoo insuficiente! Necessário 2L.");
                    } else {
                        agua -= 10;
                        shampoo -= 2;
                        petLimpo = true;
                        System.out.println(petNaMaquina + " tomou banho! Água: " + agua + "L | Shampoo: " + shampoo + "L");
                    }
                    break;

                case 2:
                    if (agua + 2 > 30) {
                        System.out.println("Capacidade máxima de água é 30L!");
                    } else {
                        agua += 2;
                        System.out.println("Água abastecida! Nível atual: " + agua + "L");
                    }
                    break;

                case 3:
                    if (shampoo + 2 > 10) {
                        System.out.println("Capacidade máxima de shampoo é 10L!");
                    } else {
                        shampoo += 2;
                        System.out.println("Shampoo abastecido! Nível atual: " + shampoo + "L");
                    }
                    break;

                case 4:
                    System.out.println("Nível de água: " + agua + "L / 30L");
                    break;

                case 5:
                    System.out.println("Nível de shampoo: " + shampoo + "L / 10L");
                    break;

                case 6:
                    if (petNaMaquina == null) {
                        System.out.println("Nenhum pet na máquina.");
                    } else {
                        System.out.println("Pet na máquina: " + petNaMaquina + (petLimpo ? " (limpo)" : " (sujo)"));
                    }
                    break;

                case 7:
                    if (maquinaSuja) {
                        System.out.println("Limpe a máquina antes de colocar outro pet!");
                    } else if (petNaMaquina != null) {
                        System.out.println("Já tem um pet na máquina!");
                    } else {
                        System.out.print("Digite o nome do pet: ");
                        petNaMaquina = scanner.nextLine();
                        petLimpo = false;
                        System.out.println(petNaMaquina + " colocado na máquina!");
                    }
                    break;

                case 8:
                    if (petNaMaquina == null) {
                        System.out.println("Nenhum pet na máquina!");
                    } else if (!petLimpo) {
                        System.out.println(petNaMaquina + " retirado sem banho! Máquina precisará de limpeza.");
                        petNaMaquina = null;
                        maquinaSuja = true;
                    } else {
                        System.out.println(petNaMaquina + " retirado limpo e cheiroso!");
                        petNaMaquina = null;
                        petLimpo = false;
                    }
                    break;

                case 9:
                    if (!maquinaSuja && petNaMaquina == null) {
                        System.out.println("A máquina já está limpa!");
                    } else if (agua < 3) {
                        System.out.println("Água insuficiente para limpeza! Necessário 3L.");
                    } else if (shampoo < 1) {
                        System.out.println("Shampoo insuficiente para limpeza! Necessário 1L.");
                    } else {
                        agua -= 3;
                        shampoo -= 1;
                        maquinaSuja = false;
                        System.out.println("Máquina limpa! Água: " + agua + "L | Shampoo: " + shampoo + "L");
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
}
