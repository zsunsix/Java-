package Herança;

public abstract class Animal {
	protected double peso;
	protected String nome;
	protected String cor;
	protected String tipoDePelo;
	
public Animal(double peso, String nome, String cor, String tipoDePelo) {
	this.peso = peso;
	this.nome = nome;
	this.cor = cor;
	this.tipoDePelo = tipoDePelo;
}
	public abstract void comer();
	public abstract void som();
}
