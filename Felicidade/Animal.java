package Felicidade;

public abstract class Animal implements Patas {
	private String nome;
	private int idade;
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	 public void setNome(String nome) {
	        this.nome = nome;
	    }
	
	
	public int getIdade() {
		return idade;
	}
	
}
