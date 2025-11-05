import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int fatorial = 1;
		
		System.out.println("Digite um número inteiro: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			fatorial *= i;
			
		}

		System.out.println(fatorial);
		
	}

}
