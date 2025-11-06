package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.*;

public class CalculadoraDeTempo {

	private int tempoTotal;

	public int getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(int tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
	
//	public void inclui(Filme f) {
//		setTempoTotal(getTempoTotal() + f.getDuracaoEmMinutos()); 
//	}
//	
//	public void inclui(Series s) {
//		setTempoTotal(getTempoTotal() + s.getDuracaoEmMinutos()); 
//	}
	
	public void inclui(Titulo titulo) {
		System.out.println("Adicionando duração em minutos: " + titulo);
		setTempoTotal(getTempoTotal() + titulo.getDuracaoEmMinutos()); 
	}
	
}