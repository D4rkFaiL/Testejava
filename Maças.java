package Kirit�o;

import javax.swing.JOptionPane;

public class Ma�as {
	public static void main(String[] args) {
		
		int ma�as = Integer.parseInt(JOptionPane.showInputDialog("Quantas ma��s voc� comprou ?"));
		double valor;
		
		if (ma�as <12) {
			valor = 1.30*ma�as;
		}
		else {
			valor = ma�as*1.00;
		}
		JOptionPane.showMessageDialog(null,"O total da compra �:"+ valor);
	}
			
}
