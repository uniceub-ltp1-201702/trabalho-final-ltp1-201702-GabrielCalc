package view;

import javax.swing.JOptionPane;

public class ViewIncluirMusica {
	private String nome;
	private String artista;
	private String album;
	

		public void incluirMusica() {
			
			this.nome = JOptionPane.showInputDialog("Digite o nome da musica:");
			
			this.artista = JOptionPane.showInputDialog("Digite o artista da música:");
			
			this.album = JOptionPane.showInputDialog("Digite o álbum da música:");
			
			JOptionPane.showMessageDialog(null, "A música " + this.nome + " pertence a " + this.artista + "!");
		}
		
		public void nomeMusica() {
			this.nome = JOptionPane.showInputDialog("Digite o nome da música:");
		}
		
		public String getNome() {
			return nome;
		}

		public String getArtista() {
			return artista;
		}

		public String getAlbum() {
			return album;
		}

		
	}


