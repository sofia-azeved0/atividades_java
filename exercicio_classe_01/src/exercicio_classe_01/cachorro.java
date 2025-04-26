package exercicio_classe_01;

public class cachorro {
	
	String nome;
	String raca;
	int idade;
	
	public cachorro(String nome, String raca, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}
	
	public void latir () {
		System.out.println("Au auu!");
	}
	
}
