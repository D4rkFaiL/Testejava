package Kirit�o;

import javax.swing.JOptionPane;

public class Peixe {
	public static void main(String[] args) {
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual � o peso do peixe ?"));
		double multa = 0;
		double pesox = 0;
		
		if (peso >= 50){
		pesox = peso - 50;
		multa = pesox*4;
		JOptionPane.showMessageDialog(null, "Multado malucoooooo, o valor da multa � "+multa + "\n O peso acima �"+ pesox
				);
		
		}
		else
		{JOptionPane.showMessageDialog(null, "Ta safe, pode ir.");}
	}

}
