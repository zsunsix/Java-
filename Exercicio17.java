package Fundamentos;

import java.util.Scanner;

public class Exercicio17 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro: ");
	        int numero = scanner.nextInt();

	        System.out.println("Números pares:");
	        for (int i = 1; i <= numero; i++) {
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	        }

	        System.out.println("Números ímpares:");
	        for (int i = 1; i <= numero; i++) {
	            if (i % 2 != 0) {
	                System.out.println(i);
	            }
	        }

	        scanner.close();
	    }
	}
	

