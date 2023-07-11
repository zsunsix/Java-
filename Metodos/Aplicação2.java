package Metodos;

public class Aplicação2 {

	public static void main(String[] args) {
		 Honda hondaFitPreto = new Honda("2.0 Flex", "Honda Accord", 60000.0);

	       
	        System.out.println("Motor do Honda Fit Preto: " + hondaFitPreto.getCor());
	        System.out.println("Modelo do Honda Fit Preto: " + hondaFitPreto.getModelo());
	        System.out.println("Preço do Honda Fit Preto: " + hondaFitPreto.getPreco());
	    }
	}