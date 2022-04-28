
public class TesteReferencias {
	public static void main(String[] args) {
		
		Gerente james = new Gerente();
		
		james.setNome("James Jones");
		james.setSalario(5000.00);
		
		Supervisor marcelo = new Supervisor();
		marcelo.setSalario(3000.00);		
		
		Funcionario marcos = new Funcionario();
		marcos.setSalario(2000.00);	
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(james);
		controle.registra(marcelo);
		controle.registra(marcos);
		
		System.out.println("Total pago pela empresa em Bonificação: R$ " + controle.getSoma());
	}
}
