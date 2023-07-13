package Exercicio001;

public class main {

	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo (5, 3);
		
		double area = retangulo.calcularArea();
		double perimetro = retangulo.calcularPerimetro();
		
		System.out.println("Area do retangulo: " + area);
		System.out.println("Perimetro do retangulo: " + perimetro);
	}

}
