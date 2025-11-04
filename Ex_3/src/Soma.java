import java.util.*;

public class Soma {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite o segundo nome: ");
		int n2 = sc.nextInt();
		
		int s = n1 + n2;
		
		System.out.printf("A soma de %d + %d = %d ",n1,n2,s);

	}

}
