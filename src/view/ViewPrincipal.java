package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {
	private String opcao;
	private String escolha;
	private String exclusao;
	private String consulta;
	
	public String getOpcao() {
		this.opcao = JOptionPane.showInputDialog("Escolha uma op��o\n" + "1 - Inclus�o\n" + "2 - Exclus�o\n" + "3 - Consultar\n" + "4 - Sair\n");
		return this.opcao;
	}
	
	public String getEscolha() {
		this.escolha = JOptionPane.showInputDialog("Escolha uma op��o\n" + "1 - Inclus�o de artista\n" + "2 - Inclus�o de musica\n" + "3 - Sair\n");
		return this.escolha;
	}
	
	public String getExclusao() {
		this.exclusao = JOptionPane.showInputDialog("Escolha uma op��o\n" + "1 - Exclus�o de artista\n" + "2 - Exclus�o de musica\n" + "3 - Sair\n");
		return this.exclusao;
	}
	
	public String getConsulta() {
		this.consulta = JOptionPane.showInputDialog("Escolha uma op��o\n" + "1 - M�sicas de um artista\n" + "2 - M�sica por nome \n" + "3 - M�sica por letra\n" + "4 - Sair\n");
		return this.consulta;
	}
	

}
