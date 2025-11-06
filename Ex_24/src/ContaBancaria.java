public class ContaBancaria {

	private String nome;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void depositar(double d) {
		
		setSalario(getSalario() + d);
		System.out.println("Saldo atual: " + getSalario());
		
	}
	
	public void sacar(double sacar) {
		setSalario(getSalario() - sacar);
		
		System.out.println("Saque: " + sacar);
	}
	
	public void consultarSaldo() {
		System.out.println("Seu saldo: " + getSalario());
	}
	
}