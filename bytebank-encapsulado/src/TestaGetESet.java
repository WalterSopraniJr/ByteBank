
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 154286);
		System.out.println(conta.getNumero());
		
		Cliente walter = new Cliente();
		conta.setTitular(walter);
		walter.setNome("Walter Soprani");
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		
		//observando que tudo chega ao mesmo endereco de memoria
		System.out.println(titularDaConta);
		System.out.println(walter);
		System.out.println(conta.getTitular());
		
		}
}
