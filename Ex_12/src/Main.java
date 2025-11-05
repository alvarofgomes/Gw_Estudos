import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número inteiro: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		int n2 = sc.nextInt();
		
		if(n1 == n2) {
			System.out.println("Os números são iguais. ");
		}else {
			System.out.println("Os números são difirentes. ");
		
		if(n1 > n2) {
			System.out.println("O primeiro número é maior que o segundo. ");
		}else {
			System.out.println("O segundo número é maior que o primeiro. ");
			}
		}
		sc.close();
	}

}