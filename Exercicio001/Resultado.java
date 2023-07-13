package Exercicio001;

public class Resultado {

	public static void main(String[] args) {
		Forma forma = new Forma();
		forma.desenhar();
		forma.desenhar("Vermelho");
		
		Triangulo triangulo = new Triangulo();
		triangulo.desenhar();
		triangulo.desenhar("Azul", 2);
		
		Forma formaPolimorfica = new Triangulo();
		formaPolimorfica.desenhar();
		formaPolimorfica.desenhar("Verde");

	}

}
