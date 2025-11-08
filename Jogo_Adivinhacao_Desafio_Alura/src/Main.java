import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int t = 5;
		int numeroAleatorio = new Random().nextInt(100);
		int numaroUsuario = 0;
		
		System.out.println(numeroAleatorio);
		
		for(int i = 0; i < t; i++) {
			
			System.out.println("Digite um número inteiro: ");
			numaroUsuario = sc.nextInt();
			
			if(numaroUsuario == numeroAleatorio) {
				System.out.println("Você acertou! Parabens");
				break;
			}else {
				System.out.println("Você errou tente de novo. ");
				System.out.println("Você tem: " + (t-1) + " Tentativas. ");
			}
			
			if(numaroUsuario < numeroAleatorio) {
				System.out.println("O número digitado é: " + numaroUsuario + " o número aleatório é menor. ");
			}else {
				System.out.println("O número digitado é: " + numaroUsuario + " o número aleatório é maior. ");
			}
			
		}

		sc.close();
	}

}