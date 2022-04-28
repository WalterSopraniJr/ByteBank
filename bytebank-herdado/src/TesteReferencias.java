
public class TesteReferencias {
	public static void main(String[] args) {
		
		Funcionario james = new Gerente();
		
		james.setNome("James Jones");
		String nome = james.getNome();
		
		System.out.println(nome);
	}
}
