import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoOriginal = 150.00;
		double percentualDesconto = 10;
		
		double valorComDesconto = precoOriginal - (precoOriginal * (percentualDesconto / 100));

		System.out.println("Preço com desconto: " + valorComDesconto);
				
	}

}
