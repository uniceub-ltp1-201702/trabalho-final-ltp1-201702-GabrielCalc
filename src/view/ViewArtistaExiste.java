package view;

import javax.swing.JOptionPane;

public class ViewArtistaExiste {

	public void artistaExiste() {
		JOptionPane.showMessageDialog(null, "Esse artista já existe!", "ERRO", JOptionPane.ERROR_MESSAGE);
	}

	public void musicaExiste() {
		JOptionPane.showMessageDialog(null, "Essa música já existe!", "ERRO", JOptionPane.ERROR_MESSAGE);
	}

}
