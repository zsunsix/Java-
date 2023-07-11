package Metodos;

public class JavaTeste {

	public static void main(String[] args) {
		JavaMetodos metodos = new JavaMetodos();
		
		int idade = metodos.idade();
		System.out.println("Idade: " + idade);
		
		double valor = metodos.valor();
		System.out.println("Valor: " + valor);
		
		String nome = metodos.nome();
		System.out.println("Nome: " + nome);
		
		boolean estado = metodos.estado();
		System.out.println("Estado: " + estado);
	}

}
