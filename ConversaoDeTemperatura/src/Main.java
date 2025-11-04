import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperaura em celsius: ");
		double c = sc.nextDouble();
		
		//Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.

		double f = (c * 1.8) + 32;
		
		System.out.printf("A temperatura em Fahrenheit: %.2f ",f);
		
	}

}