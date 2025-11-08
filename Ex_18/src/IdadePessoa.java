public class IdadePessoa {

	private String nome;
	private int idade;
	
	public IdadePessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void verificarIdade() {
		if(getIdade() >= 18) {
			System.out.println("nome: " + getNome() + " é maior de idade. ");
		}else {
			System.out.println("nome: " + getNome() + " é menor de idade. ");
		}
	}
	
}
