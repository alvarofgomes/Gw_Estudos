import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite duas notas: ");
		double n1= sc.nextDouble();
		double n2 = sc.nextDouble();
		
		double m = (n1 + n2) / 2;
		
		System.out.println("Média: " + String.format("%.2f", m));

	}

}