package Java;

import java.util.Scanner;

public class area_triangulo {
    

// Cálcule a área do triângulo.
// área do triângulo = (base * altura) / 2.

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int anoAtual = 2024;
  
    System.out.println("Digite o valor da base: ");
    double base = sc.nextDouble();

    System.out.println("Digite o valor da altura: ");
    double altura = sc.nextDouble();

    double area = (base * altura) / 2;

    System.out.println("A área do triângulo é: " + area + " cm². ");
 
  }
}


