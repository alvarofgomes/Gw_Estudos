import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite o tipo de conta: ");
		String tipoDeConta = sc.nextLine();
		
		System.out.println("Digite o saldo da conta: ");
		double saldo = sc.nextDouble();
		
		
		System.out.println("===========================");
		System.out.println("Dados iniciais do cliente: ");
		System.out.println();
		System.out.println("Nome: " + nome);
		System.out.println("Tipo de conta: " + tipoDeConta);
		System.out.println("Saldo inicial: " + String.format("%.2f", saldo));
		System.out.println("===========================");
		
		int opc = 0;
		System.out.println("Operações: ");
		while(opc != 4) {
			
			System.out.println("Digite [1] para consultar saldo: ");
			System.out.println("Digite [2] para receber o valor: ");
			System.out.println("Digite [3] para transferir valor: ");
			System.out.println("Digite [4] para sair: ");
			System.out.println();
			System.out.println("Digite a operação desejada: ");
			opc = sc.nextInt();
			System.out.println();
			
			if(opc == 1) {
				System.out.println("O saldo atual é R$ " + String.format("%.2f", saldo));
			}else if(opc == 2) {
				System.out.println("Digite o valor a receber: ");
				double s = sc.nextDouble();
				saldo += s;			
				System.out.println("Saldo atualizado: " + saldo);
			}else if(opc == 3) {
				
				System.out.println("Digite o valor a transferir: ");
				double trans = sc.nextDouble();
				
				if(trans > saldo) {
					System.out.println("Saldo maior do que disponivel. ");
				}else {
					saldo -= trans;
					System.out.println("Valor transferido: " + trans);
					System.out.println("Saldo atualizado: " + saldo);
				}
				
			}else if(opc == 4) {
				System.out.println("Volte Sempre. ");
				break;
			}else {
				System.out.println("Opção inválida. ");
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
