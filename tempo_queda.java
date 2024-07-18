package Java;

import java.util.Scanner;

public class tempo_queda {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
        double altura;
        double G = 9.8;
        double tempoQueda;
        
        System.out.print("Digite a altura: ");
        altura = input.nextDouble();
        tempoQueda = Math.sqrt(2 * altura / G);
    
        
        System.out.println("O tempo de queda é: " + tempoQueda + " m/s²." );
            
        }

    
}

