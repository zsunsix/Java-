package Metodos;

public class Carro {
	private String cor;
    private double preco;
    private String modelo;

    public Carro() {
        
    }

    
    public Carro(String cor, double preco, String modelo) {
        this.cor = "preta";
        this.preco = preco;
        this.modelo = modelo;
    }

   
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
