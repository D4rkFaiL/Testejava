package Kiritão;

import javax.swing.JOptionPane;

public class Maças {
	public static void main(String[] args) {
		
		int maças = Integer.parseInt(JOptionPane.showInputDialog("Quantas maçãs você comprou ?"));
		double valor;
		
		if (maças <12) {
			valor = 1.30*maças;
		}
		else {
			valor = maças*1.00;
		}
		JOptionPane.showMessageDialog(null,"O total da compra é:"+ valor);
	}
			
}
