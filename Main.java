import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args){
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite seu primeiro valor!"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite seu segundo valor!"));
        int soma = valor1 + valor2;
        JOptionPane.showMessageDialog(null,"A soma dos valores é: " + soma);
    }
} 