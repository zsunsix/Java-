package Fundamentos;

public class Exercicio26 {

	public static void main(String[] args) {
		int limiteInferior = 1;
        int limiteSuperior = 20;

        int somaMultiplos3 = 0;
        int somaMultiplos5 = 0;
        int somaTotal = 0;

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (i % 3 == 0) {
                somaMultiplos3 += i;
            }
            if (i % 5 == 0) {
                somaMultiplos5 += i;
            }
            
        }

        System.out.println("Soma dos múltiplos de 3: " + somaMultiplos3);
        System.out.println("Soma dos múltiplos de 5: " + somaMultiplos5);
        System.out.println(somaMultiplos3 + somaMultiplos5);
    }
}