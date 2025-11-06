public class ContaCorrente extends ContaBancaria{

	public void cobrarTarifaMensal() {
		setSalario(getSalario() - 50);
		System.out.println("Seu Salario com desconto mensal é: " + getSalario());
	}
	
}