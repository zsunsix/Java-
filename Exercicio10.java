package Fundamentos;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("Digite um numero");
		int resp = numero.nextInt();
		System.out.println(resp >= 0 ? "Positivo": resp == 0 ? "Neutro": "Negativo");
		
		
		
	}

}
