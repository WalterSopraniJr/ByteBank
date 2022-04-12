
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoUsuario = new Conta();
		contaDoUsuario.saldo = 100;
		contaDoUsuario.deposita(50);
		System.out.println(contaDoUsuario.saldo);
		
	}

}
