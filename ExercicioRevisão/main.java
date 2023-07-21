package ExercicioRevisão;

public class main {

	public static void main(String[] args) {
		Ciclista ciclista1 = new Ciclista("Ricardo", 22);
		Corredor corredor1 = new Corredor("Ana", 25);
		Nadador nadador1 = new Nadador("Arthur", 17);
		
		ciclista1.aquecido();
		corredor1.aquecido();
		nadador1.aquecido();
		
		if (ciclista1.estaAquecido()) {
			ciclista1.pedalar();
		}
		
		if (corredor1.estaAquecido()) {
			corredor1.correr();
		}
		
		if (nadador1.estaAquecido()) {
			nadador1.nadar();
		}
		
		System.out.println("Nome do ciclista: " + ciclista1.getNome());
		System.out.println("Nome do corredor: " + corredor1.getNome());
		System.out.println("Nome do nadador: " + nadador1.getNome());
		
		System.out.println("Idade do ciclista: " + ciclista1.getIdade());
		System.out.println("Idade do corredor: " + corredor1.getIdade());
		System.out.println("Idade do nadador: " + nadador1.getIdade());
		
	}

}
