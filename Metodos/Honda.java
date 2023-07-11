package Metodos;

public class Honda extends Carro {
	    private String motor;

	    public Honda() {
	        
	    }

	    public Honda(String motor, String modelo, double preco) {
	        super(modelo, preco, modelo);
	        this.motor = motor;
	    }

	    public String getMotor() {
	        return motor;
	    }

	    public void setMotor(String motor) {
	        this.motor = motor;
	    }
	}