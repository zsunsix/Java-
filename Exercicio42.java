package Fundamentos;

import java.util.StringJoiner;

public class Exercicio42 {

	 public static void main(String[] args) {
	        String[] array = {"a", "vida", "é", "bela"};

	        String texto = formatarTexto(array);
	        System.out.println(texto);
	    }

	    public static String formatarTexto(String[] array) {
	        StringJoiner stringJoiner = new StringJoiner(" ");

	        for (int i = array.length - 1; i >= 0; i--) {
	            stringJoiner.add(array[i].toUpperCase());
	        }

	        return stringJoiner.toString();
	    }
	}
