public class Livro {

	private String titulo;
	private String autor;
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void exibirDetalhes() {
		System.out.println("Titulo do livro: " + getTitulo());
		System.out.println("Nome do autor do livro: " + getAutor());
	}
	
}