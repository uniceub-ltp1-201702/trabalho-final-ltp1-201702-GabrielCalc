package view;

import javax.swing.JOptionPane;

public class ViewArtistaExiste {

	public void artistaExiste() {
		JOptionPane.showMessageDialog(null, "Esse artista j� existe!", "ERRO", JOptionPane.ERROR_MESSAGE);
	}

	public void musicaExiste() {
		JOptionPane.showMessageDialog(null, "Essa m�sica j� existe!", "ERRO", JOptionPane.ERROR_MESSAGE);
	}

}
