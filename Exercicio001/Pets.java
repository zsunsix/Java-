package Exercicio001;

public class Pets {
	private String nome;
	private String animal;
	private int idade;
	
	public Pets(String nome, String animal, int idade){
		this.nome = nome;
		this.animal = animal;
		this.idade = idade;
		
	}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getAnimal() {
        return animal;
    }

    public int getIdade() {
        return idade;
    }
}