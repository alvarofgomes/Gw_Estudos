import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite um número negativo ou positivo: ");
		int n = sc.nextInt();
		
		if(n == 0) {
			System.out.println("Número 0 é Nulo. ");
		}else if(n > 0) {
			System.out.println("Número positivo. ");
		}else {
			System.out.println("Número negativo. ");
		}
		
		sc.close();
	}

}
