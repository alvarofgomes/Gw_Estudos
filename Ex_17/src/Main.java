import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria b = new ContaBancaria(12345, 2500, "julio");
		
		b.exibirInfo();
		
		sc.close();
	}

}
