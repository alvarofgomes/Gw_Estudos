import br.com.alura.screenmatch.modelos.*;
import java.util.*;
import br.com.alura.screenmatch.calculos.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Filme meuFilme = new Filme("O poderoso chefão",1970);
		
		meuFilme.setDuracaoEmMinutos(180);
		System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
		
		meuFilme.exibirFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		
		System.out.println("Soma Das avalições: " + meuFilme.getSomaDasAvalicoes());
		System.out.println("Total das avalições: " + meuFilme.getTotalDeAvalicoes());
		
		System.out.println(String.format("Média das avaliações: " + "%.2f", meuFilme.pegaMedia()));
		
		Series lost = new Series("Lost",2000);
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporadas(10);
		lost.exibirFichaTecnica();
		lost.setMinutosPorEpisodio(50);
		System.out.println("Duração para maratonar serie: " + lost.getDuracaoEmMinutos());
		
		Filme outroFilme = new Filme("Avatar", 2023);
		
		outroFilme.setDuracaoEmMinutos(200);
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		calculadora.inclui(lost);
		System.out.println(calculadora.getTempoTotal());
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtrar(meuFilme);
		
		Episodios episodio = new Episodios();
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacoes(300);
		filtro.filtrar(episodio);
		
		var filmeDoPaulo = new Filme("Dogville",2003);
		filmeDoPaulo.setDuracaoEmMinutos(200);
		filmeDoPaulo.avalia(10);
		
		ArrayList<Filme> listaDeFilmes = new ArrayList<>();
		
		listaDeFilmes.add(filmeDoPaulo);
		listaDeFilmes.add(meuFilme);
		listaDeFilmes.add(outroFilme);
		
		System.out.println("Tamanho da lista: " + listaDeFilmes.size());
		System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());
		System.out.println("toString Do filme: " + listaDeFilmes.toString());
		

	}

}