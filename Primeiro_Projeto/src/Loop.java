import java.util.*;

public class Loop {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double mediaAvaliacao = 0.0;
		double nota = 0.0;

		for(int i = 0; i < 3; i++) {
			
			System.out.println("Diga sua avaliação para o filme: ");
			nota = sc.nextDouble();
			
			mediaAvaliacao += nota;
			
		}
		
		System.out.println("Média de avaliação: " + (mediaAvaliacao / 3));
		
		sc.close();
	}

}