package view;

import javax.swing.JOptionPane;

public class ViewIncluirArtista {
	private String nome;
	private String CPF;
	private String idade;

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return CPF;
	}

	public String getIdade() {
		return idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public void incluirArtista() {
		this.nome = JOptionPane.showInputDialog("Digite o nome do artista:");

		this.CPF = JOptionPane.showInputDialog("Digite o CPF do artista:");

		this.idade = JOptionPane.showInputDialog("Digite a idade do artista:");
	}

	public void nomeArtista() {
		this.nome = JOptionPane.showInputDialog("Digite o nome do artista:");
	}
}
