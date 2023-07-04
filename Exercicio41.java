package Fundamentos;

import java.util.StringJoiner;

public class Exercicio41 {

	public static void main(String[] args) {
        String[] array = {"a", "vida", "é", "bela"};

        String texto = formatarTexto(array);
        System.out.println(texto);
    }

    public static String formatarTexto(String[] array) {
        StringJoiner stringJoiner = new StringJoiner(" ");

        for (String palavra : array) {
            stringJoiner.add(palavra.toUpperCase());
        }

        return stringJoiner.toString();
    }
}
