package Felicidade;

public class Aranha extends Animal {
	public Aranha(String nome, int idade) {
		super(nome, idade);
	}
	
	public int getNumeroPatas() {
		return 8;
	}
	
	public void andar() {
		System.out.println(getNome() + " está se movendo com as patas. ");
	}
	
	public void comer() {
		System.out.println(getNome() + " está se alimentando. ");
	}
}
