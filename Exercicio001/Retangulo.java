package Exercicio001;

public class Retangulo {
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
		
	}
	
	public double calcularArea() {
		return base * altura; 
	}
	
	public double calcularPerimetro() {
		return 2 * (base + altura);
	}
}
