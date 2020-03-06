package Kiritão;

import javax.swing.JOptionPane;

public class Vendendor {
	public static void main(String[] args) {
		double produto = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor desejado ?"));
				
		if (produto >= 20) {
			produto = produto*1.45;
		}
		else
			produto = produto*1.30;
		
		JOptionPane.showMessageDialog(null,"O valor de venda do produto é:"+ produto);
	}
			
}

