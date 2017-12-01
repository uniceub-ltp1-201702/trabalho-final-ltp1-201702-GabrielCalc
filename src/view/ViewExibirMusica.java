package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ViewExibirMusica {
	
	public void exibirMusica(ArrayList<String> musica){
		JOptionPane.showMessageDialog(null, musica);
	}
	
	public void exibeMusicaPorLetra(ArrayList<String> music) {
		JOptionPane.showMessageDialog(null, music);
	}
	

}
