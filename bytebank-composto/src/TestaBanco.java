
public class TestaBanco {
	public static void main(String[] args) {
		Cliente walter = new Cliente();
		walter.nome = "Walter Soprani Junior";
		walter.cpf = "222.222.222-22";
		walter.profissao = "dev";
		
		Conta contaDoWalter = new Conta();
		contaDoWalter.deposita(1000);
		
		contaDoWalter.titular = walter;  
		System.out.println(contaDoWalter.titular.nome);
		System.out.println(contaDoWalter.titular);
		System.out.println(walter);
	}

}
