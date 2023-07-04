package Fundamentos;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int contador = 1;

        System.out.println("Números pares:");
        while (contador <= numero) {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador++;
        }

        contador = 1;

        System.out.println("Números ímpares:");
        while (contador <= numero) {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
            contador++;
        }

        scanner.close();
    }
}
