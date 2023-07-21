package Felicidade;

public class Main {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro("Meia noite", 5);
		Gato gato1 = new Gato("Draco", 4);
		Aranha aranha1 = new Aranha("pope francis", 2);
		Peixe peixe1 = new Peixe("Nemo", 3);
		
		cachorro1.andar();
		cachorro1.comer();
		cachorro1.brincar();
		
		gato1.andar();
		gato1.comer();
		gato1.brincar();
		
		aranha1.andar();
		aranha1.comer();
		
		peixe1.andar();
		peixe1.comer();
		
		
		System.out.println(cachorro1.getNome() + " tem " + cachorro1.getNumeroPatas() + " patas. ");
		System.out.println(gato1.getNome() + " tem " + gato1.getNumeroPatas() + " patas. ");
		System.out.println(aranha1.getNome() + " tem " + aranha1.getNumeroPatas() + " patas. ");
		System.out.println(peixe1.getNome() + " tem " + peixe1.getNumeroPatas() + " patas. ");
		
		
	}

}
