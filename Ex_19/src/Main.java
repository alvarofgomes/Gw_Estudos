public class Main {

	public static void main(String[] args) {
		
		Produto p = new Produto("Feijão", 25);
		
		System.out.println("Valor com desconto: " + p.desconto(10));

	}

}