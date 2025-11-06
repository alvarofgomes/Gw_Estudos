package br.com.alura.screenmatch.modelos;

public class Titulo {

	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvalicoes;
	private int totalDeAvalicoes;
	private int duracaoEmMinutos;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public boolean getIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public double getSomaDasAvalicoes() {
		return somaDasAvalicoes;
	}

	public void setSomaDasAvalicoes(double somaDasAvalicoes) {
		this.somaDasAvalicoes = somaDasAvalicoes;
	}

	public int getTotalDeAvalicoes() {
		return totalDeAvalicoes;
	}

	public void setTotalDeAvalicoes(int totalDeAvalicoes) {
		this.totalDeAvalicoes = totalDeAvalicoes;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
	
	public void exibirFichaTecnica() {
		
		System.out.println("Nome do filme: " + getNome());
		System.out.println("Ano de lançamento: " + getAnoDeLancamento());
		
	}
	
	public void avalia(double nota) {
		setSomaDasAvalicoes(getSomaDasAvalicoes() + nota);
		setTotalDeAvalicoes(getTotalDeAvalicoes() + 1);
	}
	
	public double pegaMedia() {
		return getSomaDasAvalicoes() / getTotalDeAvalicoes();
	}
	
}