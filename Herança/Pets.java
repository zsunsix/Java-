package Herança;

public class Pets {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro(10.5, "Bolt", "Preto", "Curto");
		cachorro.comer();
		cachorro.som();
		
		Gato gato = new Gato(5.5, "Meia noite", "Branco", "Longo");
		gato.comer();
		gato.som();
	}

}
