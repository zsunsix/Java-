package Felicidade;

public class Cachorro extends Animal implements Pets{
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	public int getNumeroPatas() {
		return 4;
	}
	
	public void brincar() {
		System.out.println(getNome() + " está brincando de buscar vareta. ");
	}
	
	public void andar() {
		System.out.println(getNome() + " está andando com suas patas. ");
	}
	
	public void comer() {
		System.out.println(getNome() + " está comendo a ração. ");
	}
	
}
