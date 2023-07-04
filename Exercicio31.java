package Fundamentos;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int numeroAlunos = 5;
        double[] notas = new double[numeroAlunos];

        for (int i = 0; i < numeroAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

       
        double soma = 0;
        for (int i = 0; i < numeroAlunos; i++) {
            soma += notas[i];
        }
        double media = soma / numeroAlunos;

        
        System.out.println("A média da turma é: " + media);
    }
}
