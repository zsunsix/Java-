package Membros;

public class UsoMembros {

	public static void main(String[] args) {
		DataNascimento dt = new DataNascimento();
		DataNascimento dt2 = new DataNascimento();
		dt.dia = 8;
		dt.mes = 9;
		dt.ano = 2000;
		
		dt2.dia = 8;
		dt2.mes = 9;
		dt2.ano = 2000;
		System.out.printf("A data de Nascimento é %d %d %d \n", dt.dia, dt.mes, dt.ano); 
		System.out.printf("A data de Nascimento é %d %d %d \n", dt2.dia, dt2.mes, dt2.ano);
	}
}