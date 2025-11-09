package br.com.alura.screenmatch.modelos;

public class Series extends Titulo{

	private int temporadas;
	private int episodiosPorTemporadas;
	private boolean ativa;
	private int minutosPorEpisodio;
	
	public Series(String nome, int anoDeLancamento) {
		super(nome, anoDeLancamento);
	}

	public int getTemporadas() {
		return temporadas;
	}
	
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	
	public int getEpisodiosPorTemporadas() {
		return episodiosPorTemporadas;
	}
	
	public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
		this.episodiosPorTemporadas = episodiosPorTemporadas;
	}
	
	public boolean getAtiva() {
		return ativa;
	}
	
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	public int getMinutosPorEpisodio() {
		return minutosPorEpisodio;
	}
	
	public void setMinutosPorEpisodio(int minutosPorEpisodio) {
		this.minutosPorEpisodio = minutosPorEpisodio;
	}
	
	@Override
	public int getDuracaoEmMinutos() {
		return getTemporadas() * getEpisodiosPorTemporadas() * getMinutosPorEpisodio();
	}
	
	@Override
	public String toString() {
		return "Serie: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
	}
	
}
