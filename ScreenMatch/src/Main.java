import br.com.alura.screenmatch.modelos.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Filme meuFilme = new Filme();
		
		meuFilme.setNome("O poderoso chefão");
		meuFilme.setAnoDeLancamento(1970);
		meuFilme.setDuracaoEmMinutos(180);
		System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
		
		meuFilme.exibirFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		
		System.out.println("Soma Das avalições: " + meuFilme.getSomaDasAvalicoes());
		System.out.println("Total das avalições: " + meuFilme.getTotalDeAvalicoes());
		
		System.out.println(String.format("Média das avaliações: " + "%.2f", meuFilme.pegaMedia()));
		
		Series lost = new Series();
		lost.setNome("Lost");
		lost.setAnoDeLancamento(2000);
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporadas(10);
		lost.exibirFichaTecnica();
		lost.setMinutosPorEpisodio(50);
		System.out.println("Duração para maratonar serie: " + lost.getDuracaoEmMinutos());
		
		sc.close();
	}

}