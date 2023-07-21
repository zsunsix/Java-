package Felicidade;

public class Peixe extends Animal{
	public Peixe(String nome, int idade) {
		super(nome, idade);
	}
	
	public int getNumeroPatas() {
		return 0;
	}
	
	public void andar() {
		System.out.println(getNome() + " está nadando. ");
	}
	
	public void comer() {
		System.out.println(getNome() + " está comendo no seu aquário. ");
	}
	
}
