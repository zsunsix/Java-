package Exercicio001;

public class FaturaTeste {

	public static void main(String[] args) {
		Fatura fatura = new Fatura("001", "Teclado", 5, 39.99);
		
		System.out.println("Numero: " + fatura.getNumero());
		System.out.println("Descrição: " + fatura.getDescricao());
		System.out.println("Quantidade: " + fatura.getQuantidade());
		System.out.println("Preço: " + fatura.getPreco());
		
		double total = fatura.getTotalFatura();
		System.out.println("Total da Fatura:" + total);

	}

}
