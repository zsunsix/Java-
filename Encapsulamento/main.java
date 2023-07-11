package Encapsulamento;

public class main {

	public static void main(String[] args) {
		Numeros numeros = new Numeros();
		
		numeros.setNumero(45);
		System.out.println("O número é: " + numeros.getNumero());
		
		numeros.setNumero(88);
		System.out.println("Agora o número é: " + numeros.getNumero());

	}

}
