package Felicidade;

public class Gato extends Animal implements Pets {
	public Gato(String nome, int idade) {
		super(nome, idade);
	}
	
	public int getNumeroPatas() {
		return 4;
	}
	
	public void brincar() {
		System.out.println(getNome() + "está brincando com uma bolinha de papel. ");
	}
	
	public void andar() {
		System.out.println(getNome() + " está caminhando de forma engraçada. ");
	}
	
	public void comer() {
		System.out.println(getNome() + " está comendo sua ração. ");
	}
	
}
