package Fundamentos;

public class Exercicio20 {

	public static void main(String[] args) {
        int contador = 1;

        while (contador <= 20) {
            System.out.println(contador);
            if (contador == 9) {
                break;
            }
            contador++;
        }
    }
}
