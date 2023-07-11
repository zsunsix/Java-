package Herança;

public class Cachorro extends Animal {
	public Cachorro(double peso, String nome, String cor, String tipoDePelo) {
		super(peso, nome, cor, tipoDePelo);
	}

	@Override
	public void comer() {
		System.out.println("O cachorro " + nome + "está comendo.");
		
	}

	@Override
	public void som() {
		latir();		
	}
	
	public void latir() {
		System.out.println("O cachorro " + nome + "está fazendo som de latido");
	}
}
