
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoUsuario = new Conta();
		contaDoUsuario.saldo = 100;
		contaDoUsuario.deposita(50);
		System.out.println(contaDoUsuario.saldo);
		
		boolean conseguiuRetirar = contaDoUsuario.saca(20);
		System.out.println(contaDoUsuario.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaBeatriz = new Conta();
		contaBeatriz.deposita(1000);
		boolean sucessoTransferencia = contaBeatriz.transfere(2000, contaDoUsuario);
		if (sucessoTransferencia) {
			System.out.println("Transferência com sucesso");
		} else {
			System.out.println("Faltou dinheiro.");
		}
		System.out.println(contaBeatriz.saldo);
		System.out.println(contaDoUsuario.saldo);
	}

}
