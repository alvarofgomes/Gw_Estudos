package br.com.alura.screenmatch.principal;

import java.util.ArrayList;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {

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
			
			Filme filme = (Filme) item;
			
			System.out.println(item);
			System.out.println("Classificação: " + filme.getClassificacao());
			
		}

	}

}
