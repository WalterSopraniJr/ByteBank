
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1325, 242526);
				
		Conta conta2 = new Conta(1325, 242527);		
		
		Conta conta3 = new Conta(1325, 242528);		
		
		System.out.println(Conta.getTotal());
	}

}
