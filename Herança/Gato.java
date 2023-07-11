package Herança;

public class Gato extends Animal{
	public Gato(double peso, String nome, String cor, String tipoDePelo) {
		super(peso, nome, cor, tipoDePelo);
	}

	@Override
	public void comer() {
		 System.out.println("O gato " + nome + " está comendo.");
		
	}

	@Override
	public void som() {
		miar();
		
	}
	
	public void miar() {
		System.out.println("O gato " + nome + "está fazendo som de miado.");
	}
}
