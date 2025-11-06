public class ContaBancaria {

	private int numeroDaConta;
	private double saldo;
	public String titular;
	
	public ContaBancaria(int numeroDaConta, double saldo, String titular) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
		this.titular = titular;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void exibirInfo() {
		System.out.println("numero da conta: " + getNumeroDaConta());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Nome: " + getTitular());
	}
	
}
