package Java;

import java.util.Scanner;

public class vetores {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        while (true) {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    preencherVetores(scanner);
                    break;
                case 2:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Preencher vetores");
        System.out.println("2. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void preencherVetores(Scanner scanner) {
        int tamanho = 3;
        String[] nomes = new String[tamanho];
        int[] idades = new int[tamanho];
        double[] salarios = new double[tamanho];
        double[] novoSal = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            nomes[i] = scanner.next();
            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            idades[i] = scanner.nextInt();
            System.out.println("Digite o salário da pessoa " + (i + 1) + ":");
            salarios[i] = scanner.nextDouble();

            if (idades[i] > 18)
                novoSal[i] = salarios[i] * 0.15;
            else
                novoSal[i] = salarios[i] * 0.08;
        }

        exibirVetores(nomes, idades, salarios, novoSal);
    }

    public static void exibirVetores(String[] nomes, int[] idades, double[] salarios, double[] novoSal) {
        System.out.println("Nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("Idades:");
        for (int idade : idades) {
            System.out.println(idade);
        }

        System.out.println("Salários:");
        for (double salario : salarios) {
            System.out.println(salario);
        }

        System.out.println("Novos Salários:");
        for (double novo : novoSal) {
            System.out.println(novo);
        }
    }
    
}
