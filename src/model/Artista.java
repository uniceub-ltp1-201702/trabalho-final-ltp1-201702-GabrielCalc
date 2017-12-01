package model;

public class Artista {
	private String nome;
	private String CPF;
	private int idade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String tolinha() {
		return getNome() + ";" + getCPF() + ";" + getIdade();
	}
	
	@Override
	public String toString() {
		return "Artista [nome=" + nome + ", CPF=" + CPF + ", idade=" + idade + "]";
	}
	public Artista(String nome, String cPF, int idade) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.idade = idade;
	}
	
	
	

}
