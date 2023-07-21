package ExercicioRevisão;

public class Corredor extends Atleta {
	public Corredor(String nome, int idade) {
		super(nome, idade);
	}
	
	public void correr() {
		System.out.println(getNome() + "está correndo.");
	}
	
}
