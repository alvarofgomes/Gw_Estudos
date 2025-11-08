import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Área = lado x lado 
		System.out.println("Digite um número inteiro para escolher uma opção abaixo. ");
		System.out.println("Digite [1] Calcular área do quadrado");
		System.out.println("Digite [2] Calcular área do círculo");
		int opc = sc.nextInt();
		
		if(opc == 1) {
			System.out.println("Área do quadrado: ");
			System.out.println("Digite a area do quadrado: ");
			double n = sc.nextDouble();
			
			System.out.println("Área do quadrado = " + String.format("%.2f",(n*n)));
			
		}
		
		if(opc == 2) {
			System.out.println("Área do Círculo: ");
			System.out.println("Digite a área do círculo: ");
			Double n = sc.nextDouble();
			
			System.out.println("Área do cículo = " + String.format("%.2f", (3.14*(n*n))));
			
		}
		
	}

}
