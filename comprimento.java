package Java;

import javax.swing.JOptionPane;

public class comprimento {
    

    private double comprimento;

    
    public void lerComprimento() {
        String input = JOptionPane.showInputDialog("Digite o comprimento do círculo:");
        comprimento = Double.parseDouble(input);
    }

    
    public double getDiametro() {
        return comprimento / Math.PI;
    }

    
    public double getRaio() {
        return getDiametro() / 2;
    }

    
    public double getArea() {
        double raio = getRaio();
        return Math.PI * raio * raio;
    }

    
    public void plotar() {
        String mensagem = "Diâmetro: " + getDiametro() + "\n" +
                          "Raio: " + getRaio() + "\n" +
                          "Área: " + getArea();
        JOptionPane.showMessageDialog(null, mensagem);
    }

    
    public void controle() {
        lerComprimento();
        plotar();
    }

    
    public static void main(String[] args) {
        comprimento circulo = new comprimento();
        circulo.controle();
    }


}
