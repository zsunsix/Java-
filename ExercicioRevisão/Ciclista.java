package ExercicioRevisão;

public class Ciclista extends Atleta{
	public Ciclista(String nome, int idade) {
		super(nome, idade);
	}
	
	public void pedalar() {
		System.out.println(getNome() + "está pedalando");
	}
	
}
