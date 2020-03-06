package Kiritão;

import javax.swing.JOptionPane;

public class Sexo {
	public static void main(String[] args) {
		
		String sexo = JOptionPane.showInputDialog("Qual o seu sexo ?");
		
		if (sexo.toLowerCase().equals("m") || sexo.toLowerCase().equals("f")) {
			JOptionPane.showMessageDialog(null, "Sexo Valido.");
		}
		else
			JOptionPane.showMessageDialog(null, "Sexo Invalido");
	}
}
