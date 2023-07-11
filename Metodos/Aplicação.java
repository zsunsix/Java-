package Metodos;

public class Aplicação {

	public static void main(String[] args) {
		Carro prototipoDeCarro = new Carro();

        Carro civicPreto = new Carro("Preto", 40000.0, "New Civic");

        Carro golfAmarelo = new Carro("Amarelo", 38000.0, "Golf");

       
        System.out.println("Protótipo de Carro: " + prototipoDeCarro.getModelo());
        System.out.println("Cor do Civic Preto: " + civicPreto.getCor());
        System.out.println("Preço do Golf Amarelo: " + golfAmarelo.getPreco());
    }
}