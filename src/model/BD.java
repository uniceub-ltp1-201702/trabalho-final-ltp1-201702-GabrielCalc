package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;
import util.ExcluirArtista;
import util.ExcluirMusica;

public class BD {
	private ArrayList<Artista> artistas;
	private ArrayList<Musica> musicas;
	private String fileName = "artistas.txt";
	private String fileNames = "músicas.txt";
	private DocumentWriter dw;
	private DocumentReader dr;
	private ExcluirArtista ea;
	private ExcluirMusica em;

	public BD() {
		this.artistas = new ArrayList<Artista>();
		this.musicas = new ArrayList<Musica>();
		this.dr = new DocumentReader();
		this.dw = new DocumentWriter();

		this.ea = new ExcluirArtista();
		this.em = new ExcluirMusica();
	}

	public void carregarArtista() {
		ArrayList<String> linhas = this.dr.read(fileName);

		for (int i = 0; i < linhas.size(); i++) {

			String[] linhaArtista = linhas.get(i).split(";");
			Artista a = new Artista(linhaArtista[0], linhaArtista[1], Integer.parseInt(linhaArtista[2]));
			this.artistas.add(a);

		}

	}

	public void carregarMusica() {
		ArrayList<String> linhas = this.dr.read(fileNames);

		for (int i = 0; i < linhas.size(); i++) {

			String[] linhaMusica = linhas.get(i).split(";");
			Musica m = new Musica(linhaMusica[0], linhaMusica[1], linhaMusica[2]);
			this.musicas.add(m);

		}

	}

	public void gravarArtista(Artista a) {

		this.artistas.add(a);
		DocumentWriter dw = new DocumentWriter();
		dw.write(this.fileName, a.tolinha());

	}

	public void gravarMusica(Musica m) {

		this.musicas.add(m);
		DocumentWriter dw = new DocumentWriter();
		dw.write(this.fileNames, m.tolinha());

	}

	public ArrayList<Artista> getArtistas() {
		return artistas;
	}

	public ArrayList<Musica> getMusicas() {
		return musicas;
	}

	public void insereArtista(Artista artista) {
		this.artistas.add(artista);
	}

	public void insereMusica(Musica musica) {
		this.musicas.add(musica);
	}

	public void excluirArtista() {
		this.ea.remover(this.fileName);
	}

	public void excluirMusica() {
		this.ea.remover(this.fileNames);
	}

	public ArrayList<String> getMusicaPorArtista(String artista) {
		ArrayList<String> resultado = new ArrayList<String>();

		for (int i = 0; i < this.musicas.size(); i++) {
			if (this.musicas.get(i).getArtista().equals(artista)) {

				resultado.add("Musica: " + this.musicas.get(i).getNome() + "\n");
			}
		}
		return resultado;
	}

	public String getMusicaPorNome(String nome) {
		String resultado = "";

		for (int i = 0; i < this.musicas.size(); i++) {
			if (this.musicas.get(i).getNome().equals(nome)) {
				resultado = "Musica: " + this.musicas.get(i).getNome() + " // " + "Musica: "
						+ this.musicas.get(i).getAlbum() + " // " + "Artista: " + this.musicas.get(i).getArtista();
			}
		}
		return resultado;
	}

	public ArrayList<String> getMusicaPorLetra(String letra) {

		ArrayList<String> resultado = new ArrayList<String>();

		for (int i = 0; i < this.musicas.size(); i++) {
			if (this.musicas.get(i).getNome().contains(letra)) {
				resultado.add(this.musicas.get(i).getNome());

			}
		}
		return resultado;
	}

	public boolean artistaExiste(String CPF) {
		boolean resultado = false;

		for (int i = 0; i < this.artistas.size(); i++) {
			if (this.artistas.get(i).getCPF().equals(CPF)) {
				resultado = true;

			}

		}
		return resultado;

	}

	public boolean musicaExiste(String album, String nome) {
		boolean resultado = false;

		for (int i = 0; i < this.musicas.size(); i++) {
			if (album.equals(this.musicas.get(i).getAlbum()) && nome.equals(this.musicas.get(i).getNome())) {
				resultado = true;

			}

		}
		return resultado;

	}

	public boolean nomeNãoExiste(String nome) {
		boolean resultado = false;

		for (int i = 0; i < this.musicas.size(); i++) {
			if (this.musicas.get(i).getNome().equals(nome)) {
				resultado = true;

			}

		}
		return resultado;

	}

	public boolean artistaNãoExiste(String nome) {
		boolean resultado = false;

		for (int i = 0; i < this.musicas.size(); i++) {
			if (this.musicas.get(i).getArtista().equals(nome)) {
				resultado = true;

			}

		}
		return resultado;

	}

	public boolean letraNãoExiste(String letra) {
		boolean resultado = false;

		for (int i = 0; i < this.musicas.size(); i++) {
			if (this.musicas.get(i).getNome().contains(letra)) {
				resultado = true;

			}

		}
		return resultado;

	}

}
