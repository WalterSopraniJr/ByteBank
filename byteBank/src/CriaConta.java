
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta.");
		} else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println("Endereço de memória da primeira conta: " + primeiraConta);
		System.out.println("Endereço de memória da segunda conta: " + segundaConta);
	}

}
