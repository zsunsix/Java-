package ExercicioRevisão;

public class Nadador extends Atleta {
	public Nadador(String nome, int idade) {
		super(nome, idade);
	}
	
	public void nadar() {
		System.out.println(getNome() + "está nadando.");
	}
	
}
