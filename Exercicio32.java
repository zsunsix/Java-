package Fundamentos;

public class Exercicio32 {

	public static void main(String[] args) {
		String str = "Hello World";
		String Resultado = str.replace("H", "F");
		System.out.println(Resultado);
		
		String palavra = "Hello World";
		String resultado2 = str.substring(3,8);
		System.out.println(resultado2);
		
		String stri = "      hello ";
		String Resul = str.trim();
		System.out.println(Resul);
		
		String ty = "Hello";
		char c = str.charAt(1); 
		System.out.println(c);
		
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals(s2); //false
		boolean b3 = s1.equalsIgnoreCase("azul"); //true
		boolean b4 = s1.equalsIgnoreCase("azul"); //true 
		
		
		
		
		
	}  

}
