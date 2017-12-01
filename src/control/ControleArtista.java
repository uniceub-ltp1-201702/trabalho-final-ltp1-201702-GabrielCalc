package control;

import javax.swing.JOptionPane;

import model.Artista;
import model.BD;
import view.ViewArtistaExiste;
import view.ViewIncluirArtista;

public class ControleArtista {
	private BD bds;

	public ControleArtista(BD bds) {
		this.bds = bds;
	}

	public void cadastrarArtista() {
		ViewIncluirArtista via = new ViewIncluirArtista();

		via.incluirArtista();

		if (this.bds.artistaExiste(via.getCPF())) {
			ViewArtistaExiste vae = new ViewArtistaExiste();
			vae.artistaExiste();

		} else {

			Artista artista = new Artista(via.getNome(), via.getCPF(), Integer.parseInt(via.getIdade()));

			this.bds.gravarArtista(artista);
			JOptionPane.showMessageDialog(null, "Artista incluído com sucesso!");
		}
	}

}
