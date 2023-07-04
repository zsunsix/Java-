package Fundamentos;

import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        int numeroPalavras = contarPalavras(texto);
        System.out.println("Número de palavras: " + numeroPalavras);

        scanner.close();
    }

    public static int contarPalavras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }

        
        String[] palavras = texto.trim().split("\\s+");
        return palavras.length;
    }
}