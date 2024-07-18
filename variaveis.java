package Java;

import javax.swing.JOptionPane;

public class variaveis {



    public static void menu() //Criando variáveis do programa
    {
        double N1, N2, F, MG;
        char tecla;
        String strItem, saida;
        //menu do programa
        String menu = "***Menu de Controle***";
        menu += "\n1 Executar \n2 Sair";

        do {
            strItem = JOptionPane.showInputDialog(null, menu);
            tecla = strItem.charAt(0);

            switch (tecla) {
                case '1':
                    N1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota1: "));
                    N2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota2: "));
                    F = Double.parseDouble(JOptionPane.showInputDialog(null, "Faltas"));
                    MG = Math.sqrt(N1 * N2);
                    if (MG < 6 || F > 20) {
                        saida = String.format("Média: %.2fReprovado!", MG);
                    } else {
                        saida = String.format("Média: %.2fAprovado!", MG);
                    }
                    JOptionPane.showMessageDialog(null, saida);
                    break;

                case '2':
                    JOptionPane.showMessageDialog(null, "Programa Finalizado!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcção inválida!");

            }

        } while (true);
    }

    public static void main(String[] args) {
        menu();

    }
    
}
