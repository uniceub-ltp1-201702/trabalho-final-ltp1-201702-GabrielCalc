package control;

import javax.swing.JOptionPane;

import model.BD;
import model.Musica;
import view.ViewArtistaExiste;
import view.ViewIncluirMusica;

public class ControleMusica {
	private BD bds;

	public ControleMusica(BD bds) {
		this.bds = bds;
	}

	public void cadastrarMusica() {
		ViewIncluirMusica vim = new ViewIncluirMusica();

		vim.incluirMusica();

		if (this.bds.musicaExiste(vim.getNome(), vim.getAlbum())) {
			ViewArtistaExiste vae = new ViewArtistaExiste();
			vae.musicaExiste();

		} else {

			Musica musica = new Musica(vim.getNome(), vim.getArtista(), vim.getAlbum());

			this.bds.gravarMusica(musica);

			JOptionPane.showMessageDialog(null, "Música incluída com sucesso!");
		}
	}
}
