package exercicio_classe_02;

public class informacoes {

	public static void main(String[] args) {
		livro l01 = new livro ("Livre-se dos 'Corvos'", "Luiz Marins", 222);
		livro l02 = new livro ("Família Entre Laços e Nós", "Valci Silva", 223);
	
		l01.exibirInformacoes();
		l02.exibirInformacoes();
	}

}
