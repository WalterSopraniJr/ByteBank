
public class DeclaraGerente {
	
	public static void main(String[] args) {
		Gerente walter = new Gerente();
		walter.setNome("Walter Soprani");
		walter.setCpf("222.222.222-22");
		walter.setSalario(4500.00);
		
		System.out.println("Gerente: " + walter.getNome());
		System.out.println("CPF: " + walter.getCpf());
		System.out.println("Salário: " + walter.getSalario());
		
		walter.setSenha(0001);
		boolean autenticou = walter.autentica(0001);
		
		System.out.println(autenticou);
	}

}
