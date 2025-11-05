import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Filme meuFilme = new Filme();
		
		meuFilme.nome = "O poderoso chefão";
		meuFilme.anoDeLancamento = 1970;
		meuFilme.duracaoEmMinutos = 180;
		
		meuFilme.exibirFichaTecnica();
		
		sc.close();
	}

}