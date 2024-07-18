package Java;
import java.util.Scanner;

public class test {

    

public static void main(String[] args){
//criando o objeto de leitura
    Scanner leitor = new Scanner(System.in);

    //1) Váriaveis

    double media = 0, nota1= 0, nota2 = 0;

    //2) Leitura de variáveis

    System.out.println("Digite a nota1");
    nota1 = leitor.nextDouble(); //ler um real

    System.out.println("Digite a nota2");
    nota2 = leitor.nextDouble();//ler um real

    //3) Calcular media

    media = (nota1 + nota2) /2;

    //4) resultado

    System.out.println("Valor da media: " + media);


}

}