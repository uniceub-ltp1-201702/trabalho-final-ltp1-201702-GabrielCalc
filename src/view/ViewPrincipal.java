package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {
	private String opcao;
	private String escolha;
	private String exclusao;
	private String consulta;
	
	public String getOpcao() {
		this.opcao = JOptionPane.showInputDialog("Escolha uma opção\n" + "1 - Inclusão\n" + "2 - Exclusão\n" + "3 - Consultar\n" + "4 - Sair\n");
		return this.opcao;
	}
	
	public String getEscolha() {
		this.escolha = JOptionPane.showInputDialog("Escolha uma opção\n" + "1 - Inclusão de artista\n" + "2 - Inclusão de musica\n" + "3 - Sair\n");
		return this.escolha;
	}
	
	public String getExclusao() {
		this.exclusao = JOptionPane.showInputDialog("Escolha uma opção\n" + "1 - Exclusão de artista\n" + "2 - Exclusão de musica\n" + "3 - Sair\n");
		return this.exclusao;
	}
	
	public String getConsulta() {
		this.consulta = JOptionPane.showInputDialog("Escolha uma opção\n" + "1 - Músicas de um artista\n" + "2 - Música por nome \n" + "3 - Música por letra\n" + "4 - Sair\n");
		return this.consulta;
	}
	

}
