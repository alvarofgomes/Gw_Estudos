import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorEmDolares = 10;
		
		double real = 4.94;
		
		double r = valorEmDolares * real;
		
		System.out.println(String.format("%.2f", r));
		
	}

}