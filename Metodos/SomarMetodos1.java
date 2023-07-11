package Metodos;

public class SomarMetodos1 {

	public static void main(String[] args) {
		int resultado1 = somar(10, 20);
        System.out.println("Resultado 1: " + resultado1);

        int resultado2 = somar(10, 20, 30);
        System.out.println("Resultado 2: " + resultado2);
    }

    static int somar(int a, int b) {
        return a + b;
    }

    static int somar(int a, int b, int c) {
        return a + b + c;
    }
}