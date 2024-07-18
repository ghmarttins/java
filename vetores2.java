package Java;

import java.util.Scanner;

public class vetores2 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[3];
        int[] idades = new int[3];
        double[] salarios = new double[3];
        double[] novoSal = new double[3];

        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Ler os vetores");
            System.out.println("2. Exibir os vetores");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    lerVetores(scanner, nomes, idades, salarios);
                    calcularNovoSalario(idades, salarios, novoSal);
                    break;
                case 2:
                    exibirVetores(nomes, idades, salarios, novoSal);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha novamente.");
            }
        } while (opcao != 3);
        
        scanner.close();
    }

    public static void lerVetores(Scanner scanner, String[] nomes, int[] idades, double[] salarios) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.next();
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            System.out.print("Digite o salário da pessoa " + (i + 1) + ": ");
            salarios[i] = scanner.nextDouble();
        }
    }

    public static void calcularNovoSalario(int[] idades, double[] salarios, double[] novoSal) {
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 18) {
                novoSal[i] = salarios[i] * 1.15; // 15% de aumento
            } else {
                novoSal[i] = salarios[i] * 1.08; // 8% de aumento
            }
        }
    }

    public static void exibirVetores(String[] nomes, int[] idades, double[] salarios, double[] novoSal) {
        System.out.println("Nomes\t\tIdades\t\tSalários\tNovo Salário");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + "\t\t" + idades[i] + "\t\t" + salarios[i] + "\t\t" + novoSal[i]);
        }
    }





}
