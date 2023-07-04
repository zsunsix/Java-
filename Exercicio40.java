package Fundamentos;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um texto: ");
		String texto = scanner.nextLine();
		
		String textoMaiusculo = texto.toUpperCase();
		System.out.println("Texto em letras maiusculas: " + textoMaiusculo);
		
		scanner.close();

	}

}
