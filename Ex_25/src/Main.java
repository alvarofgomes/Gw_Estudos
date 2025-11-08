import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		ArrayList<Pessoa> listaDePessoa = new ArrayList<>();
		
		p.setNome("lula");
		p.setIdade(49);
		
		p1.setNome("bolsonaro");
		p1.setIdade(45);
		
		p2.setNome("haddad");
		p2.setIdade(35);
		
		listaDePessoa.add(p);
		listaDePessoa.add(p1);
		listaDePessoa.add(p2);

		System.out.println("Tamanho da lista: " + listaDePessoa.size());
		System.out.println("Primeira lista da pessoa: " + listaDePessoa.get(0));
		System.out.println("Lista Completa de pessoas: ");
		for(Pessoa pessoa : listaDePessoa) {
			System.out.println(pessoa.toString());
		}
		
	}

}