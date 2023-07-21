package ExercicioRevisão;


public class Animal {

 private String nome;
 private int idade;
 private String especie;

 
 public Animal(String nome, int idade, String especie) {
     this.nome = nome;
     this.idade = idade;
     this.especie = especie;
 }

 
 public void emitirSom() {
	// TODO Auto-generated method stub
	
}


public Animal(String nome, String especie) {
     this(nome, 0, especie);
 }

 
 public Animal() {
     this("", 0, "");
 }

 
 public void emitirSom1() {
     System.out.println("O animal está emitindo um som!");
 }

 
 public void exibirInformacoes() {
     System.out.println("Nome: " + nome);
     System.out.println("Idade: " + idade);
     System.out.println("Espécie: " + especie);
 }


 public void emitirSom(String descricao) {
     System.out.println("O animal está emitindo um som: " + descricao);
 }

 
 public static class Cachorro extends Animal {
     public Cachorro(String nome, int idade) {
         super(nome, idade, "Cachorro");
     }


     
     @Override
     public void emitirSom() {
         System.out.println("O cachorro está latindo: Au au!");
     }
 }

 
 public static void main(String[] args) {
     Animal animal1 = new Animal("Meia noite", 5, "Cachorro");
     Animal animal2 = new Animal("Draco", 4,  "Gato");
     Animal animal3 = new Animal("Dragon", 3, "Iguana");

     animal1.exibirInformacoes();
     animal1.emitirSom1();
     animal1.emitirSom("Estranho");

     System.out.println();

     animal2.exibirInformacoes();
     animal2.emitirSom1();

     System.out.println();

     animal3.exibirInformacoes();
     animal3.emitirSom1();

     System.out.println();

     Animal.Cachorro cachorro1 = new Animal.Cachorro("Felix", 5);
     cachorro1.exibirInformacoes();
     cachorro1.emitirSom1();
     
     
 }
}
