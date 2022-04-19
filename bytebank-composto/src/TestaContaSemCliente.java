
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta ContaTeste = new Conta();
		System.out.println(ContaTeste.pegaSaldo());
		
		ContaTeste.titular = new Cliente();		
		System.out.println(ContaTeste.titular);
		
		ContaTeste.titular.nome = "Tester";
		System.out.println(ContaTeste.titular.nome);
	}

}
