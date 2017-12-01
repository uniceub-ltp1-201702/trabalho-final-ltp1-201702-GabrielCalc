package control;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.BD;
import view.ViewExibirMusica;
import view.ViewIncluirArtista;
import view.ViewIncluirMusica;
import view.ViewObterLetra;

public class ControleExibirMusica {

	private BD bds;

	public ControleExibirMusica(BD bds) {
		this.bds = bds;
	}

	// Metodo para mostrar musica por nome
	public void musicaPorArtista() {

		ViewIncluirArtista via = new ViewIncluirArtista();

		via.nomeArtista();

		String musica = via.getNome();
		if (this.bds.artistaNãoExiste(musica)) {
			ViewExibirMusica vem = new ViewExibirMusica();

			vem.exibirMusica(this.bds.getMusicaPorArtista(musica));

		} else {
			JOptionPane.showMessageDialog(null, "Artista não existe!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void MusicaPorNome() {

		ViewIncluirMusica vim = new ViewIncluirMusica();

		vim.nomeMusica();

		String musica = vim.getNome();
		if (this.bds.nomeNãoExiste(musica)) {
			ViewExibirMusica vem = new ViewExibirMusica();

			vem.exibirMusica(this.bds.getMusicaPorArtista(musica));
		} else {
			JOptionPane.showMessageDialog(null, "Música não existe!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}

	}

	public void exibirMusicaPorLetra() {

		ViewObterLetra vol = new ViewObterLetra();

		vol.obterLetra();

		String letra = vol.getLetra();

		if (this.bds.letraNãoExiste(letra)) {
			ArrayList<String> musica = this.bds.getMusicaPorLetra(letra);

			ViewExibirMusica vem = new ViewExibirMusica();

			vem.exibeMusicaPorLetra(musica);
		} else {
			JOptionPane.showMessageDialog(null, "Não existe música com essa letra!", "ERRO", JOptionPane.ERROR_MESSAGE);
		}

	}
}
