package view;

import javax.swing.JOptionPane;

public class ViewObterLetra {
	
	
	private String letra;
	

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	
	public void obterLetra() {
		this.letra = JOptionPane.showInputDialog("Digite uma letra:");
		
	}

}
