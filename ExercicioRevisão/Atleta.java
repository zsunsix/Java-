package ExercicioRevisão;

public class Atleta {
	private String nome;
	private int idade;
	private boolean aquecido;
	
public Atleta(String nome, int idade) {
	this.nome = nome;
	this.idade = idade;
	this.aquecido = false;
}	
	public void aquecido() {
		this.aquecido = true;
        System.out.println(nome + " está se aquecendo.");
    }

	public boolean estaAquecido() {
		return aquecido;
	}
 
    public String getNome() {
        return nome;
    }

   
    public int getIdade() {
        return idade;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    	
    }
    
    public void setIdade() {
    	this.idade = idade;
    }
    
}
	



