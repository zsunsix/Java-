package Exercicio001;

public class PetsTeste {

	public static void main(String[] args) {
		Pets pet = new Pets("Jake", "Cachorro", 3);
		
		System.out.println("Nome: " + pet.getNome());
		System.out.println("Animal: " + pet.getAnimal());
		System.out.println("Idade: " + pet.getIdade());
		
		pet.setNome("Draco");
		pet.setAnimal("Gato");
		pet.setIdade(5);
		
		System.out.println("Nome: " + pet.getNome());
		System.out.println("Animal: " + pet.getAnimal());
		System.out.println("Idade: " + pet.getIdade());

	}

}
