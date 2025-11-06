public class Main {

	public static void main(String[] args) {
	
		ContaBancaria c = new ContaBancaria();
		ContaCorrente c1 = new ContaCorrente();
		
		c1.setSalario(2000);
		c1.depositar(5000);
		c1.sacar(500);
		c1.cobrarTarifaMensal();
		c1.consultarSaldo();

	}

}
