package br.com.alura.screenmatch.principal;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas{

	public static void main(String[] args) {

		Filme meuFilme = new Filme("O poderoso chefão",1970);
		meuFilme.avalia(9);
		Filme outroFilme = new Filme("Avatar", 2023);
		outroFilme.avalia(6);
		var filmeDoPaulo = new Filme("Dogville",2003);
		filmeDoPaulo.avalia(10);
		Series lost = new Series("Lost",2000);
		
		ArrayList<Titulo> lista = new ArrayList<>();
		
		lista.add(filmeDoPaulo);
		lista.add(meuFilme);
		lista.add(outroFilme);
		lista.add(lost);
		
		for(Titulo item : lista) {
			
			System.out.println(item.getNome());
			
			if(item instanceof Filme filme && filme.getClassificacao() > 2) {
			
				System.out.println(item);
				System.out.println("Classificação: " + filme.getClassificacao());
				
			}
			
		}
		
		ArrayList<String> buscarPorArtista = new ArrayList<>();
		
		buscarPorArtista.add("Adam Sandler");
		buscarPorArtista.add("Paulo");
		buscarPorArtista.add("Jacqueline");
		System.out.println(buscarPorArtista);
		
		Collections.sort(buscarPorArtista);
		System.out.println("Depois da oredenação");
		System.out.println(buscarPorArtista);
		System.out.println("Lista de titulos ordenados");
		Collections.sort(lista);
		System.out.println(lista);
		lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
	
		System.out.println(lista);
	}

}