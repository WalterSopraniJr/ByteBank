
public class TesteContas {
	
	public static void main(String[] args) {
		
		Conta contaTeste = new Conta(1337, 23334);
		
		Cliente pedro = new Cliente();
		contaTeste.setTitular(pedro);
		pedro.setNome("Pedro Silva");
		
		contaTeste.deposita(200.00);
		
		System.out.println(contaTeste.getSaldo());
		System.out.println(contaTeste.getAgencia());
		
	}

}
