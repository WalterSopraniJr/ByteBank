
public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente james = new Gerente();
		
		james.setNome("James Jones");
		james.setSalario(5000.00);
		
		Supervisor marcelo = new Supervisor();
		marcelo.setSalario(3000.00);		
				
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(james);
		controle.registra(marcelo);
		
		System.out.println("Total pago pela empresa em bonificação: R$ " + controle.getSoma());
	}
}
