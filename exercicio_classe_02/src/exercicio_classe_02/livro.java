package exercicio_classe_02;

public class livro {
	
	String titulo;
	String autor;
	int numPaginas;
	
	public livro(String titulo, String autor, int numPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	public void exibirInformacoes () {
		System.out.println(titulo + ", " + autor + ", " + numPaginas);
	
	}

}
