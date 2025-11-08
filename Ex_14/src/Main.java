import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("Digite um número inteiro: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(n + " X " + i + " = " + (n*i));
			
		}
		
		sc.close();
	}

}
