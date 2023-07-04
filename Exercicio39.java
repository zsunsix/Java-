package Fundamentos;

public class Exercicio39 {

	public static void main(String[] args) {
		String texto01 = "será que são iguais?";
		String texto02 = "será que são iguais?";

		boolean saoIguais = texto01.equals(texto02);

		if (saoIguais) {
		    System.out.println("Os textos são iguais.");
		} else {
		    System.out.println("Os textos são diferentes.");
		}

	}

}
