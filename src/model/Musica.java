package model;

public class Musica {
	private String nome;
	private String artista;
	private String album;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String tolinha() {
		return getNome() + ";" + getArtista() + ";" + getAlbum();
	}
	
	public Musica(String nome, String artista, String album) {
		super();
		this.nome = nome;
		this.artista = artista;
		this.album = album;
	}
	
	@Override
	public String toString() {
		return "Musica [nome=" + nome + ", artista=" + artista + ", album=" + album + "]";
	}
	
	

}
