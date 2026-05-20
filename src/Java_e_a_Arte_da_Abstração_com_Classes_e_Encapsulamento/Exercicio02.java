package exercicios03_classes_encapsulamento;

import java.util.Scanner;

public class Exercicio02 {

    static boolean ligado = false;
    static int velocidade = 0;
    static int marcha = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n===== MENU DO CARRO =====");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar para esquerda");
            System.out.println("6 - Virar para direita");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - Trocar marcha");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (ligado) {
                        System.out.println("O carro já está ligado!");
                    } else {
                        ligado = true;
                        System.out.println("Carro ligado!");
                    }
                    break;

                case 2:
                    if (!ligado) {
                        System.out.println("O carro já está desligado!");
                    } else if (marcha != 0 || velocidade != 0) {
                        System.out.println("Coloque em ponto morto e velocidade 0 antes de desligar!");
                    } else {
                        ligado = false;
                        System.out.println("Carro desligado!");
                    }
                    break;

                case 3:
                    if (!ligado) {
                        System.out.println("O carro está desligado!");
                    } else if (marcha == 0) {
                        System.out.println("Troque a marcha antes de acelerar!");
                    } else if (velocidade >= 120) {
                        System.out.println("Velocidade máxima atingida (120km)!");
                    } else if (velocidade >= limiteMarcha(marcha)) {
                        System.out.println("Troque para uma marcha maior antes de acelerar!");
                    } else {
                        velocidade++;
                        System.out.println("Velocidade: " + velocidade + "km — Marcha: " + marcha);
                    }
                    break;

                case 4:
                    if (!ligado) {
                        System.out.println("O carro está desligado!");
                    } else if (velocidade == 0) {
                        System.out.println("O carro já está a 0km!");
                    } else {
                        velocidade--;
                        System.out.println("Velocidade: " + velocidade + "km — Marcha: " + marcha);
                    }
                    break;

                case 5:
                case 6:
                    if (!ligado) {
                        System.out.println("O carro está desligado!");
                    } else if (velocidade < 1 || velocidade > 40) {
                        System.out.println("Só pode virar entre 1km e 40km!");
                    } else {
                        System.out.println("Virando para " + (opcao == 5 ? "esquerda" : "direita") + "!");
                    }
                    break;

                case 7:
                    System.out.println("Velocidade atual: " + velocidade + "km — Marcha: " + marcha);
                    break;

                case 8:
                    if (!ligado) {
                        System.out.println("O carro está desligado!");
                    } else {
                        System.out.print("Digite a marcha desejada (0 a 6): ");
                        int novaMarcha = scanner.nextInt();
                        if (novaMarcha < 0 || novaMarcha > 6) {
                            System.out.println("Marcha inválida!");
                        } else if (Math.abs(novaMarcha - marcha) > 1) {
                            System.out.println("Não pode pular marchas!");
                        } else if (novaMarcha > marcha && velocidade < limiteMinMarcha(novaMarcha)) {
                            System.out.println("Velocidade muito baixa para essa marcha!");
                        } else if (novaMarcha < marcha && velocidade > limiteMarcha(novaMarcha)) {
                            System.out.println("Velocidade muito alta para essa marcha!");
                        } else {
                            marcha = novaMarcha;
                            System.out.println("Marcha trocada para: " + marcha);
                        }
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

    static int limiteMarcha(int marcha) {
        int[] limites = {0, 20, 40, 60, 80, 100, 120};
        return limites[marcha];
    }

    static int limiteMinMarcha(int marcha) {
        int[] limites = {0, 0, 20, 40, 60, 80, 100};
        return limites[marcha];
    }
}
