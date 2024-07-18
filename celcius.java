package Java;

import java.util.Scanner;

public class celcius {
    
    double celsius = 0.0;
    double fahrenheit = 0.0;

    Scanner ler = new Scanner(System.in);

    System.out.println("Digite a temperatura em Celsius: ");
    celsius = ler.nextDouble(); 
    
    // Ler a temperatura em Celsius

    // Fórmula do cálculo:
    // F = (9 * C + 160) / 5
    fahrenheit = (9.0 / 5.0) * celsius + 32.0;

    System.out.println("Este é o seu resultado:");
    System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

    ler.close(); // Fechar o scanner
}
}
