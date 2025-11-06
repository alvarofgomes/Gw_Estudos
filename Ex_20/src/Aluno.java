public class Aluno {

	private String nome;
	private double n1;
	private double n2;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	
	public void calcularMedia() {
		
		System.out.println("Media do aluno: " + ((getN1() + getN2()) / 2));
		
	}
	
}