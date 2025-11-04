import java.util.*;

public class Leitura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu filme favorito: ");
		String filme = sc.nextLine();
		System.out.println("Qual o ano de lançameno: ");
		int anoDeLançamento = sc.nextInt();
		System.out.println("Diga sua avaliação para o filme: ");
		double avaliacao = sc.nextDouble();
		
		System.out.println("O filme favoritido é: " + filme);
		System.out.println("Ano de lançamento: " + anoDeLançamento);
		System.out.println("Avaliação: " + avaliacao);
		
		sc.close();
		
	}

}