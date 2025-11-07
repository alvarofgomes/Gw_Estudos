package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.*;

public class Main {

	public static void main(String[] args) {
			
		Musica minhaMusica = new Musica();
		minhaMusica.setTitulo("Forever");
		minhaMusica.setArtista("kiss");

		for(int i = 0; i < 1000; i++) {
			minhaMusica.reproduzir();
		}
		
		for(int i = 0; i < 50; i++) {
			minhaMusica.curte();
		}
		
		Podcast meuPodcast = new Podcast();
		meuPodcast.setTitulo("BolhaDev");
		meuPodcast.setApresentador("Marcus Mendes");
		
		for(int i = 0; i < 5000; i++) {
			meuPodcast.reproduzir();
		}
		
		for(int i = 0; i < 1000; i++) {
			meuPodcast.curte();
		}
		
		MinhasPreferidas prefiridas = new MinhasPreferidas();
		prefiridas.inclui(meuPodcast);
		prefiridas.inclui(minhaMusica);
		
	}

}