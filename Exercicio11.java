package Fundamentos;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("Digite o primeiro numero");
		int numero1 = numero.nextInt();
		
		System.out.println("Digite o segundo numero");
		int numero2 = numero.nextInt();
		
		System.out.println("Digite o terceiro numero");
		int numero3 = numero.nextInt();
		
		int menorNumero = numero1;
		
		if (numero2 < menorNumero) {
			menorNumero = numero2;
		}
		
		if (numero3 < menorNumero) {
			menorNumero = numero3; 
		}
		System.out.println("O menor numero é: " +  menorNumero);
	}

}
