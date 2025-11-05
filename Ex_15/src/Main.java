import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("O número " + n + " é par. ");
		}else {
			System.out.println("O número " + n + " é ímpar. ");
		}
		
		sc.close();
	}

}
